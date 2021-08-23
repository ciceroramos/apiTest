package com.home.apiTest.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.home.apiTest.model.Cliente;
import com.home.apiTest.repository.ClienteRepository;
import com.home.apiTest.service.ClienteService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags="Cliente")
@RestController
@RequestMapping("cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ClienteService clienteService;	
	
	LocalDate localDate =LocalDate.now();
	
	@ApiOperation(value = "Listar Todos")
	@GetMapping("/lista")
	public List<Cliente> listarTodos() {
		return clienteRepository.findAll();
	}	
	
	@ApiOperation(value = "Pesquisar por CPF")
	@GetMapping("/cpf/{cpf}")
	public ResponseEntity<Cliente> buscaPorCpf(@PathVariable String cpf) {
		Optional<Cliente> cliente = clienteRepository.findByCpf(cpf);
		return cliente.isPresent() ? ResponseEntity.ok(cliente.get()) : ResponseEntity.notFound().build();
	}	
	
	@ApiOperation(value = "Cadastrar Cliente")
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)    //cadastrar cliente
	public ResponseEntity<Cliente> cadastrar(@Valid @RequestBody Cliente cliente) {  
		cliente.setData_cadastro(localDate);
		System.out.println("fez post");
		
		Cliente clienteSalvo = clienteService.cadastrar(cliente); 
		return ResponseEntity.ok(clienteSalvo);
	}
	
	@ApiOperation(value = "Editar Cliente")
	@PutMapping ("/{idCliente}")  //alterar cliente
	public ResponseEntity<Cliente> editar(@PathVariable String idCliente, @Valid @RequestBody Cliente cliente) {

		if(!clienteRepository.existsById(idCliente)) {
			return ResponseEntity.notFound().build();
		}		
		cliente.setId(idCliente);
		cliente.setData_atualizacao(localDate);
		cliente = clienteService.editar(cliente);
		
		return ResponseEntity.ok(cliente);

	}
	
	@ApiOperation(value = "Excluir Cliente")
	@DeleteMapping("/{clienteId}") //excluir cliente
	public ResponseEntity<Void> remover(@PathVariable String clienteId) {
		if (!clienteRepository.existsById(clienteId)) {
			return ResponseEntity.notFound().build();
		}
		clienteService.excluir(clienteId);

		return ResponseEntity.noContent().build();
	}
	
	
}
