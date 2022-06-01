package org.techtown.opensource;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Sample extends AppCompatActivity {

    private Button gg;
    // 프로필 수정 버튼

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        gg = findViewById(R.id.gg);
        gg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sample.this , editprofile.class);
                startActivity(intent); // 프로필 수정 액티비티 이동

            }
        });
    }
}