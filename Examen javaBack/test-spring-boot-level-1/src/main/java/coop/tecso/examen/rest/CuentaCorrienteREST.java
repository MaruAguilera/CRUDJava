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

import coop.tecso.examen.model.CuentaCorriente;
import coop.tecso.examen.service.CuentaCorrienteService;

@RestController
@RequestMapping ("/CuentasCorrientes/")
public class CuentaCorrienteREST {

	@Autowired
	private CuentaCorrienteService cuentaCorrienteService;
	
	@GetMapping
	private ResponseEntity<List<CuentaCorriente>> getallCuentaCorriente(){
		return ResponseEntity.ok(cuentaCorrienteService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<CuentaCorriente> saveCuentaCorriente(@RequestBody CuentaCorriente cuentaCorriente){
		
		try {
			CuentaCorriente  cuentaGuardada = cuentaCorrienteService.save(cuentaCorriente);  
			return ResponseEntity.created(new URI("/CuentasCorrientes/"+cuentaGuardada.getId())).body(cuentaGuardada);
		} catch (URISyntaxException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping (value = "delete/{id}") // agregar condicion 
	private ResponseEntity<Boolean> deletePersona (@PathVariable ("id") Long id){
		cuentaCorrienteService.deleteById(id);
		return ResponseEntity.ok(!(cuentaCorrienteService.findById(id)!=null));
		
	}
	
}
