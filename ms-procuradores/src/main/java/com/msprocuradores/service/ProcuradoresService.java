package com.msprocuradores.service;

import java.util.List;

import com.msprocuradores.entity.Procuradores;
import com.msprocuradores.request.ProcuradoresRequest;

public interface ProcuradoresService {

	//Métodos que el DAO tendrá que resolver 
	public Procuradores guardar(ProcuradoresRequest request);
	public Procuradores editar(ProcuradoresRequest request);
	public Procuradores buscar (int id);
	public String eliminar (int id);
	public List<Procuradores> mostrar();
}
