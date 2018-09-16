package com.example.momin.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import android.widget.TextView;
import android.widget.Toast;

public class ItemList extends AppCompatActivity {
    Button button;
    String valOfItem;
    CheckBox checkable;
    String message,dept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
      // LoginPage loginPage = new LoginPage();
        Intent intent = getIntent();
       Bundle b = intent.getExtras();


        String valueOfName = b.get("findNam").toString();
        dept = b.get("findDep").toString();
        //final String valueOfdept = loginPage.findDept();
        TextView editText = findViewById(R.id.name);
        String PvalueOfName = "Welcome to "+valueOfName;
       // Toast.makeText(getApplicationContext(),valueOfName,Toast.LENGTH_LONG).show();
        editText.setText(PvalueOfName);
        button = findViewById(R.id.ordr);

        final String finalValueOfName = valueOfName;
        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

             //   message = list1.getItem();
                valOfItem = null;

                checkable = findViewById(R.id.pizza);
                if(checkable.isChecked()){
                    if(valOfItem == null)

                    valOfItem=("Pizza\n");
                    else valOfItem+=("Pizza\n");

                }

                checkable = findViewById(R.id.brger);
                if(checkable.isChecked())
                {   if(valOfItem==null)
                    valOfItem="Burger\n";
                    else valOfItem+="Burger\n";
                }

                checkable = findViewById(R.id.sndwitch);
                if(checkable.isChecked()){
                    if(valOfItem==null)
                    valOfItem="Sandwitch\n";
                    else  valOfItem+="Sandwitch\n";
                }

                checkable = findViewById(R.id.mtn);
                if(checkable.isChecked()){
                  if(valOfItem==null)
                        valOfItem="Mutton\n";
                    else  valOfItem+="Mutton\n";
                }

                message = valOfItem;
               message+="\n\t\tOrder By ";
                message+= finalValueOfName ;
                message+=" ";
                message+="\nDept of "+dept;
            Toast.makeText(getApplicationContext(),message, Toast.LENGTH_LONG).show();
           // message = null;


            }
        });

    }



}

