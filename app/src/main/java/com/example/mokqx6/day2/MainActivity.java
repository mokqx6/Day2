package com.example.mokqx6.day2;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import static android.R.attr.button;
import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {
    Toast tst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // 注意 这里没有 @Override 标签
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.button:toActivityTwo();
                break;
            default:
                break;
        }
    }
    public void toastMesg(){
        tst =Toast.makeText(getApplicationContext(),
                "带图片的Toast", Toast.LENGTH_LONG);
        tst.setGravity(Gravity.CENTER, 0, 0);
        LinearLayout toastView = (LinearLayout) tst.getView();
        ImageView imageCodeProject = new ImageView(getApplicationContext());
        imageCodeProject.setImageResource(R.drawable.gif1);
        toastView.addView(imageCodeProject, 0);
        tst.show();
    }
    public void toActivityTwo(){
        Bundle bd  = new Bundle();
        bd.putString("data","这是携带的数据");
        Intent it = new Intent();
        it.setClass(MainActivity.this,ServiceTestActivity.class);
        it.putExtras(bd);
        startActivity(it);
    }
    public void intentDemo_Call() {
        Intent intent_call = new Intent();                //创建一个意图
        intent_call.setAction(Intent.ACTION_CALL);        //设置意图为打电话
        intent_call.setData(Uri.parse("tel:110"));        //设置电话号码
        startActivity(intent_call);
    }
    }
