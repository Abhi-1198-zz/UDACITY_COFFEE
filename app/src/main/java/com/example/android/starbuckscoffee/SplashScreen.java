package com.example.android.starbuckscoffee;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ImageView gif = findViewById(R.id.gif);
                gif.setVisibility(View.GONE);
                ImageView bgf = findViewById(R.id.sbp);
                bgf.setVisibility(View.VISIBLE);
                View myButton = findViewById(R.id.bg);
                ImageView sb = findViewById(R.id.sb);
                sb.setVisibility((View.GONE));

                ObjectAnimator colorFade = ObjectAnimator.ofObject(myButton, "backgroundColor", new ArgbEvaluator(), Color.argb(4,255,255,255), 0xff593c1f);
                colorFade.setDuration(2000);
                colorFade.start();
                ProgressBar pb = findViewById(R.id.pb);
                pb.setVisibility(View.INVISIBLE);
                Button oc = findViewById(R.id.MainAct);
                oc.setVisibility(View.VISIBLE);
            }
        }, 3500);
        final Button button = findViewById(R.id.MainAct);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                SplashScreen.this.finish();
            }
        });
    }


}
