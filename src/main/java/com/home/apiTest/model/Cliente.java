package com.home.apiTest.model;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Document
public class Cliente {

	@Id
	private String id;
	
	@NotBlank(message = "{notBlank}")
	private String nome;
	
	private String sexo;
	
	@Email(message = "{email}")
	@Size(max = 200)
	private String email;
		
	private String naturalidade;
	
	private String nacionalidade;
	
	@NotBlank(message = "{notBlank}")
	@Size(max = 14)
	private String cpf;
	
	@NotNull(message = "{notNull}")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate data_nascimento;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate data_cadastro;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate data_atualizacao;
	
	
	
}
