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

public class TestsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.facebook);
		// Attach WebView Layout File
		
		Button previousButton = (Button) findViewById(R.id.previousButton);
		
		new AlertDialog.Builder(this)
		.setTitle("Business Communication Practice")
		.setMessage("Open these FBLA practice tests and use them to your advantage! (Provided by TestFrenzy)" )
		.setNeutralButton("Close", null)
		.show();
		
		Toast betaToast = Toast.makeText(this, "Loading...", Toast.LENGTH_LONG);
				betaToast.setGravity(Gravity.BOTTOM, 0, 125);
				betaToast.show();
		
		
		
		final WebView myWebView = (WebView) findViewById(R.id.webview);
		WebSettings webSettings = myWebView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		myWebView.setWebViewClient(new WebViewClient());
		//myWebView.loadUrl("https://drive.google.com/folderview?id=0B2rfDPwywzQPYXRSQUFGdG5pNDg&usp=sharing");
		myWebView.loadUrl("https://skydrive.live.com/redir?resid=AA7E7D180C85B0E9%212305");
		
		previousButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				myWebView.goBack();
			//	navigateBack();
			}
		});
		// Switch Activity when button is pressed
		
	}}