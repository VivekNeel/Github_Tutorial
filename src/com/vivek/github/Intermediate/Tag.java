package com.vivek.github.Intermediate;

import com.vivek.github.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class Tag extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String a = "file:///android_asset/Intermediate/tag.html";
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tag);
		WebView moreb = (WebView)findViewById(R.id.tag);
		moreb.loadUrl(a);
		
		
	}
	
	

}
