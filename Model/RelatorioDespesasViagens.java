/*
Esta classe modela um Relatório de Despesas de Viagem.
Este relatório acompanha um técnico até o cliente, utiliza-se este
documento para lançar suas despesas e fechar o saldo.
*/
package modelo;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * @author -Filipi
 */
public class RelatorioDespesasViagens {

    private Integer codRelatorio;
    private Integer codDespesa;
    private Integer codTipoDespesa;
    private String documentDespesa;
    private Integer diasHospedagem;
    private String historico;
    private Date dataDocumento;
    private Float valorDespesa;

    public RelatorioDespesasViagens() {
    }

    public Integer getCodRelatorio() {
        return codRelatorio;
    }

    public void setCodRelatorio(Integer codRelatorio) {
        this.codRelatorio = codRelatorio;
    }

    public Integer getCodDespesa() {
        return codDespesa;
    }

    public void setCodDespesa(Integer codDespesa) {
        this.codDespesa = codDespesa;
    }

    public Integer getCodTipoDespesa() {
        return codTipoDespesa;
    }

    public void setCodTipoDespesa(Integer codTipoDespesa) {
        this.codTipoDespesa = codTipoDespesa;
    }

    public String getDocumentDespesa() {
        return documentDespesa;
    }

    public void setDocumentDespesa(String documentDespesa) {
        this.documentDespesa = documentDespesa;
    }

    public Integer getDiasHospedagem() {
        return diasHospedagem;
    }

    public void setDiasHospedagem(Integer diasHospedagem) {
        this.diasHospedagem = diasHospedagem;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public Date getDataDocumento() {
        return dataDocumento;
    }

    public void setDataDocumento(Date dataDocumento) {
        this.dataDocumento = dataDocumento;
    }

    public Float getValorDespesa() {
        return valorDespesa;
    }

    public void setValorDespesa(Float valorDespesa) {
        this.valorDespesa = valorDespesa;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RelatorioDespesasViagens) {
            return this.codRelatorio.equals(((RelatorioDespesasViagens) obj).getCodRelatorio());
        }
        return false;
    }

    @Override
    public String toString() {
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        return "| Código Relatório de Despesa: " + getCodRelatorio() + " | "
                + "Sequência da Despesa: " + getCodDespesa() + " | "
                + "Tipo Despesa: " + getCodTipoDespesa() + " | "
                + "Data Documento: " + dataFormatada.format(getDataDocumento()) + " | "
                + "Documento Despesa: " + getDocumentDespesa() + " | "
                + "Histórico: " + getHistorico() + " | "
                + "Dias de Hospedagem: " + getDiasHospedagem() + " | "
                + "Valor da Despesa: " + getValorDespesa() + " | ";
    }
}
