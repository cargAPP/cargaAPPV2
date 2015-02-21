package com.cappacitate.cargaapp;

import java.util.ArrayList;
import java.util.List;

import com.cappacitate.cargaapp.bussiness.Servicio;
import com.cappacitate.cargaapp.mocks.MocksDatos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class SolicitarServicioActivity extends Activity{
	
	private ListView serviciosDisponiblesListView;
	private List<Servicio> servicios = new ArrayList<Servicio>();
	ListarServiciosAdapter adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.solicitar_servicio_layout);
		serviciosDisponiblesListView = (ListView)findViewById(R.id.serviciosDisponiblesListView);
		cargarLista();
		prepareListeners();
	}

	private void prepareListeners() {
		
		serviciosDisponiblesListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				
				
				Servicio servicioSeleccionado = (Servicio) adapter.getItem(position);
				verDetalleRecogida(servicioSeleccionado);
				
			}
		});
		
	}

	protected void verDetalleRecogida(Servicio servicioSeleccionado) {
		Intent intent = new Intent(this, DetalleServicioActivity.class);
		intent.putExtra("servicio_seleccionado", servicioSeleccionado);
		startActivity(intent);
		
	}

	private void cargarLista() {
		servicios = MocksDatos.obtenerServicios();
		adapter = new ListarServiciosAdapter(this, servicios);
		serviciosDisponiblesListView.setAdapter(adapter);
		
	}

}
