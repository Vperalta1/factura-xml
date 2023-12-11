package com.distribuida.entities;

public class detalleFactura {
	
	private int idetalleFactura;
	private int cantidad;
	private Double subtotal;
	private Factura factura;       /// private Factura factura;
	private Producto producto;
	
	public detalleFactura() {}
	
	
	
	public int getIdetalleFactura() {
		return idetalleFactura;
	}



	public void setIdetalleFactura(int idetalleFactura) {
		this.idetalleFactura = idetalleFactura;
	}



	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public Factura getFactura() {
		return factura;
	}
	 /// metodo inyectores
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public Producto getProducto() {
		return producto;
	}
	/// metodo inyectores
	public void setProducto(Producto producto) {
		this.producto = producto;
	}



	@Override
	public String toString() {
		return "detalleFactura [iddetalleFactura=" + idetalleFactura + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", factura=" + factura + ", producto=" + producto + "]";
	}
	
}
