package br.com.devti.gestaotransportadora.entity;

import java.time.LocalDate;

public abstract class PessoaEntity {
	private String name;
	private LocalDate birthday;
	
	public PessoaEntity(String name, LocalDate birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

}
