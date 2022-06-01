package org.techtown.opensource;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class loading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);

        startLoading();
    }

    private void startLoading() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(loading.this, LoginActivity.class);
                startActivity(intent);  //Loading 화면을 띄운다.
                finish();   //현재 액티비티 종료
            }
        },2000); // 화면에 로딩화면 2초간 보이기
    }
}