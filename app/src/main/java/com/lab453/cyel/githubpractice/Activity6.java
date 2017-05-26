package com.lab453.cyel.githubpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//TODO 請進昇做一個點擊後會跳到com.lab453.cyel.Activity7的Button
public class Activity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        Button NextPageButton =(Button)findViewById(R.id.button1);
        NextPageButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Activity6.this, Activity7.class);
                startActivity(intent);

            }
        });
    }
}