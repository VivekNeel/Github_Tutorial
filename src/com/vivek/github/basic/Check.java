package com.vivek.github.basic;

import com.vivek.github.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;


public class Check extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String ch = "file:///android_asset/check.html";
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.check);
		WebView check = (WebView)findViewById(R.id.check);
		check.loadUrl(ch);
		
	}
	
	

}
