package com.example.edrom.androidtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void browseWeb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(intent);
    }

    public void showMap(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:26.934,-80.106?q=26.934,-80.106"));
        startActivity(intent);
    }

    public void makeCall(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:+14199021160"));
        startActivity(intent);
    }

}
