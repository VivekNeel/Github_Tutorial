package com.vivek.github.Intermediate;

import com.vivek.github.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class Conflicts extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String a = "file:///android_asset/Intermediate/conflicts1.html";
		String b = "file:///android_asset/Intermediate/conflicts2.html";
		String c = "file:///android_asset/Intermediate/conflicts3.html";
		String d = "file:///android_asset/Intermediate/conflicts4.html";
		String e = "file:///android_asset/Intermediate/conflicts5.html";
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.conflicts);
		WebView moreb = (WebView)findViewById(R.id.conflicts1);
		moreb.loadUrl(a);
		WebView more = (WebView)findViewById(R.id.conflicts2);
		more.loadUrl(b);
		WebView mor = (WebView)findViewById(R.id.conflicts3);
		mor.loadUrl(c);
		WebView aa = (WebView)findViewById(R.id.conflicts4);
		aa.loadUrl(d);
		WebView bb = (WebView)findViewById(R.id.conflicts5);
		bb.loadUrl(e);
		
		
	}
	
	

}
