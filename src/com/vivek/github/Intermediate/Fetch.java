package com.vivek.github.Intermediate;

import com.vivek.github.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class Fetch extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String a = "file:///android_asset/Intermediate/fetch.html";
		String b = "file:///android_asset/Intermediate/fetchs.png";
		String c = "file:///android_asset/Intermediate/pull.html";
		String d = "file:///android_asset/Intermediate/pull2.html";
		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fetch_pull);
		WebView moreb = (WebView)findViewById(R.id.fetch);
		moreb.loadUrl(a);
		WebView more = (WebView)findViewById(R.id.fetchs);
		more.loadUrl(b);
		WebView mor = (WebView)findViewById(R.id.pull);
		mor.loadUrl(c);
		WebView mo = (WebView)findViewById(R.id.pull2);
		mo.loadUrl(d);
		
		
	}
	
	

}
