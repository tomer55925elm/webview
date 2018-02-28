package com.example.tomer.webview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    EditText tomer, tomer1, tomer2;
    TextView tomer3;
    Button tomer4;
    int w, y, z;
    WebView tomer6;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tomer = (EditText) findViewById(R.id.editText4);
        tomer1 = (EditText) findViewById(R.id.editText5);
        tomer2 = (EditText) findViewById(R.id.editText6);
        tomer4 = (Button) findViewById(R.id.button5);
        tomer3 = (TextView) findViewById(R.id.textView);
        tomer6 = (WebView) findViewById(R.id.tomer);
    }

    private void setTomer(View view) {
        String st = tomer.getText().toString();
        String st1 = tomer1.getText().toString();
        String st2 = tomer2.getText().toString();
        w = Integer.parseInt(st);//A
        y = Integer.parseInt(st1);//B
        z = Integer.parseInt(st2);//C
        tomer3.setText(w + "x^2+" + y + "x" + z);
        tomer4.getSettings().setJavaScriptEnabled(true);
        String url = "https://www.google.co.il/search?hl=iw&source=hp&ei=KbGAWsLZII-VsAfun5f4Bw&q=";
        url = url + w + "x%5E2%2B" + y + "x%2B" + z;
        tomer6.loadUrl(url);

    }
}
