package com.sabersoft.fblacommunication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class ExperienceActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.experience);
		// Attach the Experience Layout File
		
		final TextView noviceText = (TextView) findViewById(R.id.noviceText);
		noviceText.setVisibility(View.GONE);
		final TextView adText = (TextView) findViewById(R.id.adequateText);
		adText.setVisibility(View.GONE);
		final TextView knowText = (TextView) findViewById(R.id.knowledgeableText);
		knowText.setVisibility(View.GONE);
		final TextView exText = (TextView) findViewById(R.id.expertText);
		exText.setVisibility(View.GONE);
		
		
	}
	
	public void onRadioButtonClicked(View view) {
	    // Is the button now checked?
	    boolean checked = ((RadioButton) view).isChecked();
	    
	    // Check which radio button was clicked
	    switch(view.getId()) {
	        case R.id.novice:
	            if (checked)
	                // Pirates are the best
	            	
	            	noviceToast();
	            	noviceText();
	            
	            break;
	        case R.id.adequate:
	            if (checked)
	                // Pirates are the best
	            adequateToast();
	            adequateText();
	            break;
	        case R.id.knowledgeable:
	            if (checked)
	                // Pirates are the best
	           knowledgeableToast();
	            knowText();
	            break;
	        case R.id.expert:
	            if (checked)
	                // Pirates are the best
	            expertToast();
	            expertText();
	            break;
	        
	    }
	}
	
	
	private void noviceToast() {
		Toast betaToast = Toast.makeText(this, "Novice, ask for some help on the concepts!", Toast.LENGTH_SHORT);
		betaToast.setGravity(Gravity.BOTTOM, 0, 315);
		betaToast.show(); }
		
		// Define the Switch Function
		
		private void adequateToast() {
			Toast betaToast1 = Toast.makeText(this, "Adequate, use the study guide to learn!", Toast.LENGTH_SHORT);
			betaToast1.setGravity(Gravity.BOTTOM, 0, 315);
			betaToast1.show(); }	
			
			private void knowledgeableToast() {
				Toast betaToast2 = Toast.makeText(this, "Knowledgeable, go try the practice tests!", Toast.LENGTH_SHORT);
				betaToast2.setGravity(Gravity.BOTTOM, 0, 315);
				betaToast2.show(); }
				
				private void expertToast() {
					Toast betaToast3 = Toast.makeText(this, "Expert, go help your peers with the concepts!", Toast.LENGTH_SHORT);
					betaToast3.setGravity(Gravity.BOTTOM, 0, 315);
					betaToast3.show();
}
				private void noviceText() {
					final TextView noviceText = (TextView) findViewById(R.id.noviceText);
					noviceText.setVisibility(View.GONE);
					final TextView adText = (TextView) findViewById(R.id.adequateText);
					adText.setVisibility(View.GONE);
					final TextView knowText = (TextView) findViewById(R.id.knowledgeableText);
					knowText.setVisibility(View.GONE);
					final TextView exText = (TextView) findViewById(R.id.expertText);
					exText.setVisibility(View.GONE);
					noviceText.setVisibility(View.VISIBLE);
					}
				
				private void adequateText() {
					final TextView noviceText = (TextView) findViewById(R.id.noviceText);
					noviceText.setVisibility(View.GONE);
					final TextView adText = (TextView) findViewById(R.id.adequateText);
					adText.setVisibility(View.GONE);
					final TextView knowText = (TextView) findViewById(R.id.knowledgeableText);
					knowText.setVisibility(View.GONE);
					final TextView exText = (TextView) findViewById(R.id.expertText);
					exText.setVisibility(View.GONE);
					adText.setVisibility(View.VISIBLE);
					}
				private void knowText() {
					final TextView noviceText = (TextView) findViewById(R.id.noviceText);
					noviceText.setVisibility(View.GONE);
					final TextView adText = (TextView) findViewById(R.id.adequateText);
					adText.setVisibility(View.GONE);
					final TextView knowText = (TextView) findViewById(R.id.knowledgeableText);
					knowText.setVisibility(View.GONE);
					final TextView exText = (TextView) findViewById(R.id.expertText);
					exText.setVisibility(View.GONE);
					knowText.setVisibility(View.VISIBLE);
					}
				private void expertText() {
					final TextView noviceText = (TextView) findViewById(R.id.noviceText);
					noviceText.setVisibility(View.GONE);
					final TextView adText = (TextView) findViewById(R.id.adequateText);
					adText.setVisibility(View.GONE);
					final TextView knowText = (TextView) findViewById(R.id.knowledgeableText);
					knowText.setVisibility(View.GONE);
					final TextView exText = (TextView) findViewById(R.id.expertText);
					exText.setVisibility(View.GONE);
					exText.setVisibility(View.VISIBLE);
					}}



				
			

