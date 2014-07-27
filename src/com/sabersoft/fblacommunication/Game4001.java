package com.sabersoft.fblacommunication;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Game4001 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game4001);
		// Attach the Game Layout File
		
		final TextView answer2001 = (TextView) findViewById(R.id.answer2001);
		answer2001.setVisibility(View.GONE);
		Button answerButton = (Button) findViewById(R.id.buttonAnswer2001);
		// Set TextView to not be "Visible" unless button is clicked
	
	answerButton.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			answer2001.setVisibility(View.VISIBLE);
			// Make TextView Visible when button is clicked
		}
		});
		}
	public void onRadioButtonClicked(View view) {
	    // Is the button now checked?
	    boolean checked = ((RadioButton) view).isChecked();
	    
	    // Check which radio button was clicked
	    switch(view.getId()) {
	        case R.id.game41a:
	            if (checked)
	                // Pirates are the best
	            	
	            	errorToast();
	            
	            
	            break;
	        case R.id.game41b:
	            if (checked)
	                // Pirates are the best
	            	 winToast();
	            break;
	        case R.id.game41c:
	            if (checked)
	                // Pirates are the best
	            	
	           
	            errorToast();
	            break;
	        case R.id.game41d:
	            if (checked)
	                // Pirates are the best
	            	errorToast();
	            break;
	        
	    }
	}
	
	private void errorToast() {
		Toast betaToast1 = Toast.makeText(this, "Incorrect. Sorry, try again!", Toast.LENGTH_SHORT);
		betaToast1.setGravity(Gravity.BOTTOM, 0, 230);
		betaToast1.show(); }	
	
	private void winToast() {
		Toast betaToast2 = Toast.makeText(this, "Correct. Good Job!", Toast.LENGTH_SHORT);
		betaToast2.setGravity(Gravity.BOTTOM, 0, 230);
		betaToast2.show(); }	
	}