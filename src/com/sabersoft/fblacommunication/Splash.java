package com.sabersoft.fblacommunication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		// Attach Splash Layout File
		
		Thread splash_screen = new Thread(){
			public void run(){
				try{
					sleep(2000);
				}
				catch(Exception e){
					e.printStackTrace();
				}
				
				finally {
					startActivity (new Intent (getApplicationContext(),MainActivity.class));
					finish();
				}
				
				
			}
			
		};
		splash_screen.start();
	}
		
	}