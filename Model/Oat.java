/*
Esta classe modela um OAT - Ordem de Assistência Técnica
Uma ordem de assistência técnica, deve sempre ter uma SAT - Solicitação de 
Assistência ténica.
São utilizadas estas ordens para deslocar um operador nosso até o cliente
para executar um serviço de assistênica técnica.
*/
package modelo;

import java.sql.Date;

/**
 * @author filipi
 */
public class Oat {

    private Integer codSAT;
    private Date dataAbertura;
    private String problema;
    private String nomeSolicit;
    private Integer codClienteSolicit;
    private String fantasiaCliente;
    private String codNumSerie;
    private String descricaoMaquina1;
    private String descricaoMaquina2;
    private String descricaoMaquina3;
    private String descricaoMaquina4;
    private Integer codOAT;
    private String servicoExecutado;

    public Oat() {
    }

    public Integer getCodSAT() {
        return codSAT;
    }

    public void setCodSAT(Integer codSAT) {
        this.codSAT = codSAT;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getNomeSolicit() {
        return nomeSolicit;
    }

    public void setNomeSolicit(String nomeSolicit) {
        this.nomeSolicit = nomeSolicit;
    }

    public Integer getCodClienteSolicit() {
        return codClienteSolicit;
    }

    public void setCodClienteSolicit(Integer codClienteSolicit) {
        this.codClienteSolicit = codClienteSolicit;
    }

    public String getFantasiaCliente() {
        return fantasiaCliente;
    }

    public void setFantasiaCliente(String fantasiaCliente) {
        this.fantasiaCliente = fantasiaCliente;
    }

    public String getCodNumSerie() {
        return codNumSerie;
    }

    public void setCodNumSerie(String codNumSerie) {
        this.codNumSerie = codNumSerie;
    }

    public Integer getCodOAT() {
        return codOAT;
    }

    public void setCodOAT(Integer codOAT) {
        this.codOAT = codOAT;
    }

    public String getServicoExecutado() {
        return servicoExecutado;
    }

    public void setServicoExecutado(String servicoExecutado) {
        this.servicoExecutado = servicoExecutado;
    }

    public String getDescricaoMaquina1() {
        return this.descricaoMaquina1;
    }

    public void setDescricaoMaquina1(String descricaoMaquina1) {
        this.descricaoMaquina1 = descricaoMaquina1;
    }

    public String getDescricaoMaquina2() {
        return this.descricaoMaquina2;
    }

    public void setDescricaoMaquina2(String descricaoMaquina2) {
        this.descricaoMaquina2 = descricaoMaquina2;
    }

    public String getDescricaoMaquina3() {
        return this.descricaoMaquina3;
    }

    public void setDescricaoMaquina3(String descricaoMaquina3) {
        this.descricaoMaquina3 = descricaoMaquina3;
    }

    public String getDescricaoMaquina4() {
        return this.descricaoMaquina4;
    }

    public void setDescricaoMaquina4(String descricaoMaquina4) {
        this.descricaoMaquina4 = descricaoMaquina4;
    }
}
