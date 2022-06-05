package org.techtown.opensource;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class WriteActivity extends AppCompatActivity {

    private Button ok; //save 버튼
    private Button cancel; //exit버튼
    private EditText et, et_fd, et_cnt; //글을 올리기 위해 내가 작성한 것들
    private String str1, str2, str3; //String으로 반환하기 위해 선언한 String 변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);

        et = findViewById(R.id.et);
        et_fd = findViewById(R.id.et_fd);
        et_cnt = findViewById(R.id.et_cnt);

        ok = findViewById(R.id.ok);
        cancel = findViewById(R.id.cancel);

        Intent intent = getIntent();
        int num = intent.getExtras().getInt("key");

        ok.setOnClickListener(new View.OnClickListener() { //작성 내용을 받음 및 NoticeActivity로 화면전환
            @Override
            public void onClick(View view) {
                str1 = et.getText().toString(); //String으로 반환
                str2 = et_fd.getText().toString();
                str3 = et_cnt.getText().toString();
                switch (num) {
                    case 1:
                        Intent intent = new Intent(WriteActivity.this, NoticeActivity.class);
                        intent.putExtra("str", str1 + "\n" + str2 + "\n" + str3);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(WriteActivity.this, NoticeActivity2.class);
                        intent.putExtra("str", str1 + "\n" + str2 + "\n" + str3);
                        startActivity(intent);                        break;
                    case 3:
                        intent = new Intent(WriteActivity.this, NoticeActivity3.class);
                        intent.putExtra("str", str1 + "\n" + str2 + "\n" + str3);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(WriteActivity.this, NoticeActivity4.class);
                        intent.putExtra("str", str1 + "\n" + str2 + "\n" + str3);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(WriteActivity.this, NoticeActivity5.class);
                        intent.putExtra("str", str1 + "\n" + str2 + "\n" + str3);
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(WriteActivity.this, NoticeActivity6.class);
                        intent.putExtra("str", str1 + "\n" + str2 + "\n" + str3);
                        startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(WriteActivity.this, NoticeActivity7.class);
                        intent.putExtra("str", str1 + "\n" + str2 + "\n" + str3);
                        startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(WriteActivity.this, NoticeActivity8.class);
                        intent.putExtra("str", str1 + "\n" + str2 + "\n" + str3);
                        startActivity(intent);
                        break;
                    case 9:
                        intent = new Intent(WriteActivity.this, NoticeActivity9.class);
                        intent.putExtra("str", str1 + "\n" + str2 + "\n" + str3);
                        startActivity(intent);
                        break;
                    case 10:
                        intent = new Intent(WriteActivity.this, NoticeActivity10.class);
                        intent.putExtra("str", str1 + "\n" + str2 + "\n" + str3);
                        startActivity(intent);
                        break;
                    case 11:
                        intent = new Intent(WriteActivity.this, NoticeActivity11.class);
                        intent.putExtra("str", str1 + "\n" + str2 + "\n" + str3);
                        startActivity(intent);
                        break;
                    case 12:
                        intent = new Intent(WriteActivity.this, NoticeActivity12.class);
                        intent.putExtra("str", str1 + "\n" + str2 + "\n" + str3);
                        startActivity(intent);
                        break;
                }
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() { //NoticeActivity로 화면전환
            @Override
            public void onClick(View view) {
                switch (num) {
                    case 1 :
                        Intent intent = new Intent(WriteActivity.this, NoticeActivity.class);
                        startActivity(intent);
                        break;
                    case 2 :
                        intent = new Intent(WriteActivity.this, NoticeActivity2.class);
                        startActivity(intent);
                        break;
                    case 3 :
                        intent = new Intent(WriteActivity.this, NoticeActivity3.class);
                        startActivity(intent);
                        break;
                    case 4 :
                        intent = new Intent(WriteActivity.this, NoticeActivity4.class);
                        startActivity(intent);
                        break;
                    case 5 :
                        intent = new Intent(WriteActivity.this, NoticeActivity5.class);
                        startActivity(intent);
                        break;
                    case 6 :
                        intent = new Intent(WriteActivity.this, NoticeActivity6.class);
                        startActivity(intent);
                        break;
                    case 7 :
                        intent = new Intent(WriteActivity.this, NoticeActivity7.class);
                        startActivity(intent);
                        break;
                    case 8 :
                        intent = new Intent(WriteActivity.this, NoticeActivity8.class);
                        startActivity(intent);
                        break;
                    case 9 :
                        intent = new Intent(WriteActivity.this, NoticeActivity9.class);
                        startActivity(intent);
                        break;
                    case 10 :
                        intent = new Intent(WriteActivity.this, NoticeActivity10.class);
                        startActivity(intent);
                        break;
                    case 11 :
                        intent = new Intent(WriteActivity.this, NoticeActivity11.class);
                        startActivity(intent);
                        break;
                    case 12 :
                        intent = new Intent(WriteActivity.this, NoticeActivity12.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}