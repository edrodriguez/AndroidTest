package com.example.edrom.androidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import android.app.Dialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sayHello(View view) {
        Dialog dialog = new Dialog(this);
        dialog.setTitle("Greetings");
        TextView textView = new TextView(this);
        textView.setText("Hello World");
        textView.setPadding(20, 20, 20, 20);

        dialog.setContentView(textView);
        dialog.show();
    }
}
