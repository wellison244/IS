package br.unibh.pessoa.entidades;

import java.util.Date;

public class PessoaJuridica extends Pessoa{
	public PessoaJuridica(Long id, String nome, String endereco, String telefone, Date dataConstituicao, String site) {
		super(id, nome, endereco, telefone);
		this.dataConstituicao = dataConstituicao;
		this.site = site;
	}
	public PessoaJuridica(Long id, String nome, String endereco, String telefone, String cnpj) {
		super(id, nome, endereco, telefone);
		this.cnpj = cnpj;
	}
	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", dataConstituicao=" + dataConstituicao + ", site=" + site
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	public PessoaJuridica(Long id, String nome, String endereco, String telefone) {
		super(id, nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Date getDataConstituicao() {
		return dataConstituicao;
	}
	public void setDataConstituicao(Date dataConstituicao) {
		this.dataConstituicao = dataConstituicao;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	private String cnpj;
	private Date dataConstituicao;
	private String site;

}
