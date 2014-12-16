package com.vivek.github;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		Thread sp = new Thread(){
			
		public void run(){
			try {
				sleep(3000);
				
				}
			catch(Exception e){
				
				e.printStackTrace();
				
				
			}finally{
				
				Intent i = new Intent(Splash.this , MainActivity.class);
				startActivity(i);
			}
			
			
			
		}
			
			
		};
		sp.start();
			
			
			
			
		}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
	}
	
	


