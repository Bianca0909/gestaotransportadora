package br.com.devti.gestaotransportadora.service;

import br.com.devti.gestaotransportadora.entity.ClienteEntity;
import br.com.devtigestaotransportadora.bo.ClienteBO;

public class ClienteService {

	public Boolean validarCpf() {
		return true;
	}

	public String cadastrar(ClienteEntity cliente) {
		ClienteBO bo = new ClienteBO();
		return bo.salvarCliente(cliente);
}

	public void excluir() {
		// código aqui
	}

	public void alterar() {
		// código aqui
	}

}
