package com.lab453.cyel.githubpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

//TODO 請亦軒做一個點擊後會跳到com.lab453.cyel.Activity4的Button
public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

    public void goToActivity4(View view) {
        Intent intent=new Intent();
        intent.setClass(this,Activity4.class);
        startActivity(intent);
    }
}
