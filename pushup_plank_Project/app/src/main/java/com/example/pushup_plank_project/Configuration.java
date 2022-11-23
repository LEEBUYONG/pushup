package com.example.pushup_plank_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class Configuration extends Activity {

    TextView txtText02;
    SeekBar seekBar;
    AudioManager maudioManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);

//        // 화면을 landscape(가로) 화면으로 고정
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //음량값 받기
        seekBar = findViewById(R.id.seekBar);
        maudioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
        int maxVol = maudioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        //최대치 값을 가져와서 seekBar Max로 하기
        seekBar.setMax(maxVol);
        //Seekbar로 음량 변경
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
//             textView.setText("변환값 "+  i);
               //음악 음량 변경
                maudioManager.setStreamVolume(AudioManager.STREAM_MUSIC, i, AudioManager.FLAG_SHOW_UI);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

//        //데이터 가져오기
//        Intent intent = getIntent();
//        String data = intent.getStringExtra("data");
//        txtText.setText(data);  //가져와서 출력할 데이터 텍뷰 입력
    }

    //확인 버튼 클릭
    public void mOnClose(View v){
        //데이터 전달하기
        Intent intent = new Intent();
        intent.putExtra("result", "Close Popup");
        setResult(RESULT_OK, intent);

        //액티비티(팝업) 닫기
        finish();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //바깥레이어 클릭시 안닫히게
        if(event.getAction()==MotionEvent.ACTION_OUTSIDE){
            return false;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        //안드로이드 백버튼 막기
        return;
    }
}