package org.techtown.opensource;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NoticeActivity10 extends AppCompatActivity {

    private Button btn_post_10, btnpost10; //게시글 작성 버튼
    private TextView tv_10; //게시글이 저장될 공간

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice10);

        tv_10 = findViewById(R.id.tv_10);
        Intent intent = getIntent();
        String str = intent.getStringExtra("str");
        tv_10.setText(str);

        btn_post_10 = findViewById(R.id.btn_post_10); //게시글 작성버튼
        btn_post_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //intent를 활용하여 WriteActivity로 화면전환
                Intent intent = new Intent(NoticeActivity10.this, WriteActivity.class);
                intent.putExtra("key", 10);
                startActivity(intent);
            }
        });

        btnpost10 = findViewById(R.id.btnpost10);
        btnpost10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoticeActivity10.this, FoodCategory.class);
                startActivity(intent);
            }
        });
    }
}