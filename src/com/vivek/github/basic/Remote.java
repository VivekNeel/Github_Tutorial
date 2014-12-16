package com.vivek.github.basic;

import com.vivek.github.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;


public class Remote extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String rem= "file:///android_asset/remote.html";
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.remote);
		WebView remm = (WebView)findViewById(R.id.remote1);
		remm.loadUrl(rem);
		
	}
	
	

}
