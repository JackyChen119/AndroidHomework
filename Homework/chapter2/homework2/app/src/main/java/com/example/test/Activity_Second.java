package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Second extends AppCompatActivity {
    String TAG = "Activity_2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btn2_1 = findViewById(R.id.btn2_1);
        ImageView f1 = findViewById(R.id.figure1);
        ImageView f2 = findViewById(R.id.figure2);

        f1.setImageAlpha(0);

        btn2_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                f2.setImageAlpha(0);
                f1.setImageAlpha(255);
                Toast.makeText(Activity_Second.this, "button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Button btn2_2 = findViewById(R.id.btn2_2);
        btn2_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent it = new Intent();
                it.setClass(Activity_Second.this, MainActivity.class);
                Activity_Second.this.startActivity(it);
            }
        });

        Button btn2_3 = findViewById(R.id.btn2_3);
        btn2_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent it = new Intent(Intent.ACTION_VIEW);
                it.setData(Uri.parse("https://www.baidu.com"));
                Activity_Second.this.startActivity(it);
            }
        });

        Button btn2_4 = findViewById(R.id.btn2_4);
        btn2_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent dialIntent = new Intent(Intent.ACTION_CALL_BUTTON);
                Activity_Second.this.startActivity(dialIntent);
            }
        });

    }
}
