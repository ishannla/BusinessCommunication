package com.sabersoft.fblacommunication;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Gravity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class PlayStore extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.playstore);
		// Attach PlayStore Layout File
		
		new AlertDialog.Builder(this)
		.setTitle("Send Feedback")
		.setMessage("Add a review so that the developer can make the app better!" )
		.setNeutralButton("Close", null)
		.show();
		// Show Dialog Box
		
		Toast betaToast = Toast.makeText(this, "Loading...", Toast.LENGTH_LONG);
				betaToast.setGravity(Gravity.BOTTOM, 0, 125);
				betaToast.show();
		// Show Loading Toast Message
		
		
		
		WebView myWebView = (WebView) findViewById(R.id.webview);
		WebSettings webSettings = myWebView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		myWebView.setWebViewClient(new WebViewClient());
		myWebView.loadUrl("https://play.google.com/store/apps/details?id=com.facebook.katana");
		// Open up the Play Store in a WebView
		
		
	}
	
	
}