package com.lab453.cyel.githubpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//TODO 請啟展做一個點擊後會跳到com.lab453.cyel.Activity1的Button
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
    }
}
