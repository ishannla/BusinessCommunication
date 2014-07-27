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
import android.widget.Toast;

public class HelpActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.facebook);
		// Attach WebView Activity File
		
		new AlertDialog.Builder(this)
		.setTitle("Google Forms Help")
		.setMessage("Submit your responses to this Google Form so someone can help you! The more specific you are about the topics you need help on, the more help you will get." )
		.setNeutralButton("Close", null)
		.show();
		// Show Dialog Box
		
		Toast betaToast = Toast.makeText(this, "Loading...", Toast.LENGTH_LONG);
				betaToast.setGravity(Gravity.BOTTOM, 0, 125);
				betaToast.show();
		// Show Loading Toast
				
		
		
		
		final WebView myWebView = (WebView) findViewById(R.id.webview);
		WebSettings webSettings = myWebView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		myWebView.setWebViewClient(new WebViewClient());
		myWebView.loadUrl("https://docs.google.com/forms/d/1w41MHCLL4r7GtObFqHIpU2Lpse1xbn5vheGSP_pHggg/viewform");
		// Open up Google Forums in a WebView
		
		Button previousButton = (Button) findViewById(R.id.previousButton);
		
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
		
		
	}
	
	
