package com.lab453.cyel.githubpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

// 2017/05/29 在切換頁面時加入finish()   by 劉濬

//TODO 請嘉委加入手機下翻時，螢幕保護的功能(利用FlippingManager和ScreenSaver)
//TODO 請嘉委將更動寫在前面的註解裡，像是我上面寫的那樣
public class Activity4 extends AppCompatActivity {

    Button button04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        //FIXME 注意到這裡有警告嗎? 請嘉委修復它。
        button04 = (Button) findViewById(R.id.button4);

        //FIXME 注意到這裡有警告嗎? 請嘉委修復它。
        Button nextPageBtn = (Button) findViewById(R.id.button4);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Activity4.this, com.lab453.cyel.githubpractice.Activity5.class);
                startActivity(intent);
                finish();
            }
        });

    }

}

