package com.vivek.github.basic;

import com.vivek.github.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;


public class Repo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String re = "file:///android_asset/repo.png";
		String ini = "file:///android_asset/init.html";
		String inim = "file:///android_asset/initm.html";
		super.onCreate(savedInstanceState);
		setContentView(R.layout.repo);
		WebView rep = (WebView)findViewById(R.id.repo);
		rep.loadUrl(re);
		WebView init = (WebView)findViewById(R.id.init);
		init.loadUrl(ini);
		WebView initm = (WebView)findViewById(R.id.initm);
		initm.loadUrl(inim);
	}
	
	

}
