package com.cappacitate.cargaapp;

import java.util.List;

import com.cappacitate.cargaapp.bussiness.Servicio;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

public class ListarServiciosAdapter extends ArrayAdapter<Servicio>{
	
	Activity contexto;
	List<Servicio> baseDatos;

	public ListarServiciosAdapter(Activity context, List<Servicio> listaServicios) {
		super(context, R.layout.listado_servicios_item, listaServicios);
		this.contexto = context;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		View item = convertView;
		VistaItem vistaitem;
		
		if (item == null) {
			LayoutInflater inflador = contexto.getLayoutInflater();
			item = inflador.inflate(R.layout.listado_servicios_item, null);
			vistaitem = new VistaItem();
			vistaitem.vehiculoTextView = (TextView) item.findViewById(R.id.vehiculoTextView);
			vistaitem.capacidadTextView = (TextView) item.findViewById(R.id.capacidadTextView);
			vistaitem.nombreTextView = (TextView) item.findViewById(R.id.nombreTextView);
			vistaitem.conductorRatingBar = (RatingBar) item.findViewById(R.id.conductorRatingBar);
			item.setTag(vistaitem);
		} else {
			vistaitem = (VistaItem) item.getTag();
		}
		
		Servicio servicio = getItem(position);
		vistaitem.nombreTextView.setText(servicio.getNomreConductor());
		vistaitem.capacidadTextView.setText(servicio.getVehiculo().getCapacidad());
		vistaitem.vehiculoTextView.setText(servicio.getVehiculo().getTipoVehiculo());
		vistaitem.conductorRatingBar.setRating(servicio.getRating());
		return (item);
	}
	


	public static class VistaItem {
		
		TextView vehiculoTextView;
		TextView capacidadTextView;
		TextView nombreTextView;
		RatingBar conductorRatingBar;

	}
}
