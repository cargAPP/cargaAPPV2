package com.cappacitate.cargaapp.utility;

import android.content.Context;

import com.cappacitate.cargaapp.R;

public class Utility {
	
	public static String pintarInfo(String info, Context c) {
		return (info == null || info.equals(""))? c.getResources().getString(R.string.info_no_disponible): info;
	}

}
