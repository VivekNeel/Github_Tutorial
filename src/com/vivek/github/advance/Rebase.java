package com.vivek.github.advance;
import com.vivek.github.R;


import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class Rebase extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String a = "file:///android_asset/advance/rebase.html";
		String b = "file:///android_asset/advance/rebase2.html";
		String c = "file:///android_asset/advance/rebase3.html";
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rebase);
		WebView gerrits = (WebView)findViewById(R.id.rebase);
		gerrits.loadUrl(a);
		WebView gerrit = (WebView)findViewById(R.id.rebase2);
		gerrit.loadUrl(b);
		WebView gi = (WebView)findViewById(R.id.rebase3);
		gi.loadUrl(c);
	}
	
	

}
