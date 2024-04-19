package com.msprocuradores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msprocuradores.entity.Procuradores;
import com.msprocuradores.logic.ProcuradoresLogic;
import com.msprocuradores.request.ProcuradoresRequest;

@RestController
@RequestMapping("procuradores")
public class ProcuradoresController {

	//Instanciamos a ProcuradoresLogic para utilizar sus métodos
	@Autowired
	ProcuradoresLogic service;
	
	//htttp:localhost:8090:/procuradores/mostrar
	@GetMapping("mostrar")
	public ResponseEntity<List<Procuradores>> mostrar(){
		//Recuperamos la lista de la bd en una nueva lista para mostrar al usuario
		List<Procuradores> lista = service.mostrar();
		return new ResponseEntity<List<Procuradores>>(lista, HttpStatus.OK);
	}
	
	//htttp:localhost:8090:/procuradores/guardar
	@PostMapping("guardar")
	public ResponseEntity<Procuradores> guardar(@RequestBody ProcuradoresRequest request){
		Procuradores procurador = service.guardar(request);
		return new ResponseEntity<Procuradores>(procurador, HttpStatus.OK);
	}
	
	//htttp:localhost:8090:/procuradores/editar
	@PutMapping("editar")
	public ResponseEntity<Procuradores> editar(@RequestBody ProcuradoresRequest request){
		Procuradores procurador = service.editar(request);
		return new ResponseEntity<Procuradores>(procurador, HttpStatus.OK);
	}
	
	//htttp:localhost:8090:/procuradores/buscar/id
	@GetMapping("buscar/{id}")
	public ResponseEntity<Procuradores> buscar(@PathVariable int id){
		Procuradores procurador = service.buscar(id);
		return new ResponseEntity<Procuradores>(procurador, HttpStatus.OK);
	}
	
	//htttp:localhost:8090:/procuradores/eliminar/id
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id){
		String procurador = service.eliminar(id);
		return new ResponseEntity<String>(procurador, HttpStatus.OK);
	}
}
