package com.home.apiTest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.home.apiTest.exception.NegocioException;
import com.home.apiTest.model.Cliente;
import com.home.apiTest.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Transactional
	public Cliente cadastrar(Cliente cliente) {
		Optional<Cliente> cpfUso = clienteRepository.findByCpf(cliente.getCpf());
		if (cpfUso.isPresent()) {
			throw new NegocioException("Ja existe um cliente cadastrado com este cpf.");
		}

		return clienteRepository.save(cliente);
		
	}
	
	@Transactional
	public void excluir(String idCliente) {
		clienteRepository.deleteById(idCliente);
	}

	@Transactional
	public Cliente editar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	
}
