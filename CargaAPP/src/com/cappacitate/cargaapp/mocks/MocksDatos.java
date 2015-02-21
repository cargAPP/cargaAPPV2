package com.cappacitate.cargaapp.mocks;

import java.util.ArrayList;
import java.util.List;

import com.cappacitate.cargaapp.bussiness.Servicio;
import com.cappacitate.cargaapp.bussiness.Vehiculo;

public class MocksDatos {

	public static List<Servicio> obtenerServicios() {
		List<Servicio> servicios = new ArrayList<Servicio>();
		Servicio servicio = new Servicio();
		servicio.setNomreConductor("Juan Perez");
		servicio.setVehiculo(obtenerVehiculo("Chevrolet Luv", "1.5 Tons"));
		servicio.setRating(4);
		servicios.add(servicio);
		servicio = new Servicio();
		servicio.setNomreConductor("Lucas Martinez");
		servicio.setVehiculo(obtenerVehiculo("Chevrolet Dimax", "1.0 Tons"));
		servicio.setRating(3);
		servicios.add(servicio);
		servicio = new Servicio();
		servicio.setNomreConductor("Esteban Mendoza");
		servicio.setVehiculo(obtenerVehiculo("Nissan Navara", "1.5 Tons"));
		servicio.setRating(2);
		servicios.add(servicio);
		servicio = new Servicio();
		servicio.setNomreConductor("Anibal Echeverry");
		servicio.setVehiculo(obtenerVehiculo("Chevrolet Dimax", "1.5 Tons"));
		servicio.setRating(5);
		servicios.add(servicio);
		servicio = new Servicio();
		servicio.setNomreConductor("Edgar Ramirez");
		servicio.setVehiculo(obtenerVehiculo("Mazda ", "1.0 Tons"));
		servicio.setRating(1);
		servicios.add(servicio);
		
		return servicios;
	}

	private static Vehiculo obtenerVehiculo(String tipo, String capacidad) {
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setCapacidad(capacidad);
		vehiculo.setTipoVehiculo(tipo);
		return vehiculo;
	}



}
