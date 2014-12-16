package com.vivek.github.advance;
import com.vivek.github.R;


import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class Author extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String a = "file:///android_asset/advance/author.html";
		String b = "file:///android_asset/advance/authors.png";
		String c = "file:///android_asset/advance/author2.html";
		super.onCreate(savedInstanceState);
		setContentView(R.layout.changing_author_info);
		WebView gerrits = (WebView)findViewById(R.id.author);
		gerrits.loadUrl(a);
		WebView gerrit = (WebView)findViewById(R.id.authors);
		gerrit.loadUrl(b);
		WebView gerri = (WebView)findViewById(R.id.author2);
		gerri.loadUrl(c);
	}
	
	

}
