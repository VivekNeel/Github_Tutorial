package com.vivek.github;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class About_me extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_me);
		Button fa = (Button)findViewById(R.id.button1);
		Button g = (Button)findViewById(R.id.button2);
		Button t = (Button)findViewById(R.id.button3);
		
		fa.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent f = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.facebook.com/vivek1neel?ref=tn_tnmn"));
				startActivity(f);
				
			}
			
			
			
		});
		
		g.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent ff = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://plus.google.com/102055595954380143572"));
				startActivity(ff);
				
			}
			
			
			
		});
		t.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent fff = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://twitter.com/vivek2neel"));
				startActivity(fff);
				
			}
			
			
			
		});
	}
	
	

}
