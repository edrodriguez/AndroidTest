package com.example.edrom.androidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void submitName(View view)
    {
        EditText etName = (EditText) findViewById(R.id.etName);
        String name = etName.getText().toString();

        Intent intent = new Intent();
        intent.putExtra("name", name);
        setResult(RESULT_OK, intent);

        finish();
    }
}
