package com.sabersoft.fblacommunication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class FacebookActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.facebook);
		// Attach the Experience Layout File
		
		Button previousButton = (Button) findViewById(R.id.previousButton);
		
		new AlertDialog.Builder(this)
		.setTitle("Facebook")
		.setMessage("Use this Facebook group to communicate with your peers, who are also interested in Business Communication!" )
		.setNeutralButton("Close", null)
		.show();
		// Display Dialog Box to User
		
		Toast betaToast = Toast.makeText(this, "Loading...", Toast.LENGTH_LONG);
				betaToast.setGravity(Gravity.BOTTOM, 0, 125);
				betaToast.show();
		// Show "Loading" Toast Message
				
		
		
		
		final WebView myWebView = (WebView) findViewById(R.id.webview);
		WebSettings webSettings = myWebView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		myWebView.setWebViewClient(new WebViewClient());
		myWebView.loadUrl("https://www.facebook.com/groups/1379986185591711/");
		// Display Facebook in the Activity
		
		previousButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				myWebView.goBack();
			//	navigateBack();
			}
		});
		// Switch Activity when button is pressed
		
		
		
		
	}
	
	//WebView myWebView = (WebView) findViewById(R.id.webview);
	

	
	//private void navigateBack() {
		      //  myWebView.goBack();
		     
		}
//}  
