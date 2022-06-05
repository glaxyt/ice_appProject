package org.techtown.opensource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button btn_login;
    Button btn_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = findViewById(R.id.btn_login); // 로그인 버튼
        btn_register = findViewById(R.id.btn_register); // 회원가입 버튼

        // 로그인 버튼 클릭 시에 FoodCategory로 넘어감
        btn_login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(LoginActivity.this, FoodCategory.class);
                startActivity(intent);
            }
        });
        // 로그인 버튼 클릭 시에 register로 넘어감
        btn_register.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
