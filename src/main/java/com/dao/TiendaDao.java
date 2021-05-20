package com.dao;

import java.io.Serializable;
import java.sql.SQLException;

import com.entity.Tienda;
import com.util.ConnectionGeneric;
import com.util.QueryGeneric;

public class TiendaDao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private QueryGeneric<Tienda> query;
	
	public TiendaDao() {
	}
	
	public void insert(Tienda t) {
		if(t != null) {
			query = new QueryGeneric<Tienda>();
			query.setQuery("INSERT INTO tienda(nombre,descripcion,facebook,web,lema,email,clave,imagen,propietario,id) VALUE (?,?,?,?,?,?,?,?,?,?)");
			try {
				query.setPs(ConnectionGeneric.getC().prepareStatement(this.query.getQuery()));
				query.getPs().setString(1, t.getNombre());
				query.getPs().setString(2, t.getDescripcion());
				query.getPs().setString(3, t.getFacebook());
				query.getPs().setString(4, t.getWeb());
				query.getPs().setString(5, t.getLema());
				query.getPs().setString(6, t.getEmail());
				query.getPs().setString(7, t.getClave());
				query.getPs().setString(8, t.getImagen());
				query.getPs().setString(9, t.getPropietario());
				query.getPs().setInt(10, t.getId());
				query.getPs().executeUpdate();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}finally {
				ConnectionGeneric.closeConnection();
			}
		}
	}
	
	public void update(Tienda t) {
		if(t != null && t.getId() > 0) {
			query = new QueryGeneric<Tienda>();
			query.setQuery("UPDATE tienda SET nombre = ?, descripcion = ?,facebook = ?,web = ?,lema = ?,email = ?,clave = ?,imagen = ?,propietario = ? WHERE id = "+t.getId()+"");
			try {
				query.setPs(ConnectionGeneric.getC().prepareStatement(this.query.getQuery()));
				query.getPs().setString(1, t.getNombre());
				query.getPs().setString(2, t.getDescripcion());
				query.getPs().setString(3, t.getFacebook());
				query.getPs().setString(4, t.getWeb());
				query.getPs().setString(5, t.getLema());
				query.getPs().setString(6, t.getEmail());
				query.getPs().setString(7, t.getClave());
				query.getPs().setString(8, t.getImagen());
				query.getPs().setString(9, t.getPropietario());
				query.getPs().executeUpdate();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}finally {
				ConnectionGeneric.closeConnection();
			}
		}
	}
}
