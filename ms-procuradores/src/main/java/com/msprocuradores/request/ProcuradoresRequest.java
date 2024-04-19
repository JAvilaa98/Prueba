package com.msprocuradores.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProcuradoresRequest {

	private int idProcurador;
	private String nombre;
	private String direccion;
	private String telefono;
	private double honorarios;
	
	//Clase "filtro" intermediaria de información
}
