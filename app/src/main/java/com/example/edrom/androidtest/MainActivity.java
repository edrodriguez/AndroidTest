package com.example.edrom.androidtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity extends Activity {

    private static final int REQUEST_CODE_NAME = 0;
    private TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOutput = (TextView) findViewById(R.id.tvOutput);
    }

    public void setName(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, REQUEST_CODE_NAME);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE_NAME)
        {
            if(resultCode == RESULT_OK)
            {
                String name = data.getStringExtra("name");
                tvOutput.setText(String.format(getString(R.string.Welcome_Back),name));
            }
        }
    }
}
