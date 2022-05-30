package org.techtown.opensource;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class FoodCategory extends AppCompatActivity {

    private ImageButton btn1, btn2, btn3, btn4, btn5, btn6,
            btn7, btn8, btn9, btn10, btn11, btn12;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_category);

        btn1 = findViewById(R.id.btn1); //일식 버튼과 연결
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn2 = findViewById(R.id.btn2); //중식 버튼과 연결
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn3 = findViewById(R.id.btn3); //치킨 버튼과 연결
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn4 = findViewById(R.id.btn4); //디저트 버튼과 연결
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn5 = findViewById(R.id.btn5); //패스트푸드 버튼과 연결
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn6 = findViewById(R.id.btn6); //피자 버튼과 연결
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn7 = findViewById(R.id.btn7); //양식 버튼과 연결
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn8 = findViewById(R.id.btn8); //분식 버튼과 연결
        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn9 = findViewById(R.id.btn9); //한식 버튼과 연결
        btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn10 = findViewById(R.id.btn10); //야식 버튼과 연결
        btn10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn11 = findViewById(R.id.btn11); //고기 버튼과 연결
        btn11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn12 = findViewById(R.id.btn12); //아시아 버튼과 연결
        btn12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });
    }


}