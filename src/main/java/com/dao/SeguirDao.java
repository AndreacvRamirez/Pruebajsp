package com.dao;

import java.io.Serializable;
import java.sql.SQLException;

import com.entity.Seguir;
import com.util.ConnectionGeneric;
import com.util.QueryGeneric;

public class SeguirDao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private QueryGeneric<Seguir> query;
	
	public void insert(int idTienda, int idCliente) {
		query = new QueryGeneric<Seguir>();
		query.setQuery("INSERT INTO Seguir(cliente,tienda) VALUE (?,?)");
		try {
			query.setPs(ConnectionGeneric.getC().prepareStatement(this.query.getQuery()));
			this.query.getPs().setInt(1, idCliente);
			this.query.getPs().setInt(2, idTienda);
			query.getPs().executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionGeneric.closeConnection();
		}
	}
}
