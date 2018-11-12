package com.example.momin.breakthedigits;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class numbersActivity extends AppCompatActivity {

    private ImageButton ione,itwo,izero,ithree,ifour,ifive,isix,iseven,ieight,inine ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

      setActionLisenter();



    }

    private void setActionLisenter() {

        izero = findViewById(R.id.info0);
        ione = findViewById(R.id.info1);
        itwo = findViewById(R.id.info2);
        ithree = findViewById(R.id.info3);
        ifour= findViewById(R.id.info4);
        ifive = findViewById(R.id.info5);
        isix = findViewById(R.id.info6);
        iseven = findViewById(R.id.info7);
        ieight= findViewById(R.id.info8);
        inine = findViewById(R.id.info9);


        izero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(numbersActivity.this,PaintView.class);
                intent.putExtra("zero","zero");
                startActivity(intent);

            }
        });
        ione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(numbersActivity.this,PaintView.class);
                intent.putExtra("zero","one");
                startActivity(intent);

            }
        });
        itwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(numbersActivity.this,PaintView.class);
                intent.putExtra("zero","two");
                startActivity(intent);

            }
        });
        ithree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(numbersActivity.this,PaintView.class);
                intent.putExtra("zero","three");
                startActivity(intent);

            }
        });
        ifour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(numbersActivity.this,PaintView.class);
                intent.putExtra("zero","four");
                startActivity(intent);

            }
        });
        ifive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(numbersActivity.this,PaintView.class);
                intent.putExtra("zero","five");
                startActivity(intent);

            }
        });
        isix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(numbersActivity.this,PaintView.class);
                intent.putExtra("zero","six");
                startActivity(intent);

            }
        });
        iseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(numbersActivity.this,PaintView.class);
                intent.putExtra("zero","seven");
                startActivity(intent);

            }
        });
        ieight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(numbersActivity.this,PaintView.class);
                intent.putExtra("zero","eight");
                startActivity(intent);

            }
        });
        inine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(numbersActivity.this,PaintView.class);
                intent.putExtra("zero","nine");
                startActivity(intent);

            }
        });





    }
}
