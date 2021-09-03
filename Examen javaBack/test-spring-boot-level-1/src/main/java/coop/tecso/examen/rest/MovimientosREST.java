package coop.tecso.examen.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coop.tecso.examen.model.Movimientos;
import coop.tecso.examen.service.MovimientosService;

@RestController
@RequestMapping ("/Movimientos/")
public class MovimientosREST  {
	
	@Autowired
	private MovimientosService movimientosService;
	
	
	@GetMapping
	private ResponseEntity<List<Movimientos>> getAllMovimientos(){
		return ResponseEntity.ok(movimientosService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<Movimientos> saveCuentaCorriente(@RequestBody Movimientos movimientos){
		
		try {
			Movimientos  movimientoGuardado = movimientosService.save(movimientos);  
			return ResponseEntity.created(new URI("/CuentasCorrientes/"+movimientoGuardado.getId())).body(movimientoGuardado);
		} catch (URISyntaxException e) {                              
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	

}
