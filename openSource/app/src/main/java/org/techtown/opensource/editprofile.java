package org.techtown.opensource;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class editprofile extends AppCompatActivity {

    private Button button2; // EXIT 버튼
    private Button clickbutton; // SAVE 버튼


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofile);

        clickbutton = (Button)findViewById(R.id.clickbutton);
        clickbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder ad = new AlertDialog.Builder(editprofile.this);
                ad.setIcon(R.mipmap.ic_launcher);
                ad.setTitle("저장");
                ad.setMessage("저장하시겠습니까?");

                final EditText et = new EditText(editprofile.this);

                ad.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                ad.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                ad.show();

            }
        }); // SAVE 버튼 클릭시 저장 확인,취소

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(editprofile.this , Sample.class);
                startActivity(intent); // 처음 액티비티 이동
            }
        });







    }


}