package org.techtown.opensource;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NoticeActivity6 extends AppCompatActivity {

    private Button btn_post_6; //게시글 작성 버튼
    private TextView tv_6; //게시글이 저장될 공간

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice6);

        tv_6 = findViewById(R.id.tv_6);
        Intent intent = getIntent();
        String str = intent.getStringExtra("str");
        tv_6.setText(str);

        btn_post_6 = findViewById(R.id.btn_post_6); //게시글 작성버튼
        btn_post_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //intent를 활용하여 WriteActivity로 화면전환
                Intent intent = new Intent(NoticeActivity6.this, WriteActivity.class);
                intent.putExtra("key", 6);
                startActivity(intent);
            }
        });
    }
}