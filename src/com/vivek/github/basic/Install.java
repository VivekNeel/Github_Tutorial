package com.vivek.github.basic;

import com.vivek.github.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;

public class Install extends Activity {
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		String fed = "file:///android_asset/linux.html";
		String deb = "file:///android_asset/debian.html";
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.d);
		WebView f = (WebView) findViewById(R.id.fedora);
		f.loadUrl(fed);
		WebView d = (WebView)findViewById(R.id.debian);
		d.loadUrl(deb);
		Button fe = (Button)findViewById(R.id.wind);
		fe.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent f = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://windows.github.com/"));
				startActivity(f);
				
			}
			
			
			
		});
		Button ma = (Button)findViewById(R.id.macd);
		ma.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent m = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://mac.github.com/"));
				startActivity(m);
				
				
			}
			
			
			
			
		});
	}
	
	

}
