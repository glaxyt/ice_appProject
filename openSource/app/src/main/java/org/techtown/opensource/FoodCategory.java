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

        btn1 = findViewById(R.id.japan); //일식 버튼과 연결
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn2 = findViewById(R.id.china); //중식 버튼과 연결
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn3 = findViewById(R.id.chicken); //치킨 버튼과 연결
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn4 = findViewById(R.id.dissert); //디저트 버튼과 연결
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn5 = findViewById(R.id.fastfood); //패스트푸드 버튼과 연결
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn6 = findViewById(R.id.pizza); //피자 버튼과 연결
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn7 = findViewById(R.id.western); //양식 버튼과 연결
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn8 = findViewById(R.id.bunsik); //분식 버튼과 연결
        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn9 = findViewById(R.id.korea); //한식 버튼과 연결
        btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn10 = findViewById(R.id.midnight); //야식 버튼과 연결
        btn10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn11 = findViewById(R.id.meat); //고기 버튼과 연결
        btn11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });

        btn12 = findViewById(R.id.asia); //아시아 버튼과 연결
        btn12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FoodCategory.this, Sample.class);
                startActivity(intent);
            }
        });
    }


}