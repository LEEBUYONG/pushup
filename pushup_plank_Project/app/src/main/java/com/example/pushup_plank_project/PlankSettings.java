package com.example.pushup_plank_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class PlankSettings extends AppCompatActivity implements View.OnClickListener {

    TextView plankChestTest1, plankChestTest2, plankChestTest3;
    TextView plankBellyTest1, plankBellyTest2, plankBellyTest3;
    TextView timerText;
    Button plankNextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plank_settings);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        // 화면을 landscape(가로) 화면으로 고정하고 싶은 경우

        //텍뷰 연결
        plankBellyTest1 = (TextView) findViewById(R.id.plankBellyTest1);
        plankBellyTest2 = (TextView) findViewById(R.id.plankBellyTest2);
        plankBellyTest3 = (TextView) findViewById(R.id.plankBellyTest3);
        plankChestTest1 = (TextView) findViewById(R.id.plankBellyTest1);
        plankChestTest2 = (TextView) findViewById(R.id.plankBellyTest2);
        plankChestTest3 = (TextView) findViewById(R.id.plankBellyTest3);

        //타이머텍뷰 연결
        timerText = (TextView) findViewById(R.id.plankTimer);

        //버튼 연결
        plankNextBtn = (Button) findViewById(R.id.plankNextBtn);
        plankNextBtn.setOnClickListener(this);

        //타이머- 1초씩 증가할때마다 좌측 상단 텍스트뷰에 숫자가 늘어나고, 5초 되면 초기화
        //굽힌거(3회) 안굽힌거(3회)로 5초씩 총 6번 반복(반복할때마다 배,가슴 편차 하나씩 입력받아 출력됨)
        //타이머 3번 끝나고 text(Text6st != null)이고 if(편차 < 5) 해당 페이지 재실행, (편차 > 5)라면 서버에 데이터 전달 후 MainActivity로 넘어감
        //현재 작동 안 함
        Timer timer = new Timer();

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {

            }
        };
        timer.schedule(timerTask, 0, 5000);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.plankNextBtn){
            Intent Intent01 = new Intent(PlankSettings.this, MainActivity.class);
            startActivity(Intent01); //인텐트 실행
        }
    }
}