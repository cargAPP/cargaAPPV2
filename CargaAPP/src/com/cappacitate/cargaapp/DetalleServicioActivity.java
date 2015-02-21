package com.cappacitate.cargaapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.cappacitate.cargaapp.utility.Utility;
import com.cappacitate.cargaapp.bussiness.Servicio;

public class DetalleServicioActivity extends Activity{
	
	private Servicio servicioDetalle;
	private TextView vehiculoTextView;
	private TextView pesoTextView;
	private TextView volumenTextView;
	private TextView modeloTextView;
	private TextView ubicacionTextView;
	private TextView conductorTextView;
	private Button contactarButton;
	
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
		contactarButton = (Button)findViewById(R.id.contactarButton); 
		Bundle bundle = getIntent().getExtras();
		servicioDetalle = (Servicio)bundle.get("servicio_seleccionado");
		pintarPantalla();
		
		prepareListeners();
		
	}
	
	private void prepareListeners(){
		contactarButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(DetalleServicioActivity.this, InforCompletaActivity.class);
				intent.putExtra("servicio_contratado", servicioDetalle);
				startActivityForResult(intent, 1);
			}
		});
	}

	private void pintarPantalla() {
		
		vehiculoTextView.setText(Utility.pintarInfo(servicioDetalle.getVehiculo().getTipoVehiculo(), this));
		pesoTextView.setText(Utility.pintarInfo(servicioDetalle.getVehiculo().getCapacidad(), this));
		volumenTextView.setText(Utility.pintarInfo(servicioDetalle.getVehiculo().getCapacidadVolumen(), this));
		modeloTextView.setText(Utility.pintarInfo(servicioDetalle.getVehiculo().getModelo(), this));
		ubicacionTextView.setText(Utility.pintarInfo(servicioDetalle.getVehiculo().getUbicacion(), this));
		conductorTextView.setText(Utility.pintarInfo(servicioDetalle.getNomreConductor(), this));
		
	}

	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {

		super.onActivityResult(requestCode, resultCode, data);
		if(requestCode == 1 && resultCode == 3) {
			finish();
		}
	}

}
