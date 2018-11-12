package com.example.momin.breakthedigits;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.gesture.Gesture;
import android.gesture.GestureLibraries;
import android.gesture.GestureLibrary;
import android.gesture.GestureOverlayView;
import android.gesture.Prediction;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class PaintView extends Activity  {
    private String num, number;

    GestureLibrary gestureLib;
    Intent intent;
    ImageView imageView=null;
    ImageView imageView2=null;
    Button Clc=null;
    private MediaPlayer noSound=null;
    private  MediaPlayer yesSound=null;

   private GestureOverlayView gestureOverlayView=null;


    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_gesture);

        initialize();





        gestureOverlayView.setGestureColor(Color.rgb(255, 0, 0));
        gestureOverlayView.setGestureVisible(true);
        gestureOverlayView.setUncertainGestureColor(Color.rgb(0, 0, 255));


        gestureLib = GestureLibraries.fromRawResource(this, R.raw.gestures);
        if (!gestureLib.load()) {
            Log.i("debug", "Failed");
        } else {
            Log.i("debug", "Loaded");

        }

        Log.i("debug", "oncreate");

        Clc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gestureOverlayView.clear(false);

            }
        });



          gestureOverlayView.addOnGesturePerformedListener(new GestureOverlayView.OnGesturePerformedListener() {
              @Override
              public void onGesturePerformed(GestureOverlayView gestureOverlayView, Gesture gesture) {

                  ArrayList<Prediction> predictions = gestureLib.recognize(gesture);


                  Log.i("debug", "gesturePerformed");
                  if (predictions.size() > 0) {
                      Log.i("debug", "prediction>0");


                          Prediction prediction = predictions.get(0);


                      if (prediction.score > 1) {
                          number = prediction.name;
                          Log.i("debug", "score>1");

                          if(number.equals(num)) {
                              imageView2.setImageResource(R.drawable.tomeat);
                              yesSound.start();
                          }
                          else {
                              imageView2.setImageResource(R.drawable.tomfear);
                              noSound.start();
                          }

                          //Toast.makeText(getApplicationContext(), number, Toast.LENGTH_LONG).show();


                      }

                  }

              }
          });







    }

    public void initialize(){

        if(imageView==null){
              imageView = findViewById(R.id.showImage);
                Intent intent = getIntent();
        num = intent.getStringExtra("zero");



     if(num.equalsIgnoreCase("zero"))
            imageView.setImageResource(R.drawable.zero);


         if(num.equalsIgnoreCase("one"))
            imageView.setImageResource(R.drawable.one);
        if(num.equalsIgnoreCase("two"))
            imageView.setImageResource(R.drawable.two);

        if(num.equalsIgnoreCase("three"))
            imageView.setImageResource(R.drawable.three);

        if(num.equalsIgnoreCase("four"))
            imageView.setImageResource(R.drawable.four);

        if(num.equalsIgnoreCase("five"))
            imageView.setImageResource(R.drawable.five);

        if(num.equalsIgnoreCase("six"))
            imageView.setImageResource(R.drawable.six);

        if(num.equalsIgnoreCase("seven"))
            imageView.setImageResource(R.drawable.seven);

        if(num.equalsIgnoreCase("eight"))
            imageView.setImageResource(R.drawable.eight);
        if(num.equalsIgnoreCase("nine"))
            imageView.setImageResource(R.drawable.nine);



}
if(Clc==null){

            Clc =findViewById(R.id.Clear);

}
if(yesSound==null){
 yesSound = MediaPlayer.create(PaintView.this,R.raw.yes);


}
if(noSound==null){

            noSound = MediaPlayer.create(PaintView.this,R.raw.fail);

}
if(imageView2==null){
            imageView2 = findViewById(R.id.image);
}

if(gestureOverlayView==null){
    gestureOverlayView = (GestureOverlayView) findViewById(R.id.sign_pad);


}


}






    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}


