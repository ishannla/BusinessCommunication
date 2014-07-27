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

public class QuizletActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.facebook);
		// Attach Quizlet Activity File
		
		Button previousButton = (Button) findViewById(R.id.previousButton);
		
		new AlertDialog.Builder(this)
		.setTitle("Business Communication Guide")
		.setMessage("Use this Quizlet to enhance your understanding of Business Communication. This Quizlet has been provided by Gwozdziemoto and proven to be incredibly helpful." )
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
		myWebView.loadUrl("http://quizlet.com/27262282/business-communications-terms-flash-cards/");
		// Open up Quizlet in a WebView
		
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