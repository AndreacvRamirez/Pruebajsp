package com.dao;

import java.io.Serializable;
import java.sql.SQLException;

import com.entity.Cliente;
import com.mysql.jdbc.PreparedStatement;
import com.util.ConnectionGeneric;
import com.util.QueryGeneric;

public class ClienteDao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private  QueryGeneric<Cliente> query;
	
	public void insert(Cliente c) {
		if(c != null) {
			this.query = new QueryGeneric<Cliente>();
			this.query.setQuery("INSERT INTO cliente(id,nombre,email,clave) VALUES (?,?,?,?)");
			try {
				this.query.setPs(ConnectionGeneric.getC().prepareStatement(this.query.getQuery()));
				this.query.getPs().setInt(1, c.getId());
				this.query.getPs().setString(2, c.getNombre());
				this.query.getPs().setString(3, c.getEmail());
				this.query.getPs().setString(4, c.getClave());
				this.query.getPs().executeUpdate();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}finally {
				ConnectionGeneric.closeConnection();
			}
		}
	}
	
	public void delete(Cliente c) {
		this.query = new QueryGeneric<Cliente>();
		this.query.setQuery("DELETE FROM cliente WHERE id = ?");
		try {
			this.query.setPs(ConnectionGeneric.getC().prepareStatement(this.query.getQuery()));
			this.query.getPs().setInt(1, c.getId());
			query.getPs().executeUpdate();
		}catch (SQLException e) {
		}
	}
	
	
}