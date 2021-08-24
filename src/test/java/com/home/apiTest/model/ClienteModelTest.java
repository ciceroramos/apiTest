package com.home.apiTest.model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.home.apiTest.model.Cliente;

class ClienteModelTest {

	Cliente cliente;
	
	@BeforeEach
	void setUp() {
	  cliente = new Cliente();
	  cliente.setCpf("02145879632");
	  cliente.setNome("nome_teste");
	  cliente.setEmail("email@email.com");
	  cliente.setNaturalidade("cidade-estado");
	  cliente.setNacionalidade("pais");
	  cliente.setSexo("sexo");
	  cliente.setData_nascimento(LocalDate.now());
	  cliente.setData_cadastro(LocalDate.now());
	  cliente.setData_atualizacao(LocalDate.now());	
	
	}
	
	@Test
	void getCpf() {
	  assertEquals("02145879632", cliente.getCpf());	
	}
	
	@Test
	void setCpf() {
		cliente.setCpf("02145879632");
		assertEquals("02145879632", cliente.getCpf());
	}
	
	@Test
	void getNome() {
		assertEquals("nome_teste", cliente.getNome());
	}
	
	@Test
	void setNome() {
		cliente.setNome("nome_teste");
		assertEquals("nome_teste", cliente.getNome());
	}

	@Test
	void getEmail() {
		assertEquals("email@email.com", cliente.getEmail());
	}
	
	@Test
	void setEmail() {
		cliente.setEmail("email@email.com");
		assertEquals("email@email.com", cliente.getEmail());
	}
	
	@Test
	void getNaturalidade() {
		assertEquals("cidade-estado", cliente.getNaturalidade());
	}
	
	@Test
	void setNaturalidade() {
		cliente.setNaturalidade("cidade-estado");
		assertEquals("cidade-estado", cliente.getNaturalidade());
	}
	
	@Test
	void getNacionalidade() {
		assertEquals("pais", cliente.getNacionalidade());
	}
	
	@Test
	void setNacionalidade() {
		cliente.setNacionalidade("pais");
		assertEquals("pais", cliente.getNacionalidade());
	}
	
	@Test
	void getSexo() {
		assertEquals("sexo", cliente.getSexo());
	}
	
	@Test
	void setSexo() {
		cliente.setSexo("sexo");
		assertEquals("sexo", cliente.getSexo());
	}
	
	@Test
	void getDataNascimento() {
		assertEquals(LocalDate.now(), cliente.getData_nascimento());
	}
	
	@Test
	void setDataNascimento() {
		cliente.setData_nascimento(LocalDate.now());
		assertEquals(LocalDate.now(), cliente.getData_nascimento());
	}
	
	@Test
	void getDataCadastro() {
		assertEquals(LocalDate.now(), cliente.getData_cadastro());
	}
	
	@Test
	void setDataCadastro() {
		cliente.setData_cadastro(LocalDate.now());
		assertEquals(LocalDate.now(), cliente.getData_cadastro());
	}
	
	@Test
	void getDataAtualizacao() {
		assertEquals(LocalDate.now(), cliente.getData_cadastro());
	}
	
	@Test
	void setDataAtualizacao() {
		cliente.setData_atualizacao(LocalDate.now());
		assertEquals(LocalDate.now(), cliente.getData_atualizacao());
	}
	
	
}
