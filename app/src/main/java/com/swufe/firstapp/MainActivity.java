package com.swufe.firstapp;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView out;
    EditText inp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        out = (TextView) findViewById(R.id.showText);
         inp = (EditText) findViewById(R.id.inpText);

        Button btn = (Button)findViewById(R.id.btn1);
        //当前类做监听
       // btn.setOnClickListener(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("mail","onClick called.....");

            }
        });//匿名类监听


        };




    @Override
    public void onClick(View v) {
        Log.i("click","onClick....");//去获取用户输入，改变输出
       // TextView tv = (TextView) findViewById(R.id.showText);//输出控件
       // EditText inp = (EditText) findViewById(R.id.inpText);//输入控件
        String str = inp.getText().toString();//获得用户输入数据
        out.setText("Hello"+str);



    }
    public void btnClick(View btn){
        Log.i("click","btnClick called......");
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
