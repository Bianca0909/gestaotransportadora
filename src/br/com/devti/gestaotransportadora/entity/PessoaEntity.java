package br.com.devti.gestaotransportadora.entity;

import java.time.LocalDate;

public abstract class PessoaEntity {
	private String name;
	private String birthday;
	
	public PessoaEntity(String name, String birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public PessoaEntity() {
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
