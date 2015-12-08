package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.RelatorioDespesasViagens;
import utilitarios.ConnectionFactory;

/**
 * @author -Filipi
 */
public class RelatorioDespesasViagensDao {

    private final Connection conexao;
    List<RelatorioDespesasViagens> lista = new ArrayList<>();
    private double valorTotalGeral, valorTotalTransporte, valorTotalHospedagem, valorTotalRefeicoes, valorTotalOutrasDespesas, valorTotalTelefonema;

    public RelatorioDespesasViagensDao() {
        conexao = ConnectionFactory.getConnection();
    }

    private String getSql() {
        StringBuilder sqlstr = new StringBuilder();

        sqlstr.append("SELECT").append("\r\n");
        sqlstr.append("Config,").append("\r\n");
        sqlstr.append("codRelatorio,").append("\r\n");
        sqlstr.append("codDespesa,").append("\r\n");
        sqlstr.append("codTipoDespesa,").append("\r\n");
        sqlstr.append("documento,").append("\r\n");
        sqlstr.append("dataDocumento,").append("\r\n");
        sqlstr.append("historico1||").append("\r\n");
        sqlstr.append("nvl (historico2,'') as historico,").append("\r\n");
        sqlstr.append("diasHospedagem,").append("\r\n");
        sqlstr.append("valorDespesa").append("\r\n");
        sqlstr.append("FROM Natreb_ATecnica.RelatDespesa").append("\r\n");
        sqlstr.append("WHERE").append("\r\n");
        sqlstr.append("Config = 1 AND").append("\r\n");
        sqlstr.append("dataDocumento BETWEEN to_date(?,'dd/MM/yyyy') AND to_date(?,'dd/MM/yyyy')");

        return sqlstr.toString();
    }

    public List<RelatorioDespesasViagens> getLista(String dataInicial, String dataFinal) {
        PreparedStatement ps;
        try {
            ps = conexao.prepareStatement(getSql());
            ps.setString(1, dataInicial);
            ps.setString(2, dataFinal);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                RelatorioDespesasViagens relatorio = new RelatorioDespesasViagens();

                relatorio.setCodRelatorio(rs.getInt("codRelatorio"));
                relatorio.setCodDespesa(rs.getInt("codDespesa"));
                relatorio.setCodTipoDespesa(rs.getInt("codTipoDespesa"));
                relatorio.setDataDocumento(rs.getDate("dataDocumento"));
                relatorio.setDocumentDespesa(rs.getString("documento"));
                relatorio.setHistorico(rs.getString("historico"));
                relatorio.setDiasHospedagem(rs.getInt("diasHospedagem"));
                relatorio.setValorDespesa(rs.getFloat("valorDespesa"));

                lista.add(relatorio);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Período inválido!\n");
        }

        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há dados para consulta\n");

        }

        return lista;
    }

    public double getValorTotalHospedagem() {
        for (RelatorioDespesasViagens relatorio : lista) {
            if (relatorio.getCodTipoDespesa() == 2) {
                valorTotalHospedagem += relatorio.getValorDespesa();
            }
        }
        return valorTotalHospedagem;
    }

    public double getValorTotalRefeicoes() {
        for (RelatorioDespesasViagens relatorio : lista) {
            if (relatorio.getCodTipoDespesa() == 3) {
                valorTotalRefeicoes += relatorio.getValorDespesa();
            }
        }
        return valorTotalRefeicoes;
    }

    public double getValorTotalTransporte() {
        for (RelatorioDespesasViagens relatorio : lista) {
            if (relatorio.getCodTipoDespesa() == 1 | relatorio.getCodTipoDespesa() == 4) {
                valorTotalTransporte += relatorio.getValorDespesa();
            }
        }
        return valorTotalTransporte;
    }

    public double getValorTotalTelefonema() {
        for (RelatorioDespesasViagens relatorio : lista) {
            if (relatorio.getCodTipoDespesa() == 7) {
                valorTotalTelefonema += relatorio.getValorDespesa();
            }
        }
        return valorTotalTelefonema;
    }

    public double getValorTotalOutrasDespesas() {
        for (RelatorioDespesasViagens relatorio : lista) {
            if (relatorio.getCodTipoDespesa() == 6) {
                valorTotalOutrasDespesas += relatorio.getValorDespesa();
            }
        }
        return valorTotalOutrasDespesas;
    }

    public double getValorTotalGeral() {
        for (RelatorioDespesasViagens relatorio : lista) {
            valorTotalGeral += relatorio.getValorDespesa();
        }
        return valorTotalGeral;
    }
}
