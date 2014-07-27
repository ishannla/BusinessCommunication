package com.sabersoft.fblacommunication;

import com.sabersoft.fblacommunication.R;
import com.sabersoft.fblacommunication.ExperienceActivity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class GameActivity extends Activity{
	
	 //public TextView numberScore;
	 //public static int theNumber = 5;
	 //numberScore = (TextView)findViewById(R.id.numberScore);
     //numberScore.setText(String.valueOf(theNumber));
	
	 // Tried to experiment with Buttons and Variables but didn't work out
	 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game);
		// Attach GameActivity Layout File    
	  
		
		Button experienceButton = (Button) findViewById(R.id.experienceButton);
		Button game2001 = (Button) findViewById(R.id.button2001);
		Button game2002 = (Button) findViewById(R.id.button2002);
		Button game2003 = (Button) findViewById(R.id.button2003);
		Button game2004 = (Button) findViewById(R.id.button2004);
		Button game4001 = (Button) findViewById(R.id.button4001);
		Button game4002 = (Button) findViewById(R.id.button4002);
		Button game4003 = (Button) findViewById(R.id.button4003);
		Button game4004 = (Button) findViewById(R.id.button4004);
		Button game6001 = (Button) findViewById(R.id.button6001);
		Button game6002 = (Button) findViewById(R.id.button6002);
		Button game6003 = (Button) findViewById(R.id.button6003);
		Button game6004 = (Button) findViewById(R.id.button6004);
		Button game8001 = (Button) findViewById(R.id.button8001);
		Button game8002 = (Button) findViewById(R.id.button8002);
		Button game8003 = (Button) findViewById(R.id.button8003);
		Button game8004 = (Button) findViewById(R.id.button8004);
		// Create the buttons for Jeopardy		
		
		
		experienceButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switchActEXP();
			}
		});
		// Switch Activity when button is pressed
		
		
		
		game2001.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switchAct2001();
			}
		});
		// Switch Activity when button is pressed
		
		
		
		game2002.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switchAct2002();
			}
		});
		// Switch Activity when button is pressed
		
		
		
		game2003.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switchAct2003();
			}
		});
		// Switch Activity when button is pressed
		
		
		
		game2004.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switchAct2004();
			}
		});
		// Switch Activity when button is pressed
		
		
		
		game4001.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switchAct4001();
			}
		});
		// Switch Activity when button is pressed
		
		
		
		game4002.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switchAct4002();
			}
		});
		// Switch Activity when button is pressed
		
		
		
		game4003.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switchAct4003();
			}
		});
		// Switch Activity when button is pressed
		
		
		
		game4004.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switchAct4004();
			}
		});
		// Switch Activity when button is pressed
		
		
		
		game6001.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switchAct6001();
			}
		});
		// Switch Activity when button is pressed
		
		
		
		game6002.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switchAct6002();
			}
		});
		// Switch Activity when button is pressed
		
		
		
		game6003.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switchAct6003();
			}
		});
		// Switch Activity when button is pressed
		
		
		
		game6004.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switchAct6004();
			}
		});
		// Switch Activity when button is pressed
		
		
		
		game8001.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switchAct8001();
			}
		});
		// Switch Activity when button is pressed
		
		
		
		game8002.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switchAct8002();
			}
		});
		// Switch Activity when button is pressed
		
		
		
		game8003.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switchAct8003();
			}
		});
		// Switch Activity when button is pressed
		
		
		
		game8004.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switchAct8004();
			}
		});}
		// Switch Activity when button is pressed	
	
	
	  
	private void switchActEXP() {
		final Intent intent;
		intent = new Intent().setClass(this, ExperienceActivity.class);
		 startActivity(intent);
		 // Define the Switch Function
}  
	
	private void switchAct2001() {
		final Intent intent;
		intent = new Intent().setClass(this, Game2001.class);
		 startActivity(intent);
		// Define the Switch Function
}
	
	private void switchAct2002() {
		final Intent intent;
		intent = new Intent().setClass(this, Game2002.class);
		 startActivity(intent);
		// Define the Switch Function
}
	
	private void switchAct2003() {
		final Intent intent;
		intent = new Intent().setClass(this, Game2003.class);
		 startActivity(intent);
		// Define the Switch Function
}
	
	private void switchAct2004() {
		final Intent intent;
		intent = new Intent().setClass(this, Game2004.class);
		 startActivity(intent);
		// Define the Switch Function
}
	
	private void switchAct4001() {
		final Intent intent;
		intent = new Intent().setClass(this, Game4001.class);
		 startActivity(intent);
		// Define the Switch Function
		 
}
	private void switchAct4002() {
		final Intent intent;
		intent = new Intent().setClass(this, Game4002.class);
		 startActivity(intent);
		// Define the Switch Function
		 
}
	private void switchAct4003() {
		final Intent intent;
		intent = new Intent().setClass(this, Game4003.class);
		 startActivity(intent);
		// Define the Switch Function
		 
}
	private void switchAct4004() {
		final Intent intent;
		intent = new Intent().setClass(this, Game4004.class);
		 startActivity(intent);
		// Define the Switch Function
		 
}
	private void switchAct6001() {
		final Intent intent;
		intent = new Intent().setClass(this, Game6001.class);
		 startActivity(intent);
		// Define the Switch Function
		 
}
	private void switchAct6002() {
		final Intent intent;
		intent = new Intent().setClass(this, Game6002.class);
		 startActivity(intent);
		// Define the Switch Function
		 
}
	private void switchAct6003() {
		final Intent intent;
		intent = new Intent().setClass(this, Game6003.class);
		 startActivity(intent);
		// Define the Switch Function
		 
}
	private void switchAct6004() {
		final Intent intent;
		intent = new Intent().setClass(this, Game6004.class);
		 startActivity(intent);
		// Define the Switch Function
		 
}
	private void switchAct8001() {
		final Intent intent;
		intent = new Intent().setClass(this, Game8001.class);
		 startActivity(intent);
		// Define the Switch Function
		 
}
	private void switchAct8002() {
		final Intent intent;
		intent = new Intent().setClass(this, Game8002.class);
		 startActivity(intent);
		// Define the Switch Function
		 
}
	private void switchAct8003() {
		final Intent intent;
		intent = new Intent().setClass(this, Game8003.class);
		 startActivity(intent);
		// Define the Switch Function
		 
}
	private void switchAct8004() {
		final Intent intent;
		intent = new Intent().setClass(this, Game8004.class);
		 startActivity(intent);
		// Define the Switch Function
		 
}



}


