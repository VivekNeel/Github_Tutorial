package com.vivek.github.advance;
import com.vivek.github.R;


import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class Github extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String a = "file:///android_asset/advance/githubs.png";
		String b = "file:///android_asset/advance/githubs2.png";
		String c = "file:///android_asset/advance/github.html";
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cherrypick_github);
		WebView gerrits = (WebView)findViewById(R.id.githubs);
		gerrits.loadUrl(a);
		WebView gerrit = (WebView)findViewById(R.id.githubs2);
		gerrit.loadUrl(b);
		WebView gi = (WebView)findViewById(R.id.github);
		gi.loadUrl(c);
	}
	
	

}
