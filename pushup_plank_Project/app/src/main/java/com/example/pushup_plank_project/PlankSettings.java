package com.example.pushup_plank_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Timer;
import java.util.TimerTask;

public class PlankSettings extends Activity implements View.OnClickListener {

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

        //카운트다운 효과음
        MediaPlayer player = MediaPlayer.create(this, R.raw.countdown);

        //타이머- 1초씩 증가할때마다 좌측 상단 텍스트뷰에 숫자가 늘어나고, 5초 되면 초기화
        //총 9번 타이머 진행(굽힌거(3회) 안굽힌거(3회)로 5초씩 총 9번 반복)-반복할때마다 배,가슴 편차 하나씩 데이터 받아 출력
        CountDownTimer countDownTimer = new CountDownTimer(5000, 1000) {
            public void onTick(long millisUntilFinished) {
                // 두 자리 숫자로만 형식을 지정하는 데 사용
                NumberFormat f = new DecimalFormat("00");
                long sec = (millisUntilFinished / 1000) % 60;
                timerText.setText(f.format(sec)+"초");
//                player.start();
//                if(player.isPlaying()){
//                    player.stop();
//                    player.reset();
//                }
            }
            // 작업이 끝나면 00초 인쇄
            public void onFinish() {
                timerText.setText("05초");
//                player.stop();
            }
        };countDownTimer.start();

        //고개를 숙여서 카운트 인식이 되면 countDownTimer.start(); <이걸로 타이머 실행
        //5초가 끝나고 고개를 들고 카운트 인식이 되면 countDownTimer.cancel(); <이걸로 타이머 종료
        // 굽힌거 5초, 안 굽힌거 5초를 한세트 기준으로 가슴과 배 편차 값 정수로 출력

        //타이머 3번 끝나고  (편차텍스트6개 != null && 6개의 편차값 > 5) 해당 페이지 재실행, if (6개의 편차값 < 5)라면 서버에 데이터 전달 후 MainActivity로 넘어감

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.plankNextBtn){
            Intent Intent01 = new Intent(PlankSettings.this, MainActivity.class);
            startActivity(Intent01); //인텐트 실행
        }
    }

    //음악파일이 리소스 잡아먹는걸 방지
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        // MediaPlayer 해지
//        if(player != null) {
//            player.release();
//            player = null;
//        }
//    }
}