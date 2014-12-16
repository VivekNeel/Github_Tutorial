package com.vivek.github.basic;

import com.vivek.github.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;


public class Remove extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String remmo = "file:///android_asset/remove.html";
		String remmov = "file:///android_asset/remove2.html";
		super.onCreate(savedInstanceState);
		setContentView(R.layout.remove);
		WebView remove = (WebView)findViewById(R.id.remove);
		remove.loadUrl(remmo);
		WebView remove2 = (WebView)findViewById(R.id.remove2);
		remove2.loadUrl(remmov);
	}
	
	

}
