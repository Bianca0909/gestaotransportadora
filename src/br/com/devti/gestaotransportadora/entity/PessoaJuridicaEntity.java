package br.com.devti.gestaotransportadora.entity;

import java.time.LocalDate;

public abstract class PessoaJuridicaEntity extends PessoaEntity {
	private String cnpj;

	public PessoaJuridicaEntity(String name, String birthday, String cnpj) {
		super(name, birthday);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
