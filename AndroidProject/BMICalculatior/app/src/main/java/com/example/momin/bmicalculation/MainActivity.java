package com.example.momin.bmicalculation;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import static android.view.View.*;

public class MainActivity extends Activity {


     private Spinner spinnerMass,spinnerHeight;
     private Button btn,resetBtn;
     private  TextView tv;
     private  double BMI,mass,height;
     private EditText heightvalue ,massvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =  findViewById(R.id.btn_sub);
        spinnerHeight = findViewById(R.id.unit_height);
        spinnerMass = findViewById(R.id.unit_mass);
        tv = findViewById(R.id.result);
        heightvalue = findViewById(R.id.height_value);

        massvalue = findViewById(R.id.mass_value);



        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {


                if(spinnerMass.getSelectedItemPosition()==0||spinnerHeight.getSelectedItemPosition()==0){

                    tv.setText("Try again......\n select unit carefully");



                }
                else {


                    try {
                        String textM = massvalue.getText().toString();
                        String textH = heightvalue.getText().toString();
                        double valH = Double.parseDouble(textH);
                        double valM = Double.parseDouble(textM);
                        double tem = 0, tem1 = 1;
                        if (textM== null || textH == null) {

                            tv.setText("Try again......\n unit or value error");
                        } else {

                            if (spinnerMass.getSelectedItemPosition() == 1)
                                tem = valM * 0.453592;
                            else if (spinnerMass.getSelectedItemPosition() == 2)
                                tem = valM;
                            else
                                tem = valM * 14.5939;


                            if (spinnerHeight.getSelectedItemPosition() == 1)
                                tem1 = valH * 0.01;
                            else if (spinnerHeight.getSelectedItemPosition() == 2)
                                tem1 = valH * 0.3048;
                            else
                                tem1 = valH * 0.0254;


                            if (tem1 != 0) {
                                String predict=null;
                                BMI = (tem) / (tem1 * tem1);
                                if(BMI<15) predict= "Very severely underweight";
                                else if( BMI<16 && BMI>=15) predict="Severely underweight";
                                else if( BMI<18.5 && BMI>=16) predict="Underweight";
                                else if( BMI<25 && BMI>=18.5) predict="Normal (healthy weight)";
                                else if( BMI<30 && BMI>=25) predict="Overweight";
                                else if( BMI<35 && BMI>=30) predict="Moderately obese";
                                else if( BMI<40 && BMI>=35) predict="Severely obese";
                                else if( BMI>=40) predict="Very severely obese";


                                tv.setText("Observation:  "+predict);

                            }
                            else {


                                tv.setText("Sorry try again\n please check value or unit ");

                            }

                        }


                    }catch (Exception e){
                        System.out.println(e);

                    }

                }


            }
        });

        resetBtn = findViewById(R.id.reset);
        resetBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                heightvalue.setText(null);
                massvalue.setText(null);
                spinnerMass.setSelection(0);
                spinnerHeight.setSelection(0);
                tv.setText("Click on calculate BMI button");


            }
        });



    }
}