package com.cappacitate.cargaapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.cappacitate.cargaapp.bussiness.Servicio;

public class DetalleServicioActivity extends Activity{
	
	private Servicio servicioDetalle;
	private TextView vehiculoTextView;
	private TextView pesoTextView;
	private TextView volumenTextView;
	private TextView modeloTextView;
	private TextView ubicacionTextView;
	private TextView conductorTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detalle_servicio_layout);
		vehiculoTextView = (TextView)findViewById(R.id.vehiculoTextView);
		pesoTextView = (TextView)findViewById(R.id.pesoTextView);
		volumenTextView = (TextView)findViewById(R.id.volumenTextView);
		modeloTextView = (TextView)findViewById(R.id.modeloTextView);
		ubicacionTextView = (TextView)findViewById(R.id.ubicacionTextView);
		conductorTextView = (TextView)findViewById(R.id.conductorTextView);
		Bundle bundle = getIntent().getExtras();
		servicioDetalle = (Servicio)bundle.get("servicio_seleccionado");
		pintarPantalla();
		
	}

	private void pintarPantalla() {
		
		vehiculoTextView.setText(pintarInfo(servicioDetalle.getVehiculo().getTipoVehiculo()));
		pesoTextView.setText(pintarInfo(servicioDetalle.getVehiculo().getCapacidad()));
		volumenTextView.setText(pintarInfo(servicioDetalle.getVehiculo().getTipoVehiculo()));
		modeloTextView.setText(pintarInfo(servicioDetalle.getVehiculo().getModelo()));
		ubicacionTextView.setText(pintarInfo(servicioDetalle.getVehiculo().getTipoVehiculo()));
		conductorTextView.setText(pintarInfo(servicioDetalle.getNomreConductor()));
		
	}

	private String pintarInfo(String info) {
		return (info == null || info.equals(""))? getString(R.string.info_no_disponible): info;
	}

}
