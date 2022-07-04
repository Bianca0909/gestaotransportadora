package br.com.devti.gestaotransportadora.entity;

import java.time.LocalDate;

public class ColaboradorEntity extends PessoaFisicaEntity {
	private String pis;

	public ColaboradorEntity(String name, LocalDate birthday, String cpf, String pis) {
		super(name, birthday, cpf);
		this.pis = pis;
	}

	public String getPis() {
		return pis;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}

}
