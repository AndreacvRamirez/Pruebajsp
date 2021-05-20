package com.test;

import com.dao.*;
import com.entity.*;

public class Test {
	public static void main(String args[]) {
		TiendaDao dao = new TiendaDao();
		Tienda t = new Tienda();
		t.setNombre("sss");
		t.setDescripcion("sss");
		t.setFacebook("sss");
		t.setPropietario("sss");
		t.setImagen("sss");
		t.setLema("sss");
		t.setWeb("sss");
		t.setId(12);
		t.setEmail("sss");
		t.setClave("ww");
		dao.insert(t);
		
		t.setNombre("rrrr");
		t.setDescripcion("sss");
		t.setFacebook("sss");
		t.setPropietario("sss");
		t.setImagen("sss");
		t.setLema("sss");
		t.setWeb("sss");
		t.setId(12);
		t.setEmail("sss");
		t.setClave("ww");
		dao.update(t);
		
		SeguirDao dao2 = new SeguirDao();
		dao2.insert(12, 12);
		
		ServicioDao dao3 = new ServicioDao();
		Servicio s1 = new Servicio();
		s1.setId(12);
		s1.setTienda(12);
		s1.setDescripcion("ee");
		s1.setNombre("sss");
		dao3.insert(s1);
	}
}
