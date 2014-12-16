package com.vivek.github.basic;

import com.vivek.github.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;


public class Commit extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String com = "file:///android_asset/commit.html";
		String comm = "file:///android_asset/commitm.html";
		super.onCreate(savedInstanceState);
		setContentView(R.layout.commit);
		WebView commit = (WebView)findViewById(R.id.commit);
		commit.loadUrl(com);
		WebView commitmm = (WebView)findViewById(R.id.commit2);
		commitmm.loadUrl(comm);
	}
	
	

}
