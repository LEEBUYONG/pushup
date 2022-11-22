package com.example.pushup_plank_project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textSuccess1st, textSuccess2st, textSuccess3st;
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
//            Intent Intent01 = new Intent(MainActivity.this, Configuration.class);
//            startActivity(Intent01); //인텐트 실행
//                startActivity(new Intent(MainActivity.this, Configuration.class));
//        }
//        if(view.getId()==R.id.goalBtnPlank){
//            Intent Intent02 = new Intent(MainActivity.this, SettingsGoal.class);
//            startActivity(Intent02); //인텐트 실행
//        }
        if(view.getId()==R.id.changeBtnPushup){
            Intent Intent03 = new Intent(MainActivity.this, PlankActivity.class);
            startActivity(Intent03); //인텐트 실행
        }
    }

    //만약 다른 액티비티에서 데이터를 주고 받는다면 사용
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == 1) {
//            if (resultCode == RESULT_OK) {
//                String result = data.getStringExtra("result");
//                textSuccess1st.setText(result);    //받아온 데이터를 입력받을 텍스트뷰
//                textSuccess2st.setText(result);    //받아온 데이터를 입력받을 텍스트뷰
//                textSuccess3st.setText(result);    //받아온 데이터를 입력받을 텍스트뷰
//            }
//        }
//    }

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