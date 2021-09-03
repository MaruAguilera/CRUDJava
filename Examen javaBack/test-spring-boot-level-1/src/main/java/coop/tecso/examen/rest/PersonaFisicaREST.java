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

import coop.tecso.examen.model.PersonaFisica;
import coop.tecso.examen.service.PersonaFisicaService;


@RestController
@RequestMapping ("/PersonaFisica/")
public class PersonaFisicaREST {
	
	@Autowired
	private PersonaFisicaService  personaFisicaService;
	
	@GetMapping
	private ResponseEntity<List<PersonaFisica>> getAllPersonaFisica(){
		return ResponseEntity.ok(personaFisicaService.findAll());
	}	
	
	@PostMapping
	private ResponseEntity<PersonaFisica> savePersonaFisica(@RequestBody PersonaFisica personaFisica){
		
		try {
			PersonaFisica  personaGuardada = personaFisicaService.save(personaFisica); 
			//agregar logica para que los rut no sean iguales entre clientes
			return ResponseEntity.created(new URI("/PersonaFisica/"+personaGuardada.getId())).body(personaGuardada);
		} catch (URISyntaxException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deletePersona (@PathVariable ("id") Long id){
		personaFisicaService.deleteById(id);
		return ResponseEntity.ok(!(personaFisicaService.findById(id)!=null));
		
	}
	
}
