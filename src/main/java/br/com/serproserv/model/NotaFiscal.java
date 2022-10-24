package br.com.serproserv.model;

public class NotaFiscal {

	public Integer id;
	public String cnpj;
	public String inscricaoEstuadual;
	public Double baseCalculoIcms;
	public Double valorIcms;
	public Double valorTotalNota;
	public Boolean notaFiscalValida;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscricaoEstuadual() {
		return inscricaoEstuadual;
	}
	public void setInscricaoEstuadual(String inscricaoEstuadual) {
		this.inscricaoEstuadual = inscricaoEstuadual;
	}
	public Double getBaseCalculoIcms() {
		return baseCalculoIcms;
	}
	public void setBaseCalculoIcms(Double baseCalculoIcms) {
		this.baseCalculoIcms = baseCalculoIcms;
	}
	public Double getValorIcms() {
		return valorIcms;
	}
	public void setValorIcms(Double valorIcms) {
		this.valorIcms = valorIcms;
	}
	public Double getValorTotalNota() {
		return valorTotalNota;
	}
	public void setValorTotalNota(Double valorTotalNota) {
		this.valorTotalNota = valorTotalNota;
	}
	public Boolean getNotaFiscalValida() {
		return notaFiscalValida;
	}
	public void setNotaFiscalValida(Boolean notaFiscalValida) {
		this.notaFiscalValida = notaFiscalValida;
	}

	
	
}
