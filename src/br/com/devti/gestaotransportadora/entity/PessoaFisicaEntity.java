package br.com.devti.gestaotransportadora.entity;

import java.time.LocalDate;

public abstract class PessoaFisicaEntity extends PessoaEntity {
	private String cpf;

	public PessoaFisicaEntity(String name, String birthday, String cpf) {
		super(name, birthday);
		this.cpf = cpf;
	}
   public PessoaFisicaEntity() {
	   
   }
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
