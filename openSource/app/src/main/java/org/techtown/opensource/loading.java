package org.techtown.opensource;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class loading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {  // loading 화면을 위한 함수 작성.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);

        startLoading();
    }

    private void startLoading() {   // 로딩화면 Handler 객체를 이용해서 화면 전개.
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Loading 화면이 종료된 뒤에 login화면으로 이동
                Intent intent = new Intent(loading.this, LoginActivity.class);
                startActivity(intent);  //Loading 화면을 띄운다.
                finish();   //현재 액티비티 종료
            }
        },2000); // 화면에 로딩화면 2초간 보이기
    }
}
