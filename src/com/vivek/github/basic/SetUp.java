package com.vivek.github.basic;

import com.vivek.github.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class SetUp extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
	
		String identity = "file:///android_asset/identity.html";
		String editor = "file:///android_asset/editor.html" ;
		String settings = "file:///android_asset/settings.html";
		String key = "file:///android_asset/key.html";
		String ssh1 = "file:///android_asset/ssh.html";
		String ssh2 = "file:///android_asset/ssh2.html";
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.setup);
		WebView i = (WebView)findViewById(R.id.identity);
		i.loadUrl(identity);
		WebView e = (WebView) findViewById(R.id.editor);
		e.loadUrl(editor);
		WebView s = (WebView) findViewById(R.id.settings);
		s.loadUrl(settings);
		WebView k = (WebView) findViewById(R.id.key);
		k.loadUrl(key);
		WebView ss = (WebView) findViewById(R.id.ssh);
		ss.loadUrl(ssh1);
		WebView sss = (WebView) findViewById(R.id.ssh2);
		sss.loadUrl(ssh2);
		
		
	}
	
	

}
