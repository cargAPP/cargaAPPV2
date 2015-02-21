package com.cappacitate.cargaapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
	
	private volatile long tiempoRestante = 300;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initView();
		temporizar();
		cargarMenu();
	}
	
	private void temporizar() {
		long iniTime = System.currentTimeMillis();
		tiempoRestante = tiempoRestante - (System.currentTimeMillis() - iniTime);
		if(tiempoRestante > 100)
			try {Thread.sleep(tiempoRestante);} catch (InterruptedException e) {}
		
	}

	private void initView() {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  WindowManager.LayoutParams.FLAG_FULLSCREEN);		
		setContentView(R.layout.activity_main);
	}
	
	private void cargarMenu(){
		Intent intent = new Intent(this, MainMenu.class);
		startActivity(intent);
		finish();
	}


}
