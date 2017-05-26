package com.lab453.cyel.githubpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

//TODO 請冠名做一個點擊後會跳到com.lab453.cyel.Activity6的Button
public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
    }

    public void goToActivity6(View view) {
        Intent intent = new Intent(this,Activity6.class);
        startActivity(intent);
    }
}
