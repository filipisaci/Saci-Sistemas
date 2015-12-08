package modelo;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author filipi
 */
public class RelatorioDespesasViagensTableModel extends AbstractTableModel {

    private static final int CODIGO_RELATORIO = 0;
    private static final int CODIGO_DESPESA = 1;
    private static final int TIPO_DESPESA = 2;
    private static final int DATA_DOCUMENTO = 3;
    private static final int DOCUMENTO_DESPESA = 4;
    private static final int HISTORICO = 5;
    private static final int DIAS_HOSPEDAGEM = 6;
    private static final int VALOR_DESPESA = 7;

    private final List<RelatorioDespesasViagens> lista;
    private final String[] colunas = new String[]{"Relatório", "Seq Lanç",
        "Despesa", "Data", "Documento", "Histórico", "Dias", "Valor"};

    public RelatorioDespesasViagensTableModel(List<RelatorioDespesasViagens> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        RelatorioDespesasViagens relatorio = lista.get(linha);
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        DecimalFormat decimal = new DecimalFormat("0.00");

        switch (coluna) {
            case CODIGO_RELATORIO:
                if (relatorio.getCodRelatorio() == null) {
                    return "";
                } else {
                    return relatorio.getCodRelatorio();
                }
            case CODIGO_DESPESA:
                if (relatorio.getCodDespesa() == null) {
                    return "";
                } else {
                    return relatorio.getCodDespesa();
                }
            case TIPO_DESPESA:
                switch (relatorio.getCodTipoDespesa()){
                    case 1:
                        return "Combustível";
                    case 2:
                        return "Hotel";
                    case 3:
                        return "Refeições";
                    case 4:
                        return "Pedágio";
                    case 5:
                        return "Telefonema";
                    case 6:
                        return "Outros";
                    default:
                        return "";
                }
            case DATA_DOCUMENTO:
                if (relatorio.getDataDocumento() == null) {
                    return "";
                } else {
                    return dataFormatada.format(relatorio.getDataDocumento().getTime());

                }
            case DOCUMENTO_DESPESA:
                return relatorio.getDocumentDespesa();
            case HISTORICO:
                return relatorio.getHistorico();
            case DIAS_HOSPEDAGEM:
                return relatorio.getDiasHospedagem();
            case VALOR_DESPESA:
                if (relatorio.getValorDespesa() == null) {
                    return "";
                } else {
                    return "R$ " + decimal.format(relatorio.getValorDespesa());
                }
        }
        return "";
    }

    @Override
    public String getColumnName(int indiceColuna) {
        return colunas[indiceColuna];
    }

    @Override
    public Class<?> getColumnClass(int indiceColuna) {
        switch (indiceColuna) {
            case CODIGO_RELATORIO:
                return Integer.class;
            case CODIGO_DESPESA:
                return Integer.class;
            case TIPO_DESPESA:
                return String.class;
            case DATA_DOCUMENTO:
                return String.class;
            case DOCUMENTO_DESPESA:
                return String.class;
            case HISTORICO:
                return String.class;
            case DIAS_HOSPEDAGEM:
                return Integer.class;
            case VALOR_DESPESA:
                return String.class;
            default:
                throw new IndexOutOfBoundsException(
                        "Ultrapassado o limete de colunas!");
        }
    }
}
