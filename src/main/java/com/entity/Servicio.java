package com.entity;

import java.io.Serializable;

public class Servicio implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nombre;
	private int tienda;
	private String descripcion;
	
	public Servicio() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTienda() {
		return tienda;
	}

	public void setTienda(int tienda) {
		this.tienda = tienda;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
