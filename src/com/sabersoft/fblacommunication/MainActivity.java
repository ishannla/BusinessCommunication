package com.sabersoft.fblacommunication;

import com.sabersoft.fblacommunication.R;
import com.sabersoft.fblacommunication.TestsActivity;
import com.sabersoft.fblacommunication.ShakeDetector;
import com.sabersoft.fblacommunication.ShakeDetector.OnShakeListener;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.Toast;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {
	
	private SensorManager mSensorManager;
	private Sensor mAccelerometer;
	private ShakeDetector mShakeDetector;
	// Define Accelerometer variables
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// Attach Main Activity Layout File
		
		
		Resources ressources = getResources(); 
		TabHost tabHost = getTabHost(); 
		// Create TabHost
 
		
		Intent intentHome = new Intent().setClass(this, HomeActivity.class);
		TabSpec tabSpecHome = tabHost
		  .newTabSpec("Home")
		  .setIndicator("Home")
		  .setContent(intentHome);
		// Home tab
 
		
		Intent intentGame = new Intent().setClass(this, GameActivity.class);
		TabSpec tabSpecGame = tabHost
		  .newTabSpec("Game")
		  .setIndicator("Game")
		  .setContent(intentGame);
		// Clubs tab
 
		
		Intent intentFacebook = new Intent().setClass(this, FacebookActivity.class);
		TabSpec tabSpecFacebook = tabHost
		  .newTabSpec("Facebook")
		  .setIndicator("Facebook")
		  .setContent(intentFacebook);
		// Dates tab
 	
 		
		tabHost.addTab(tabSpecHome);
		tabHost.addTab(tabSpecGame);
		tabHost.addTab(tabSpecFacebook);
		// add all tabs 

				
		tabHost.setCurrentTab(0);
		// set Windows tab as default (zero based)
		
		mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
		mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
		// Get System Service for Accelerometer
		
		mShakeDetector = new ShakeDetector(new OnShakeListener(){

			@Override
			public void onShake() {
				// TODO Auto-generated method stub
				
				switchPlayStore();
				// Initiate Play Store Function when Device is Shaken
			}
			
		});
		
		
		
	}
	
	private void switchPlayStore() {
				
		Toast betaToast = Toast.makeText(this, "Add a review and provide feeback!", Toast.LENGTH_LONG);
				betaToast.setGravity(Gravity.BOTTOM, 0, 125);
				betaToast.show();
				Intent myWeblink = new Intent (android.content.Intent.ACTION_VIEW);
				myWeblink.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.sabersoft.fblacommunication"));
				startActivity(myWeblink); }
				// Display Review Toast
		
@Override
public void onResume(){
	super.onResume();
	mSensorManager.registerListener(mShakeDetector, mAccelerometer, SensorManager.SENSOR_DELAY_UI);
	// Register the ShakeDetector when Application is Resumed
}

@Override
public void onPause(){
	super.onPause();
	mSensorManager.unregisterListener(mShakeDetector);
	// Unregister the ShakeDetector when the Application is Paused
	
}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		MenuInflater blowUp = getMenuInflater();
		blowUp.inflate(R.menu.main, menu);
		return true;
		// Create the Universal Android Menu Button
		
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		
		case R.id.Tests:
			final Intent intent;
			intent = new Intent().setClass(this, TestsActivity.class);
			 startActivity(intent);;
			 // Navigate to Tests Activity when Menu Button is Pressed
		
	}
		return false;}}
