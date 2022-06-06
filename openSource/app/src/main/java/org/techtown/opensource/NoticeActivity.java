package org.techtown.opensource;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NoticeActivity extends AppCompatActivity {

    private Button btn_post, btnpost; //게시글 작성 버튼, 카테고리로 이동하는 버튼
    private TextView tv_1; //게시글이 저장될 공간

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        tv_1 = findViewById(R.id.tv_1);     //화면전환이 되면서 WriteActivity로부터 intent값 받는 코드
        Intent intent = getIntent();
        String str = intent.getStringExtra("str");
        tv_1.setText(str);

        btn_post = findViewById(R.id.btn_post); //게시글 작성버튼
        btn_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //intent를 활용하여 WriteActivity로 화면전환
                Intent intent = new Intent(NoticeActivity.this, WriteActivity.class);
                intent.putExtra("key", 1); //카테고리별로 값을 다르게 전달하여 게시판을 분리
                startActivity(intent);
            }
        });

        btnpost = findViewById(R.id.btnpost);   //카테고리로 돌아가는 버튼
        btnpost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoticeActivity.this, FoodCategory.class);
                startActivity(intent);
            }
        });
    }
}