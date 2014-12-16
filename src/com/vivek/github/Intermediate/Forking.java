package com.vivek.github.Intermediate;

import com.vivek.github.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class Forking extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String f = "file:///android_asset/fork.png";
		String c = "file:///android_asset/clone.html";
		String s = "file:///android_asset/sync.html";
		super.onCreate(savedInstanceState);
		setContentView(R.layout.clone);
		WebView fork = (WebView)findViewById(R.id.fork);
		fork.loadUrl(f);
		WebView clone =(WebView)findViewById(R.id.clone);
		clone.loadUrl(c);
		WebView sy = (WebView)findViewById(R.id.sync);
		sy.loadUrl(s);
		
	}
	
	

}
