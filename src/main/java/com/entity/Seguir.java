package com.entity;

import java.io.Serializable;

public class Seguir implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int tienda;
	private int cliente;
	
	public Seguir() {
	}
	
	public int getTienda() {
		return tienda;
	}
	public void setTienda(int tienda) {
		this.tienda = tienda;
	}
	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}
}
