package com.vivek.github.Intermediate;

import com.vivek.github.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class Diff extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String a = "file:///android_asset/add.html";
		String a2 = "file:///android_asset/add2.html";
		String s = "file:///android_asset/status.html";
		String s2 = "file:///android_asset/statuss.png";
		String d = "file:///android_asset/diff.html";
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_diff_status);
		WebView add = (WebView)findViewById(R.id.add);
		add.loadUrl(a);
		WebView add2 =(WebView)findViewById(R.id.add2);
		add2.loadUrl(a2);
		
		WebView status =(WebView)findViewById(R.id.status);
		status.loadUrl(s);
		WebView statuss = (WebView)findViewById(R.id.statuss);
		statuss.loadUrl(s2);
		
		WebView diff = (WebView)findViewById(R.id.diff);
		diff.loadUrl(d);
		
	}
	
	

}
