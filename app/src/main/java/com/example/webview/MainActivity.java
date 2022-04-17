package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText url;
    Button go;
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url = (EditText) findViewById(R.id.in_Url);
        go = (Button) findViewById(R.id.Go);
        web = (WebView) findViewById(R.id.Web);
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new myWeb());

    }

    public void goToWebsite(View view) {
        String site = url.getText().toString();
        web.loadUrl(site);
    }

    private class myWeb extends WebViewClient {
        public boolean urloading(WebView view, String url)
        {
            view.loadUrl(url);
            return true;
        }
    }
}