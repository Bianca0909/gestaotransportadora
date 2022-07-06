package br.com.devtigestaotransportadora.bo;

import br.com.devti.gestaotransportadora.DAO.ClienteDAO;
import br.com.devti.gestaotransportadora.entity.ClienteEntity;

public class ClienteBO {

	public String salvarCliente(ClienteEntity cliente) {
		System.out.println("Cadastrando usuário...");
		
		ClienteDAO clienteDao = new ClienteDAO();
		return clienteDao.salvarCliente(cliente);
	}

	
	}
