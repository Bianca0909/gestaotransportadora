package br.com.devti.gestaotransportadora.entity;

import java.time.LocalDate;

public class ClienteEntity extends PessoaFisicaEntity{
	private String email;

	public ClienteEntity(String name, String birthday, String cpf, String email) {
		super(name, birthday, cpf);
		this.email = email;
	}
   public ClienteEntity() {
	
   }
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
