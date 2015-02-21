package com.cappacitate.cargaapp.bussiness;

import java.io.Serializable;

public class Servicio implements Serializable{

	private static final long serialVersionUID = -7495051336570197419L;
	
	private String nomreConductor;
	private Vehiculo vehiculo;
	private float rating;
	
	public String getNomreConductor() {
		return nomreConductor;
	}
	public void setNomreConductor(String nomreConductor) {
		this.nomreConductor = nomreConductor;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	
}
