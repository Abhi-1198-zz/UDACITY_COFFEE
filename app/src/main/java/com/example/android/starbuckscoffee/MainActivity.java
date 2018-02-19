package com.example.android.starbuckscoffee;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TOAST
        Context context = getApplicationContext();
        CharSequence text = "Welcome To Starbucks";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text,duration);
        toast.show();
    }


}
