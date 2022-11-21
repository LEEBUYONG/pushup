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

public class PushupSettings extends AppCompatActivity implements View.OnClickListener {

    TextView pushupChestTest1, pushupChestTest2, pushupChestTest3;
    TextView pushupBellyTest1, pushupBellyTest2, pushupBellyTest3;
    TextView timerText;
    Button pushupnextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pushup_settings);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        // 화면을 landscape(가로) 화면으로 고정하고 싶은 경우

        //텍뷰 연결
        pushupBellyTest1 = (TextView) findViewById(R.id.pushupBellyTest1);
        pushupBellyTest2 = (TextView) findViewById(R.id.pushupBellyTest2);
        pushupBellyTest3 = (TextView) findViewById(R.id.pushupBellyTest3);
        pushupChestTest1 = (TextView) findViewById(R.id.pushupBellyTest1);
        pushupChestTest2 = (TextView) findViewById(R.id.pushupBellyTest2);
        pushupChestTest3 = (TextView) findViewById(R.id.pushupBellyTest3);

        //타이머텍뷰 연결
        timerText = (TextView) findViewById(R.id.pushupTimer);

        //버튼 연결
        pushupnextBtn = (Button) findViewById(R.id.pushupNextBtn);
        pushupnextBtn.setOnClickListener(this);

        //타이머- 1초씩 증가할때마다 좌측 상단 텍스트뷰에 숫자가 늘어나고, 5초 되면 초기화
        //굽힌거(3회) 안굽힌거(3회)로 5초씩 총 6번 반복(반복할때마다 배,가슴 편차 하나씩 입력받아 출력됨)
        //타이머 3번 끝나고 text(Text6st != null)이고 if(편차 < 5) 해당 페이지 재실행, (편차 > 5)라면 서버에 데이터 전달 후 플랭크 세팅 화면으로 넘어감
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
        if(v.getId()==R.id.pushupNextBtn){
            Intent Intent01 = new Intent(PushupSettings.this, PlankSettings.class);
            startActivity(Intent01); //인텐트 실행
        }
    }
}