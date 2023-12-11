package com.distribuidaprincipal;

import java.util.Date;

import javax.naming.Context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Clientes;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Producto;
import com.distribuida.entities.detalleFactura;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 
		Clientes cliente = context.getBean("beanCliente", Clientes.class);
		Producto producto = context.getBean("beanProducto", Producto.class);
		Factura factura = context.getBean("beanFactura", Factura.class);
		detalleFactura detalleFactura = context.getBean("beandetalleFactura", detalleFactura.class); 
		
		
		cliente.setIdCliente(1);
		cliente.setCedula("1207595941");
		cliente.setNombre("Dario");
		cliente.setApellido("Cardozo");
		cliente.setEdad(26);
		cliente.setFechaNacimiento(new Date());
		cliente.setDireccion("Tumbaco");
		cliente.setTelefono("0958851088");
		cliente.setCorreo("darioC17@correo.com");
		
		
		producto.setIdProducto(1);
		producto.setNombre("Manzana");
		producto.setDescripcion("Caja de Manzanas");
		producto.setPrecio(25.30);
		producto.setStock(100);
		
		
		factura.setNumFactura("FAC-0001");
		factura.setFecha(new Date());
		factura.setTotalNeto(56.32);
		factura.setIva(0.12);
		factura.setTotal(60.15);
		
		detalleFactura.setIdetalleFactura(2);
		detalleFactura.setCantidad(8);
		detalleFactura.setSubtotal(84.60);
		
		
		System.out.println(factura.toString());
		System.out.println(detalleFactura.toString());
		
		context.close();

	}

}
