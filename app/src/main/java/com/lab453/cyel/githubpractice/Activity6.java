package com.lab453.cyel.githubpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

// 2017/05/29 在切換頁面時加入finish()   by 劉濬

//TODO 請進昇加入手機下翻時，螢幕保護的功能(利用FlippingManager和ScreenSaver)
//TODO 請進昇將更動寫在前面的註解裡，像是我上面寫的那樣
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
                finish();
            }
        });
    }
}