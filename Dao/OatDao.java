package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import modelo.Oat;

/**
 * @author filipi
 */
public class OatDao {

    private final Connection conexao;
    List<OatDao> listaOat = new ArrayList<>();
    //private int index;

    public OatDao() {
            conexao = utilitarios.ConnectionFactory.getConnection();
    }

    private String getSql() {

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT SolicitATecnica.codSAT,").append("\r\n");
        sb.append("SolicitATecnica.dataAbertura,").append("\r\n");
        sb.append("SolicitATecnica.problema1||").append("\r\n");
        sb.append("nvl(SolicitATecnica.problema2,'')||").append("\r\n");
        sb.append("nvl(SolicitATecnica.problema3,'')||").append("\r\n");
        sb.append("nvl(SolicitATecnica.problema4,'')||").append("\r\n");
        sb.append("nvl(SolicitATecnica.problema5,'')||").append("\r\n");
        sb.append("nvl(SolicitATecnica.problema6,'') as problema,").append("\r\n");
        sb.append("SolicitATecnica.nomeSolicit,").append("\r\n");
        sb.append("SolicitATecnica.codClienteSolicit,").append("\r\n");
        sb.append("SolicitATecnica.fantasiaCliente,").append("\r\n");
        sb.append("SolicitATecnica.codNumSerie,").append("\r\n");
        sb.append("SolicitATecnica.descricaoMaquina1,").append("\r\n");
        sb.append("SolicitATecnica.descricaoMaquina2,").append("\r\n");
        sb.append("SolicitATecnica.descricaoMaquina3,").append("\r\n");
        sb.append("SolicitATecnica.descricaoMaquina4,").append("\r\n");
        sb.append("SolicitATecnica.codOAT,").append("\r\n");
        sb.append("SolicitATecnica.servicoExecutado").append("\r\n");
        sb.append(" FROM Natreb_ATecnica.SolicitATecnica").append("\r\n");
        sb.append(" WHERE SolicitATecnica.codOAT = ?").append("\r\n");
        return sb.toString();
    }

    public Oat getLista(String codOAT) throws SQLException, ParseException {
        Oat oatCliente = new Oat();

        //setando o codOAT que ele recebe por parametro do pesquisar
        try ( //Prepara a conexao
                PreparedStatement stmt = conexao.prepareStatement(getSql())) {
            //setando o codOAT que ele recebe por parametro do pesquisar
            stmt.setString(1, codOAT);
            
            // metodo que fica lendo enquanto existir o proximo e vai adicionando numa lista da memoria
            try ( //Objeto que faz a busca no banco
                    ResultSet rs = stmt.executeQuery()) {
                // metodo que fica lendo enquanto existir o proximo e vai adicionando numa lista da memoria
                while (rs.next()) {
                    
                    oatCliente.setCodOAT(Integer.valueOf(rs.getString("codOAT")));
                    oatCliente.setCodSAT(Integer.valueOf(rs.getString("CodSAT")));
                    oatCliente.setDataAbertura(rs.getDate("dataAbertura"));
                    oatCliente.setDescricaoMaquina1(rs.getString("descricaoMaquina1"));
                    oatCliente.setDescricaoMaquina2(rs.getString("descricaoMaquina2"));
                    oatCliente.setDescricaoMaquina3(rs.getString("descricaoMaquina3"));
                    oatCliente.setDescricaoMaquina4(rs.getString("descricaoMaquina4"));
                    oatCliente.setProblema(rs.getString("problema"));
                    oatCliente.setNomeSolicit(rs.getString("nomeSolicit"));
                    oatCliente.setCodClienteSolicit(Integer.valueOf(rs.getString("codClienteSolicit")));
                    oatCliente.setFantasiaCliente(rs.getString("fantasiaCliente"));
                    oatCliente.setCodNumSerie(rs.getString("codNumSerie"));
                    oatCliente.setServicoExecutado(rs.getString("servicoExecutado"));
                }
            }
        }
        return oatCliente;
    }

}
