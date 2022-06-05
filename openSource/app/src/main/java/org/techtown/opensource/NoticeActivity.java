package org.techtown.opensource;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NoticeActivity extends AppCompatActivity {

    private Button btn_post; //게시글 작성 버튼
    private TextView tv_1; //게시글이 저장될 공간

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        tv_1 = findViewById(R.id.tv_1);
        Intent intent = getIntent();
        String str = intent.getStringExtra("str");
        tv_1.setText(str);

        btn_post = findViewById(R.id.btn_post); //게시글 작성버튼
        btn_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //intent를 활용하여 WriteActivity로 화면전환
                Intent intent = new Intent(NoticeActivity.this, WriteActivity.class);
                startActivity(intent);
            }
        });
    }
}