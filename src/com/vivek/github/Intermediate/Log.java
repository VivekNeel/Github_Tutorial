package com.vivek.github.Intermediate;

import com.vivek.github.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class Log extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String a = "file:///android_asset/Intermediate/log.html";
		String b = "file:///android_asset/Intermediate/logs.png";
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.log_show_desscribe);
		WebView moreb = (WebView)findViewById(R.id.log);
		moreb.loadUrl(a);
		WebView more = (WebView)findViewById(R.id.logs);
		more.loadUrl(b);
		
		
	}
	
	

}
