package com.bytedance.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        final CheckBox two=(CheckBox)findViewById(R.id.checkBox1);//获取大二复选按钮
        final CheckBox three=(CheckBox)findViewById(R.id.checkBox2);//获取大三复选按钮
        final CheckBox cs=(CheckBox)findViewById(R.id.checkBox3);//获取计科复选按钮
        final CheckBox se=(CheckBox)findViewById(R.id.checkBox4);//获取软工复选按钮
        final TextView tv1 = findViewById(R.id.tv1);
        final TextView tv3 = findViewById(R.id.tv3);
        final EditText stuname=(EditText)findViewById(R.id.name);//获取姓名信息



        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                String Infor="";
                if(two.isChecked())
                    Infor+=two.getText().toString()+" ";
                if(three.isChecked())
                    Infor+=three.getText().toString()+" ";
                if(cs.isChecked())
                    Infor+=cs.getText().toString()+" ";
                if(se.isChecked())
                    Infor+=se.getText().toString()+" ";
                String Tex=stuname.getText().toString();
                tv1.setText("Registered Successfully!");
                tv3.setText("Your registration information is:"+Infor+Tex);
            }
        });
    }
}