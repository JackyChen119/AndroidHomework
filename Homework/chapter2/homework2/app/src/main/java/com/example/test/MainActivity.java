package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.util.Log;


public class MainActivity extends AppCompatActivity {
    String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity", "onCreate");

        Button btn1 = findViewById(R.id.btn1);

        ImageView f1 = findViewById(R.id.figure1);
        ImageView f2 = findViewById(R.id.figure2);

        f1.setImageAlpha(0);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                f2.setImageAlpha(0);
                f1.setImageAlpha(255);
                Log.d(TAG, "OnClick_btn1");
            }
        });

        Button btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent it = new Intent();
                it.setClass(MainActivity.this, Activity_Second.class);
                MainActivity.this.startActivity(it);
            }
        });

        Button btn_xuexi = findViewById(R.id.btn_xuexi);
        btn_xuexi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent it = new Intent();
                it.setClass(MainActivity.this, Activity_Sakura.class);
                MainActivity.this.startActivity(it);
            }
        });

        Button btn_resou = findViewById(R.id.btn_resou);
        btn_resou.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent it = new Intent();
                it.setClass(MainActivity.this, Activity_RecyclerView.class);
                MainActivity.this.startActivity(it);
            }
        });

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("MainActivity", "onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("MainActivity", "onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("MainActivity", "onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("MainActivity", "onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("MainActivity", "onDestroy");
    }

}