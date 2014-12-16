package com.vivek.github.Intermediate;

import com.vivek.github.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class Merging extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String a = "file:///android_asset/Intermediate/merge.html";
		String b = "file:///android_asset/Intermediate/merge2.html";
		String c = "file:///android_asset/Intermediate/merge3.html";
		String d = "file:///android_asset/Intermediate/javarb.png";
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.merge);
		WebView moreb = (WebView)findViewById(R.id.merge);
		moreb.loadUrl(a);
		WebView more = (WebView)findViewById(R.id.merge2);
		more.loadUrl(b);
		WebView mor = (WebView)findViewById(R.id.merge3);
		mor.loadUrl(c);
		WebView dddd = (WebView)findViewById(R.id.javarb);
		dddd.loadUrl(d);
		
		
	}
	
	

}
