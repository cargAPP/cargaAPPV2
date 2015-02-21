package com.cappacitate.cargaapp;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainMenu extends Activity{
	
	private EditText ubicacionEditText;
	private EditText destinoEditText;
	private Spinner filtroSpinner;
	private List<String> opcionesFiltro = new ArrayList<String>();
	private ArrayAdapter<String> adapter;
	
	String message = "";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu);
		destinoEditText = (EditText)findViewById(R.id.destinoEditText);
		ubicacionEditText = (EditText)findViewById(R.id.ubicacionEditText);
		filtroSpinner = (Spinner)findViewById(R.id.filtroSpinner);
		initSpinner();

	}
	
	private void initSpinner() {
		
		opcionesFiltro.add("Muebles y enceres");
		opcionesFiltro.add("Alimentos perecederos");
		opcionesFiltro.add("Artículos delicados");
		opcionesFiltro.add("Otros");
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opcionesFiltro);
		filtroSpinner.setAdapter(adapter);
	}

	public void solicitarServicio(View view){
		
		if(camposValidos()){
			solicitarServicio();
		}else{
			Toast.makeText(this, message, Toast.LENGTH_LONG).show();
		}
	}

	private void solicitarServicio() {
		Intent intent = new Intent(this, SolicitarServicioActivity.class);
		startActivity(intent);
		
	}

	private boolean camposValidos() {

		if(ubicacionEditText.getText().toString().trim().equals("")){
			message = getString(R.string.ubicacion_obligatorio);
			return false;
		}
		if(destinoEditText.getText().toString().trim().equals("")){
			message = getString(R.string.destino_obligatorio);
			return false;
		}
		return true;
	}
	

}
