package br.com.devti.gestaotransportadora.entity;

import java.time.LocalDate;

public class FornecedorEntity extends PessoaJuridicaEntity {
	private String site;

	public FornecedorEntity(String name, LocalDate birthday, String cnpj, String site) {
		super(name, birthday, cnpj);
		this.site = site;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

}
