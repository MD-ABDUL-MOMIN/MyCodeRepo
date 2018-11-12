package com.example.momin.breakthedigits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tom);
        Thread thread = new Thread()
        {
            @Override
            public void run() {
                try{
                    sleep(5000);

                }catch (Exception e ){
                    e.printStackTrace();

                }
                finally {
                    Intent intent = new Intent(TomActivity.this,numbersActivity.class);
                    startActivity(intent);

                }
            }
        };
        thread.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
