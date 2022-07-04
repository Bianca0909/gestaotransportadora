package br.com.devti.gestaotransportadora.entity;

public class VeiculoEntity {
	private String placa; // Validar placa

	public VeiculoEntity(String placa) {
		super();
		this.placa = placa;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}
