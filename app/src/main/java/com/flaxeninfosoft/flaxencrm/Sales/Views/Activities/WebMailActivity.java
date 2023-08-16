package com.flaxeninfosoft.flaxencrm.Sales.Views.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.flaxeninfosoft.flaxencrm.R;

public class WebMailActivity extends AppCompatActivity {


    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_mail);

        wv = new WebView(WebMailActivity.this);
        setContentView(wv);

        wv.setWebViewClient(new MyBrowser());
        MyWebChromeClient myWebChromeClient = new MyWebChromeClient();
        wv.setWebChromeClient(myWebChromeClient);
        wv.getSettings().getAllowContentAccess();
        wv.getSettings().setLoadsImagesAutomatically(true);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        wv.getSettings().setPluginState(WebSettings.PluginState.ON);
        wv.getSettings().setSupportMultipleWindows(true);
        wv.loadUrl("https://flaxeninfosoft.com:2096/");


    }
    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
    public class MyWebChromeClient extends WebChromeClient {
        @Override
        public boolean onJsAlert(WebView view, String url, String message, JsResult jsResult) {
            System.out.println(message);
            wv.goBack();
            return false;
        }
    }
}