package com.cappacitate.cargaapp;

import com.cappacitate.cargaapp.bussiness.Servicio;

import android.app.Activity;
import android.os.Bundle;

public class InforCompletaActivity extends Activity{
	
	private Servicio servicio;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.info_completa_layout);
		Bundle bundle = getIntent().getExtras();
		servicio = (Servicio)bundle.get("servicio_contratado");
	}
}
