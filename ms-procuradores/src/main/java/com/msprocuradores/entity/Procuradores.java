package com.msprocuradores.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PROCURADORES")
public class Procuradores implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aid_auto")
	@SequenceGenerator(name="aid_auto",sequenceName = "PROCURADORES_SEQ",allocationSize = 1)
	@Column(name="ID_PROCURADOR", columnDefinition = "Number")
	private int idProcurador;
	
	@Column(name="NOMBRE", columnDefinition = "NVARCHAR2(30)")
	private String nombre;
	
	@Column(name="DIRECCION", columnDefinition = "NVARCHAR2(40)")
	private String direccion;
	
	@Column(name="TELEFONO", columnDefinition = "NVARCHAR2(10)")
	private String telefono;
	
	@Column(name="HONORARIOS", columnDefinition = "NUMBER")
	private double honorarios;
	
	//Constructor vacío
	public Procuradores() {}

	//Constructor con parámetro
	public Procuradores(int idProcurador) {
		super();
		this.idProcurador = idProcurador;
	}


	//Getters y Setters
	public int getIdProcurador() {
		return idProcurador;
	}

	public void setIdProcurador(int idProcurador) {
		this.idProcurador = idProcurador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public double getHonorarios() {
		return honorarios;
	}

	public void setHonorarios(double honorarios) {
		this.honorarios = honorarios;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
