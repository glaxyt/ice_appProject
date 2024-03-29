package org.techtown.opensource;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.Serializable;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap googleMap;
    private Button btn_chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Intent intent = getIntent();
        int num = intent.getExtras().getInt("key");

        btn_chat = findViewById(R.id.btn_chat);
        btn_chat.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                switch (num) {
                    case 1 : //일식
                        Intent intent = new Intent(MapActivity.this, NoticeActivity.class);
                        startActivity(intent);
                        break;
                    case 2 : //중식
                        intent = new Intent(MapActivity.this, NoticeActivity2.class);
                        startActivity(intent);
                        break;
                    case 3 : //치킨
                        intent = new Intent(MapActivity.this, NoticeActivity3.class);
                        startActivity(intent);
                        break;
                    case 4 : //디저트
                        intent = new Intent(MapActivity.this, NoticeActivity4.class);
                        startActivity(intent);
                        break;
                    case 5 : //패스트푸드
                        intent = new Intent(MapActivity.this, NoticeActivity5.class);
                        startActivity(intent);
                        break;
                    case 6 : //피자
                        intent = new Intent(MapActivity.this, NoticeActivity6.class);
                        startActivity(intent);
                        break;
                    case 7 : //양식
                        intent = new Intent(MapActivity.this, NoticeActivity7.class);
                        startActivity(intent);
                        break;
                    case 8 : //분식
                        intent = new Intent(MapActivity.this, NoticeActivity8.class);
                        startActivity(intent);
                        break;
                    case 9 : //한식
                        intent = new Intent(MapActivity.this, NoticeActivity9.class);
                        startActivity(intent);
                        break;
                    case 10 : //야식
                        intent = new Intent(MapActivity.this, NoticeActivity10.class);
                        startActivity(intent);
                        break;
                    case 11 : //고기
                        intent = new Intent(MapActivity.this, NoticeActivity11.class);
                        startActivity(intent);
                        break;
                    case 12 : //아시아
                        intent = new Intent(MapActivity.this, NoticeActivity12.class);
                        startActivity(intent);
                        break;
                }
            }
        });

        SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    public void onMapReady(GoogleMap googleMap) {
        this.googleMap = googleMap;
        LatLng latLng1 = new LatLng(37.3360244, 127.2525700); // 학교앞 세븐일레븐
        LatLng latLng2 = new LatLng(37.335143478461134,127.26346891357838 );// 제2기숙사 B동
        LatLng latLng3 = new LatLng(37.3375066583002, 127.26738161240827); //공학관1층
        LatLng latLng4 = new LatLng(37.3355030095007, 127.25356262074736 ); //CU외대 글로벌점
        LatLng latLng5 = new LatLng(37.33603806150749, 127.2508900389001); //CU용인 레이캐슬점
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng1)); //학교앞 세븐일레븐이 기준허브
        googleMap.moveCamera(CameraUpdateFactory.zoomTo(18));
        MarkerOptions markerOptions1 = new MarkerOptions().position(latLng1).title("학교정문앞 세븐일레븐");//위치객체 생성
        MarkerOptions markerOptions2 = new MarkerOptions().position(latLng2).title("제2기숙사 B동");
        MarkerOptions markerOptions3 = new MarkerOptions().position(latLng3).title("공학관 1층");
        MarkerOptions markerOptions4 = new MarkerOptions().position(latLng4).title("CU외대 글로벌점");
        MarkerOptions markerOptions5 = new MarkerOptions().position(latLng5).title("CU용인 레이캐슬점");
        googleMap.addMarker(markerOptions1);//해당위치 지도에 표시
        googleMap.addMarker(markerOptions2);
        googleMap.addMarker(markerOptions3);
        googleMap.addMarker(markerOptions4);
        googleMap.addMarker(markerOptions5);

    }
}
