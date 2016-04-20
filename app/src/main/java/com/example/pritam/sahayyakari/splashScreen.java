package com.example.pritam.sahayyakari;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;

/**
 * Created by Pritam on 20-04-2016.
 */
public class splashScreen extends Activity {
    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;
    private ProgressBar spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);
        spinner=(ProgressBar)findViewById(R.id.progressBar);
       // spinner.setVisibility(View.GONE);

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(splashScreen.this, MainActivity.class);
                startActivity(i);
                spinner.setVisibility(View.VISIBLE);


                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
   /* @Override
    protected void onStart()
    {
        // TODO Auto-generated method stub
        super.onStart();
        spinner.setVisibility(View.VISIBLE);
    }*/
}
