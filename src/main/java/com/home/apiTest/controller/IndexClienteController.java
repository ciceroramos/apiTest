package com.home.apiTest.controller;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.home.apiTest.model.Cliente;
import com.home.apiTest.service.ClienteService;

@Controller
public class IndexClienteController {
	
	@Autowired
	private ClienteService clienteService;	
	
	LocalDate localDate =LocalDate.now();

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/cadastrarCliente", method=RequestMethod.GET)
	public String form(){
		return "index";
	}
	
	@RequestMapping(value = "/cadastrarCliente", method = RequestMethod.POST)    //cadastrar cliente
	public String cadastrar(@Valid Cliente cliente, BindingResult result, RedirectAttributes attributes) {  
		if(result.hasErrors()){
			attributes.addFlashAttribute("mensagem", "Verifique os campos!");
			return "redirect:/cadastrarCliente";
		}
		cliente.setData_cadastro(localDate);
		clienteService.cadastrar(cliente); 
		attributes.addFlashAttribute("mensagem", "Cliente Cadastrado com sucesso");
		
		return "redirect:/cadastrarCliente";
	}
	
}
