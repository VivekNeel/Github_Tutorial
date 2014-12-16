package com.vivek.github.advance;
import com.vivek.github.R;


import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class Sensitive extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String a = "file:///android_asset/advance/sensitive.html";
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sensitive_data);
		WebView gerrits = (WebView)findViewById(R.id.sensitive);
		gerrits.loadUrl(a);
		
	}
	
	

}
