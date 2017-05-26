package com.lab453.cyel.githubpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

//TODO 請劉濬做一個點擊後會跳到com.lab453.cyel.Activity3的Button
public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void clickButtonJumpToPageYiShuan(View view) {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
}
