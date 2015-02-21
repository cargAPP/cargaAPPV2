package com.cappacitate.cargaapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.widget.ListView;

public class MainMenu extends Activity{
	private DrawerLayout menuDrawerLayout;
	private ListView left_drawer;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu);
	}

}
