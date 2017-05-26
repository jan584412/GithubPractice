package com.lab453.cyel.githubpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//TODO 請嘉委做一個點擊後會跳到com.lab453.cyel.Activity5的Button
public class Activity4 extends AppCompatActivity {

    Button button04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        button04 = (Button) findViewById(R.id.button4);

        Button nextPageBtn = (Button) findViewById(R.id.button4);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Activity4.this, com.lab453.cyel.githubpractice.Activity5.class);
                startActivity(intent);
            }
        });

    }

}

