package com.distribuida.entities;

import java.util.Date;

public class Factura {
	
	
	private int idFactura;
	private Date fecha; //Date
	private String numFactura;
	private Double totalNeto;
	private Double iva;
	private Double total;
	private Clientes cliente; //private int id_cliente;
	
	
	public Factura () {}
	
	public Factura(Clientes cliente) {
		this.cliente=cliente;
	}


	public int getIdFactura() {
		return idFactura;
	}


	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getNumFactura() {
		return numFactura;
	}


	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}


	public Double getTotalNeto() {
		return totalNeto;
	}


	public void setTotalNeto(Double totalNeto) {
		this.totalNeto = totalNeto;
	}


	public Double getIva() {
		return iva;
	}


	public void setIva(Double iva) {
		this.iva = iva;
	}


	public Double getTotal() {
		return total;
	}


	public void setTotal(Double total) {
		this.total = total;
	}


	public Clientes getCliente() {
		return cliente;
	}


	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}


	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", fecha=" + fecha + ", numFactura=" + numFactura + ", totalNeto="
				+ totalNeto + ", iva=" + iva + ", total=" + total + ", cliente=" + cliente + "]";
	}



	
	
}