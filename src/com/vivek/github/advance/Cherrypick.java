package com.vivek.github.advance;
import com.vivek.github.R;


import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class Cherrypick extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String a = "file:///android_asset/advance/gerrits.png";
		String b = "file:///android_asset/advance/gerrit.html";
		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cherrypick);
		WebView gerrits = (WebView)findViewById(R.id.gerrits);
		gerrits.loadUrl(a);
		WebView gerrit = (WebView)findViewById(R.id.gerrit);
		gerrit.loadUrl(b);
		
	}
	
	

}
