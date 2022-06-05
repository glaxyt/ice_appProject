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

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap googleMap;
    private Button btn_chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        btn_chat = findViewById(R.id.btn_chat);
        btn_chat.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MapActivity.this, NoticeActivity.class);
                startActivity(intent);
            }
        });

        SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    public void onMapReady(GoogleMap googleMap) {
        this.googleMap = googleMap;
        // 37.3360244, 127.2525700 학교정문앞 세븐일레븐
        LatLng latLng1 = new LatLng(37.3360244, 127.2525700); // 학교앞 세븐일레븐
        LatLng latLng2 = new LatLng(37.335143478461134,127.26346891357838 );// 제2기숙사 B동
        LatLng latLng3 = new LatLng(37.3375066583002, 127.26738161240827); //공학관1층
        LatLng latLng4 = new LatLng(37.3355030095007, 127.25356262074736 ); //CU외대 글로벌점
        LatLng latLng5 = new LatLng(37.33603806150749, 127.2508900389001); //CU용인 레이캐슬점
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng1));
        googleMap.moveCamera(CameraUpdateFactory.zoomTo(18));
        MarkerOptions markerOptions1 = new MarkerOptions().position(latLng1).title("학교정문앞 세븐일레븐");
        MarkerOptions markerOptions2 = new MarkerOptions().position(latLng2).title("제2기숙사 B동");
        MarkerOptions markerOptions3 = new MarkerOptions().position(latLng3).title("공학관 1층");
        MarkerOptions markerOptions4 = new MarkerOptions().position(latLng4).title("CU외대 글로벌점");
        MarkerOptions markerOptions5 = new MarkerOptions().position(latLng5).title("CU용인 레이캐슬점");
        googleMap.addMarker(markerOptions1);
        googleMap.addMarker(markerOptions2);
        googleMap.addMarker(markerOptions3);
        googleMap.addMarker(markerOptions4);
        googleMap.addMarker(markerOptions5);

    }
}
