package com.vivek.github.basic;

import com.vivek.github.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;


public class Branch extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String bran = "file:///android_asset/branch.html";
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.branch);
		WebView branc = (WebView)findViewById(R.id.branch);
		branc.loadUrl(bran);
		
	}
	
	

}
