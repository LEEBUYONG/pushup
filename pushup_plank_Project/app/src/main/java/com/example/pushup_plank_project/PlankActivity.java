package com.example.pushup_plank_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PlankActivity extends AppCompatActivity implements View.OnClickListener {
//    TextView textSuccess1stPlank, textSuccess2stPlank, textSuccess3stPlank;
    ImageButton settingBtnPlank, goalBtnPlank, changeBtnPlank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plank);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        // 화면을 landscape(가로) 화면으로 고정하고 싶은 경우

        settingBtnPlank = (ImageButton) findViewById(R.id.settingBtnPlank);
        settingBtnPlank.setOnClickListener(this);

        goalBtnPlank = (ImageButton) findViewById(R.id.goalBtnPlank);
        goalBtnPlank.setOnClickListener(this);

        changeBtnPlank = (ImageButton) findViewById(R.id.changeBtnPlank);
        changeBtnPlank.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//        if(view.getId()==R.id.settingBtnPlank){
//            Intent Intent01 = new Intent(PlankActivity.this, settingsPopup.class);
//            startActivity(Intent01); //인텐트 실행
//        }
//        if(view.getId()==R.id.goalBtnPlank){
//            Intent Intent01 = new Intent(PlankActivity.this, goalSettingPopup.class);
//            startActivity(Intent01); //인텐트 실행
//        }
        if(view.getId()==R.id.changeBtnPlank){
            Intent Intent01 = new Intent(PlankActivity.this, MainActivity.class);
            startActivity(Intent01); //인텐트 실행
        }
    }
}