package br.com.devti.gestaotransportadora.entity;

import java.math.BigDecimal;

public class ServicoEntity {
	private BigDecimal valor;

	public ServicoEntity(BigDecimal valor) {
		super();
		this.valor = valor;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
