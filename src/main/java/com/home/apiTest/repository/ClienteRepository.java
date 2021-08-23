package com.home.apiTest.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.home.apiTest.model.Cliente;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String>  {
	
	Optional<Cliente> findByCpf(String cpf);

}
