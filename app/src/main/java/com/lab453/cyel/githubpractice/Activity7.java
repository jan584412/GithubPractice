package com.lab453.cyel.githubpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

// 2017/05/29 在切換頁面時加入finish()   by 劉濬

//TODO 請啟展加入手機下翻時，螢幕保護的功能(利用FlippingManager和ScreenSaver)
//TODO 請啟展將更動寫在前面的註解裡，像是我上面寫的那樣
public class Activity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoAct();
            }
        });
    }

    private void gotoAct(){
        Intent intent = new Intent(this, Activity1.class);
        startActivity(intent);
        finish();
    }
}
