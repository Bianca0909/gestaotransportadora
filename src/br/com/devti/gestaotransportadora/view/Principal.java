package br.com.devti.gestaotransportadora.view;

import br.com.devti.gestaotransportadora.entity.ClienteEntity;
import br.com.devti.gestaotransportadora.service.ClienteService;

public class Principal {

	public static void main(String[] args) {
		ClienteEntity cliente = new ClienteEntity();
		cliente.setName("Bianca");
		cliente.setCpf("11122233344455");
		cliente.setBirthday("2004-05-20");
		cliente.setEmail("Bianca@gmail.com");

		ClienteService cadastroCliente = new ClienteService();
		System.out.println(cadastroCliente.cadastrar(cliente));
	}

}
