package br.com.ifms.tads.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifms.tads.repository.AlunoRepository;

@RestController //essa classe vai ser uma classe exposta de api
@RequestMapping(value="/api")
public class AlunoResource {

	@Autowired
	AlunoRepository repository;
	
	
	
	@GetMapping(value= "/mensagem") //localhost:8080/api/mensagem
	public String mensagem() {
		
		
		return "Ola";
		
	} 
	@GetMapping(value="/somar")
	
	public Double somar(@RequestParam double n1 ,@RequestParam double n2) {
		return n1 + n2;
	}
	
	
}
