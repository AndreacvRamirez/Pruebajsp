package com.dao;

import java.io.Serializable;
import java.sql.SQLException;

import com.entity.Servicio;
import com.util.ConnectionGeneric;
import com.util.QueryGeneric;

public class ServicioDao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private QueryGeneric<Servicio> query;
	
	public void insert(Servicio s) {
		query = new QueryGeneric<Servicio>();
		query.setQuery("INSERT INTO Servicio(nombre,descripcion,tienda,id) VALUE (?,?,?,?)");
		try {
			query.setPs(ConnectionGeneric.getC().prepareStatement(this.query.getQuery()));
			this.query.getPs().setString(1, s.getNombre());
			this.query.getPs().setString(2, s.getDescripcion());
			this.query.getPs().setInt(3, s.getTienda());
			this.query.getPs().setInt(4, s.getId());
			query.getPs().executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionGeneric.closeConnection();
		}
	}
}
