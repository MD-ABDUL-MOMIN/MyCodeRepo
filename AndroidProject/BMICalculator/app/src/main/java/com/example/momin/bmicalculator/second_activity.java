package com.example.momin.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;

public class second_activity extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        Intent intent = getIntent();
        String value = intent.getStringExtra("key");
        String value1 = intent.getStringExtra("right");
        textView = findViewById(R.id.observation);
        textView.setText(value);

        imageView = findViewById(R.id.showImage);
        if(value1.equalsIgnoreCase("tru")) {
            imageView.setImageResource(R.drawable.right);
          textView.setTextColor(GREEN);
        }
       else {
            imageView.setImageResource(R.drawable.wrong);
            textView.setTextColor(RED);
        }



    }
}
