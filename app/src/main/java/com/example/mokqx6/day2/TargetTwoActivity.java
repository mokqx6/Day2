package com.example.mokqx6.day2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class TargetTwoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Bundle bundle = getIntent().getExtras();//得到传过来的bundle
                String data = bundle.getString("data");//读出数据
        setTitle(data);
        TextView tv = (TextView) findViewById(R.id.paramText);
        tv.setText(data);
    }
}
