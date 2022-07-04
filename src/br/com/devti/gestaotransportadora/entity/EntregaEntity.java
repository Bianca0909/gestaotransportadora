package br.com.devti.gestaotransportadora.entity;

public class EntregaEntity {
	private String endereço;

	public EntregaEntity(String endereço) {
		super();
		this.endereço = endereço;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

}
