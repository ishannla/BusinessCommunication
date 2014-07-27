package com.sabersoft.fblacommunication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends Activity {
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		// Attach the Home Layout File
		
		
		Button studyButton = (Button) findViewById(R.id.studyButton);
		studyButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switchActStudy();
			}
		});
		// Switch Activities when Button is Pressed
		
		Button helpButton = (Button) findViewById(R.id.helpButton);
		helpButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switchActHelp();
				
			}
		});
		// Switch Activities when Button is Pressed
		
		
		
			
		}
		
		private void switchActStudy() {
			final Intent intent;
			intent = new Intent().setClass(this, QuizletActivity.class);
			startActivity(intent);
			// Define the Function to Switch Classes 
		}
		
		private void switchActHelp() {
			final Intent intent;
			intent = new Intent().setClass(this, HelpActivity.class);
			startActivity(intent);
			// Define the Function to Switch Classes
	}}
	


