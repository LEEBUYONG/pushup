package com.example.pushup_plank_project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PlankActivity extends Activity implements View.OnClickListener {
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
//            Intent Intent01 = new Intent(PlankActivity.this, Configuration.class);
//            startActivity(Intent01); //인텐트 실행
//        }
//        if(view.getId()==R.id.goalBtnPlank){
//            Intent Intent02 = new Intent(PlankActivity.this, SettingsGoal.class);
//            startActivity(Intent02); //인텐트 실행
//        }
        if(view.getId()==R.id.changeBtnPlank){
            Intent Intent03 = new Intent(PlankActivity.this, MainActivity.class);
            startActivity(Intent03); //인텐트 실행
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alert_ex = new AlertDialog.Builder(this);
        alert_ex.setMessage("정말로 종료하시겠습니까?");

        alert_ex.setPositiveButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alert_ex.setNegativeButton("종료", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
            }
        });
        AlertDialog alert = alert_ex.create();
        alert.show();
    }
}