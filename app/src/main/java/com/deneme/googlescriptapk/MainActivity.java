package com.deneme.googlescriptapk;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true); 
        webView.setWebViewClient(new WebViewClient());
        
        // BURAYA KENDİ GOOGLE SCRIPT LİNKİNİ YAPIŞTIRACAĞIZ
        webView.loadUrl("https://script.google.com/macros/s/.../exec"); 
        
        setContentView(webView);
    }
}