package br.com.devti.gestaotransportadora.entity;

import java.time.LocalDate;

public class Entregador extends PessoaFisicaEntity {
	private String cnh;

	public Entregador(String name, LocalDate birthday, String cpf, String cnh) {
		super(name, birthday, cpf);
		this.cnh = cnh;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

}
