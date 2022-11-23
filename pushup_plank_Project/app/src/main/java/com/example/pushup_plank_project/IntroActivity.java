package com.example.pushup_plank_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;

public class IntroActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        // 화면을 landscape(가로) 화면으로 고정
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), FirstLogin.class);
                startActivity(intent); //인트로 실행 후 바로 MainActivity로 넘어감.
                finish();
            }
        }, 1000); //1초 후 인트로 실행

    }
}