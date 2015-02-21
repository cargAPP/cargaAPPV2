package com.cappacitate.cargaapp;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.cappacitate.cargaapp.bussiness.Servicio;
import com.cappacitate.cargaapp.utility.Utility;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class InforCompletaActivity extends Activity{
	
	private Servicio servicio;
	
	private TextView nombreTextView;
	private TextView telefonoTextView;
	private TextView emailTextView;
	private TextView vehiculoTextView;
	private TextView fechaDesdeTextView;
	private Button cancelarButton;
	private Button verUbicacionButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info_completa_layout);
		nombreTextView = (TextView)findViewById(R.id.nombreTextView);
		telefonoTextView = (TextView)findViewById(R.id.telefonoTextView);
		emailTextView = (TextView)findViewById(R.id.emailTextView);
		vehiculoTextView = (TextView)findViewById(R.id.vehiculoTextView);
		fechaDesdeTextView = (TextView)findViewById(R.id.fechaDesdeTextView);
		cancelarButton = (Button)findViewById(R.id.cancelarButton);
		verUbicacionButton = (Button)findViewById(R.id.verUbicacionButton);
		Bundle bundle = getIntent().getExtras();
		servicio = (Servicio)bundle.get("servicio_contratado");
		prepareListeners();
		pintarPantalla();
	}

	private void pintarPantalla() {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		String fecha = format.format(new Date());
		servicio.setFechaIngreso(fecha);
		nombreTextView.setText(Utility.pintarInfo(servicio.getNomreConductor(), this));
		telefonoTextView.setText(Utility.pintarInfo(servicio.getTelefono(), this));
		emailTextView.setText(Utility.pintarInfo(servicio.getEmail(), this));
		vehiculoTextView.setText(Utility.pintarInfo(servicio.getVehiculo().getTipoVehiculo(), this));
		fechaDesdeTextView.setText(Utility.pintarInfo(servicio.getFechaIngreso(), this));
		
	}

	private void prepareListeners() {
		cancelarButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				setResult(3);
				finish();
				
			}
		});
		verUbicacionButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(InforCompletaActivity.this, UbicacionActivity.class);
				startActivity(intent);
			}
		});
	}
}
