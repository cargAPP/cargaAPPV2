package com.cappacitate.cargaapp.bussiness;

import java.io.Serializable;

public class Vehiculo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String tipoVehiculo;
	private String capacidad;
	private String modelo;
	private String capacidadVolumen;
	private String ubicacion;
	
	public String getTipoVehiculo() {
		return tipoVehiculo;
	}
	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	public String getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCapacidadVolumen() {
		return capacidadVolumen;
	}
	public void setCapacidadVolumen(String capacidadVolumen) {
		this.capacidadVolumen = capacidadVolumen;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

}
