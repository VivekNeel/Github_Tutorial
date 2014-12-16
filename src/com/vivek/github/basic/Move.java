package com.vivek.github.basic;

import com.vivek.github.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;


public class Move extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String mo = "file:///android_asset/move.html";
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.move);
		WebView mov = (WebView)findViewById(R.id.move);
		mov.loadUrl(mo);
	}
	
	

}
