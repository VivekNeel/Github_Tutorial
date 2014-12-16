package com.vivek.github.Intermediate;

import com.vivek.github.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class Commiting extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String commit = "file:///android_asset/Intermediate/commitmore.html";
		String push = "file:///android_asset/Intermediate/push.html";
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.commit_push);
		WebView commitmore = (WebView)findViewById(R.id.commitmore);
		commitmore.loadUrl(commit);
		WebView pushs = (WebView)findViewById(R.id.push);
		pushs.loadUrl(push);
		
		
		
	}
	
	

}
