package br.com.devti.gestaotransportadora.entity;

public class ClienteEntity {
	private String email;

	public ClienteEntity(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
