package com.vivek.github.advance;
import com.vivek.github.R;


import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;

public class Subtree extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		String a = "file:///android_asset/advance/subtree.html";
		String b = "file:///android_asset/advance/subtrees.png";
		String c = "file:///android_asset/advance/subtree2.html";
		String d = "file:///android_asset/advance/subtree3.html";
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.subtree_merges);
		WebView gerrits = (WebView)findViewById(R.id.subtree);
		gerrits.loadUrl(a);
		WebView gerrit = (WebView)findViewById(R.id.subtrees);
		gerrit.loadUrl(b);
		WebView gi = (WebView)findViewById(R.id.subtree2);
		gi.loadUrl(c);
		WebView gid = (WebView)findViewById(R.id.subtree3);
		gid.loadUrl(d);
	}
	
	

}
