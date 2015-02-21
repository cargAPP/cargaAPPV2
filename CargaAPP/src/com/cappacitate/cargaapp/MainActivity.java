package com.cappacitate.cargaapp;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
	
	private volatile long tiempoRestante = 1800;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initView();
		
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				Intent intent = new Intent(MainActivity.this, MainMenu.class);
				startActivity(intent);
				finish();//Destruimos esta activity para prevenit que el usuario retorne aqui presionando el boton Atras.
			}
		};

		Timer timer = new Timer();
		timer.schedule(task, tiempoRestante);//Pasado los 6 segundos dispara la tarea
//		temporizar();
//		cargarMenu();
	}
	

	private void initView() {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  WindowManager.LayoutParams.FLAG_FULLSCREEN);		
		setContentView(R.layout.activity_main);
	}


}
