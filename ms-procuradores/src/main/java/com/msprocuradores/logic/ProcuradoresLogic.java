package com.msprocuradores.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msprocuradores.entity.Procuradores;
import com.msprocuradores.repository.ProcuradoresRepository;
import com.msprocuradores.request.ProcuradoresRequest;
import com.msprocuradores.service.ProcuradoresService;

@Service
public class ProcuradoresLogic implements ProcuradoresService{
	
	
	//Instanciamos al DAO para utilizar métodos de ProcuradoresRespository
	@Autowired
	ProcuradoresRepository dao;

	@Override
	public Procuradores guardar(ProcuradoresRequest request) {
		//Instanciamos un "Procurador" global
		Procuradores procurador = new Procuradores();
		
		//Valores que vamos a guardar
		procurador.setIdProcurador(request.getIdProcurador());
		procurador.setNombre(request.getNombre());
		procurador.setDireccion(request.getDireccion());
		procurador.setTelefono(request.getTelefono());
		procurador.setHonorarios(request.getHonorarios());
		
		dao.save(procurador); //Guardamos en la bd lo que se haya registrado en procurador
		return procurador;
	}

	@Override
	public Procuradores editar(ProcuradoresRequest request) {
		//Instanciamos al procurador global que será igual a la función del DAO de buscar por ID
		//Nos trae al procurador solicitado .get
		Procuradores procurador = dao.findById(request.getIdProcurador()).get();
		
		procurador.setIdProcurador(request.getIdProcurador());
		procurador.setNombre(request.getNombre());
		procurador.setDireccion(request.getDireccion());
		procurador.setTelefono(request.getTelefono());
		procurador.setHonorarios(request.getHonorarios());
		
		dao.save(procurador);
		return procurador;
	}

	@Override
	public Procuradores buscar(int id) {
		return dao.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		dao.deleteById(id);
		return "Registro eliminado";
	}

	@Override
	public List<Procuradores> mostrar() {
		return dao.findAll();
	}

}
