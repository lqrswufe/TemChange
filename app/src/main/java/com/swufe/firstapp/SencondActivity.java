package com.swufe.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SencondActivity extends AppCompatActivity {
     TextView score;
    TextView textName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sencond);//score是“请输入摄氏度”，textNAME是结果
        findViewById(R.id.score);
        score=findViewById(R.id.score);
        textName=findViewById(R.id.textName);
    }
    public void btnAdd(View btn){
        String inpNumber =score.getText().toString();
        double  oldNumber=Double.parseDouble(inpNumber);
        textName.setText("结果是："+showNumber(oldNumber));
    }
    private double showNumber(double a){
        Log.i("btn","turn");
        return (double) (a*1.8+32);
    }
}