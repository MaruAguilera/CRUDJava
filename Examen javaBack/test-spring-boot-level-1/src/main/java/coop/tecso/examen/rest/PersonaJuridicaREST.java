package coop.tecso.examen.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import coop.tecso.examen.model.PersonaJuridica;
import coop.tecso.examen.service.PersonaJuridicaService;

@RestController
@RequestMapping ("/PersonaJuridica/")
public class PersonaJuridicaREST {
 
	@Autowired
	private PersonaJuridicaService  personaJuridicaService;
	
	@GetMapping
	private ResponseEntity<List<PersonaJuridica>> getAllPersonaJuridica(){
		return ResponseEntity.ok(personaJuridicaService.findAll());
		
	}
	@PostMapping
	private ResponseEntity<PersonaJuridica> savePersonaJuridica(@RequestBody PersonaJuridica personaJuridica){
	
		try {
			PersonaJuridica  personaGuardada = personaJuridicaService.save(personaJuridica); 
			return ResponseEntity.created(new URI("/PersonaJuridica/"+personaGuardada.getId())).body(personaGuardada);
		} catch (URISyntaxException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deletePersona (@PathVariable ("id") Long id){
		personaJuridicaService.deleteById(id);
		return ResponseEntity.ok(!(personaJuridicaService.findById(id)!=null));
		
	}
	
}
