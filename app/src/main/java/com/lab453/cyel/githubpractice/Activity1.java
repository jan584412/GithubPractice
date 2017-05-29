package com.lab453.cyel.githubpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

// 2017/05/29 在切換頁面時加入finish()   by 劉濬

//TODO 請老師加入手機下翻時，螢幕保護的功能(利用FlippingManager和ScreenSaver)
public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
    }

    public void clickButtonJumpToPageJim(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
        finish();
    }
}
