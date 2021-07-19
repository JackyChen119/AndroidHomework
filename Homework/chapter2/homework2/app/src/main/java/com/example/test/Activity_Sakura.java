package com.example.test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Sakura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sakura);

        Button btn3_1 = findViewById(R.id.btn3_1);
        btn3_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog textTips = new AlertDialog.Builder(Activity_Sakura.this)
                        .setTitle("Tips:")
                        .setMessage("I will always love Sakurajima Mai！")
                        .create();
                textTips.show();
            }
        });

        Button btn3_2 = findViewById(R.id.btn3_2);
        btn3_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent it = new Intent();
                it.setClass(Activity_Sakura.this, MainActivity.class);
                Activity_Sakura.this.startActivity(it);
            }
        });

    }
}