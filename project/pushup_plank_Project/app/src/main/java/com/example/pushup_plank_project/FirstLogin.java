package com.example.pushup_plank_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class FirstLogin extends AppCompatActivity implements View.OnClickListener {

    Button loginBtn;
    EditText id01, name01;
    EditText age01;
    RadioButton female, male;

    //spinner
    ArrayAdapter<CharSequence> adspin1, adspin2; //어댑터를 선언했 adspint1(서울,인천..) adspin2(강남구,강서구..)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_login);

        // 화면을 landscape(가로) 화면으로 고정
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //button 연결
        loginBtn = (Button) findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(this);

        //spinner 연결
        final Spinner spin1 = (Spinner)findViewById(R.id.spin_city);
        final Spinner spin2 = (Spinner)findViewById(R.id.spin_sigungu);

        //spinner dropdown
        adspin1 = ArrayAdapter.createFromResource(this, R.array.spinner_region, android.R.layout.simple_spinner_dropdown_item);
        adspin1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(adspin1);
        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (adspin1.getItem(i).equals("서울특별시")) {
                    adspin2 = ArrayAdapter.createFromResource(FirstLogin.this, R.array.spinner_region_seoul, android.R.layout.simple_spinner_dropdown_item);

                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        //두번째 선택된 값도 필요하면 이 안에 두번째 spinner 선택 이벤트를 정의
                        @Override

                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            //choice_se = adspin2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                } else if (adspin1.getItem(i).equals("부산광역시")) {
                    adspin2 = ArrayAdapter.createFromResource(FirstLogin.this, R.array.spinner_region_busan, android.R.layout.simple_spinner_dropdown_item);

                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        //두번째 선택된 값도 필요하면 이 안에 두번째 spinner 선택 이벤트를 정의
                        @Override

                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            //choice_se = adspin2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                } else if (adspin1.getItem(i).equals("대구광역시")) {
                    adspin2 = ArrayAdapter.createFromResource(FirstLogin.this, R.array.spinner_region_daegu, android.R.layout.simple_spinner_dropdown_item);

                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        //두번째 선택된 값도 필요하면 이 안에 두번째 spinner 선택 이벤트를 정의
                        @Override

                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            //choice_se = adspin2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                } else if (adspin1.getItem(i).equals("인천광역시")) {
                    adspin2 = ArrayAdapter.createFromResource(FirstLogin.this, R.array.spinner_region_incheon, android.R.layout.simple_spinner_dropdown_item);

                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        //두번째 선택된 값도 필요하면 이 안에 두번째 spinner 선택 이벤트를 정의
                        @Override

                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            //choice_se = adspin2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                } else if (adspin1.getItem(i).equals("광주광역시")) {
                    adspin2 = ArrayAdapter.createFromResource(FirstLogin.this, R.array.spinner_region_gwangju, android.R.layout.simple_spinner_dropdown_item);

                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        //두번째 선택된 값도 필요하면 이 안에 두번째 spinner 선택 이벤트를 정의
                        @Override

                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            //choice_se = adspin2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                } else if (adspin1.getItem(i).equals("대전광역시")) {
                    adspin2 = ArrayAdapter.createFromResource(FirstLogin.this, R.array.spinner_region_daejeon, android.R.layout.simple_spinner_dropdown_item);

                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        //두번째 선택된 값도 필요하면 이 안에 두번째 spinner 선택 이벤트를 정의
                        @Override

                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            //choice_se = adspin2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                } else if (adspin1.getItem(i).equals("울산광역시")) {
                    adspin2 = ArrayAdapter.createFromResource(FirstLogin.this, R.array.spinner_region_ulsan, android.R.layout.simple_spinner_dropdown_item);

                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        //두번째 선택된 값도 필요하면 이 안에 두번째 spinner 선택 이벤트를 정의
                        @Override

                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            //choice_se = adspin2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                } else if (adspin1.getItem(i).equals("세종특별자치시")) {
                    adspin2 = ArrayAdapter.createFromResource(FirstLogin.this, R.array.spinner_region_sejong, android.R.layout.simple_spinner_dropdown_item);

                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        //두번째 선택된 값도 필요하면 이 안에 두번째 spinner 선택 이벤트를 정의
                        @Override

                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            //choice_se = adspin2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                } else if (adspin1.getItem(i).equals("경기도")) {
                    adspin2 = ArrayAdapter.createFromResource(FirstLogin.this, R.array.spinner_region_gyeonggi, android.R.layout.simple_spinner_dropdown_item);

                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        //두번째 선택된 값도 필요하면 이 안에 두번째 spinner 선택 이벤트를 정의
                        @Override

                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            //choice_se = adspin2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                } else if (adspin1.getItem(i).equals("강원도")) {
                    adspin2 = ArrayAdapter.createFromResource(FirstLogin.this, R.array.spinner_region_gangwon, android.R.layout.simple_spinner_dropdown_item);

                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        //두번째 선택된 값도 필요하면 이 안에 두번째 spinner 선택 이벤트를 정의
                        @Override

                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            //choice_se = adspin2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                } else if (adspin1.getItem(i).equals("충청북도")) {
                    adspin2 = ArrayAdapter.createFromResource(FirstLogin.this, R.array.spinner_region_chung_buk, android.R.layout.simple_spinner_dropdown_item);

                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        //두번째 선택된 값도 필요하면 이 안에 두번째 spinner 선택 이벤트를 정의
                        @Override

                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            //choice_se = adspin2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                } else if (adspin1.getItem(i).equals("충청남도")) {
                    adspin2 = ArrayAdapter.createFromResource(FirstLogin.this, R.array.spinner_region_chung_nam, android.R.layout.simple_spinner_dropdown_item);

                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        //두번째 선택된 값도 필요하면 이 안에 두번째 spinner 선택 이벤트를 정의
                        @Override

                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            //choice_se = adspin2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                } else if (adspin1.getItem(i).equals("전라북도")) {
                    adspin2 = ArrayAdapter.createFromResource(FirstLogin.this, R.array.spinner_region_jeon_buk, android.R.layout.simple_spinner_dropdown_item);

                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        //두번째 선택된 값도 필요하면 이 안에 두번째 spinner 선택 이벤트를 정의
                        @Override

                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            //choice_se = adspin2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                } else if (adspin1.getItem(i).equals("전라남도")) {
                    adspin2 = ArrayAdapter.createFromResource(FirstLogin.this, R.array.spinner_region_jeon_nam, android.R.layout.simple_spinner_dropdown_item);

                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        //두번째 선택된 값도 필요하면 이 안에 두번째 spinner 선택 이벤트를 정의
                        @Override

                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            //choice_se = adspin2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                } else if (adspin1.getItem(i).equals("경상북도")) {
                    adspin2 = ArrayAdapter.createFromResource(FirstLogin.this, R.array.spinner_region_gyeong_buk, android.R.layout.simple_spinner_dropdown_item);

                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        //두번째 선택된 값도 필요하면 이 안에 두번째 spinner 선택 이벤트를 정의
                        @Override

                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            //choice_se = adspin2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                } else if (adspin1.getItem(i).equals("경상남도")) {
                    adspin2 = ArrayAdapter.createFromResource(FirstLogin.this, R.array.spinner_region_gyeong_nam, android.R.layout.simple_spinner_dropdown_item);

                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        //두번째 선택된 값도 필요하면 이 안에 두번째 spinner 선택 이벤트를 정의
                        @Override

                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            //choice_se = adspin2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                } else if (adspin1.getItem(i).equals("제주특별자치도")) {
                    adspin2 = ArrayAdapter.createFromResource(FirstLogin.this, R.array.spinner_region_jeju, android.R.layout.simple_spinner_dropdown_item);

                    adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spin2.setAdapter(adspin2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        //두번째 선택된 값도 필요하면 이 안에 두번째 spinner 선택 이벤트를 정의
                        @Override

                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            //choice_se = adspin2.getItem(i).toString();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.loginBtn){
            Intent Intent01 = new Intent(FirstLogin.this, PushupSettings.class);
            startActivity(Intent01); //인텐트 실행
        }
    }
}