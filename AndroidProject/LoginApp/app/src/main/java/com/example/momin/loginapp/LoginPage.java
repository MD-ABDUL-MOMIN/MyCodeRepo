package com.example.momin.loginapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginPage extends AppCompatActivity {

    Button btn;
    EditText valueOfName, valueOfDept;
   String message,message1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        btn = findViewById(R.id.bSubmit);
        valueOfName = findViewById(R.id.getName);
        valueOfDept = findViewById(R.id.getDept);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = valueOfName.getText().toString();
                message1 = valueOfDept.getText().toString();
             Intent   i = new Intent(LoginPage.this,ItemList.class);
               i.putExtra("findNam", message);
               i.putExtra("findDep",message1);
                startActivity(i);
                
            }
        });




    }


        String findName(){
            valueOfName = findViewById(R.id.getName);
            return valueOfName.getText().toString();


        }

        String findDept(){

            valueOfDept = findViewById(R.id.getDept);

            return valueOfDept.getText().toString();

        }



        }



