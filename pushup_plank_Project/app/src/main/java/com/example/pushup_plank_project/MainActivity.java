package com.example.pushup_plank_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //    TextView textSuccess1st, textSuccess2st, textSuccess3st;
    ImageButton settingBtn01, goalBtn01, changeBtn01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 화면을 landscape(가로) 화면으로 고정
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        settingBtn01 = (ImageButton) findViewById(R.id.settingBtnPushup);
        settingBtn01.setOnClickListener(this);

        goalBtn01 = (ImageButton) findViewById(R.id.goalBtnPushup);
        goalBtn01.setOnClickListener(this);

        changeBtn01 = (ImageButton) findViewById(R.id.changeBtnPushup);
        changeBtn01.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//        if(view.getId()==R.id.settingBtnPlank){
//            Intent Intent01 = new Intent(MainActivity.this, PopupSettings.class);
//            startActivity(Intent01); //인텐트 실행
//        }
//        if(view.getId()==R.id.goalBtnPlank){
//            Intent Intent01 = new Intent(MainActivity.this, PopupGoal.class);
//            startActivity(Intent01); //인텐트 실행
//        }
        if(view.getId()==R.id.changeBtnPushup){
            Intent Intent01 = new Intent(MainActivity.this, PlankActivity.class);
            startActivity(Intent01); //인텐트 실행
        }
    }
}