package com.home.apiTest.exceptionhandler;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(Include.NON_NULL) // nao inclui os campos que estao nulos
@Getter
@Setter
public class Problema {

	private Integer status;
	private LocalDateTime dataHora;
	private String titulo;
	private List<Campo> campos;

	@AllArgsConstructor
	@Getter
	public static class Campo {
			
			private String nome;
			private String mensagem;
	}
	
}
