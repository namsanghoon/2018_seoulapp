package com.example.daewon.a2018_seoulapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.daewon.a2018_seoulapp.GalleryList;
import com.example.daewon.a2018_seoulapp.R;

public class MapActivity extends BaseActivity {

    //Intent intent = new Intent(this,Map_sub_Activity.class);
    private long mLastClickTime;
    TextView location_text;
    Intent To_detail_list_intent;
    Button To_detail_button;
    private ImageButton best5, find_gallery, mypage;
    int i = 2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        location_text = findViewById(R.id.location_text);
        To_detail_button = findViewById(R.id.Button_todetail);
        best5 = findViewById(R.id.best5);
        find_gallery = findViewById(R.id.find_gallery);
        mypage = findViewById(R.id.mypage);

        To_detail_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(location_text.getText().toString().equals("지역선택")){
                    Toast.makeText(MapActivity.this, "지역을 선택해주세요.", Toast.LENGTH_SHORT).show();
                    return;
                }
                startActivity(To_detail_list_intent);
            }
        });

        best5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i != 1) {
                    best5.setImageResource(R.drawable.best5_on);
                    find_gallery.setImageResource(R.drawable.gallery_off);
                    mypage.setImageResource(R.drawable.mypage_off);
                    i = 1;
                    Intent intent = new Intent(MapActivity.this, GalleryList.class);
                    finish();
                    startActivity(intent);
                }
            }
        });

        find_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i != 2) {
                    best5.setImageResource(R.drawable.best5_off);
                    find_gallery.setImageResource(R.drawable.gallery_on);
                    mypage.setImageResource(R.drawable.mypage_off);
                    i = 2;
                }
            }
        });

        mypage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i != 3) {
                    best5.setImageResource(R.drawable.best5_off);
                    find_gallery.setImageResource(R.drawable.gallery_off);
                    mypage.setImageResource(R.drawable.mypage_on);
                    i = 3;
                    Intent intent = new Intent(MapActivity.this, MyPage.class);
                    finish();
                    startActivity(intent);
                }
            }
        });
    }

    public void clickbtn(View v){

        if(SystemClock.elapsedRealtime()-mLastClickTime < 1000){
            return;
        }

        mLastClickTime = SystemClock.elapsedRealtime();
        To_detail_list_intent = new Intent(this,Map_sub_Activity.class);
        switch (v.getId()){
            case R.id.dobong:
                location_text.setText("도봉구");
                To_detail_list_intent.putExtra("name","도봉구");
                break;
            case R.id.gangbook:
                location_text.setText("강북구");
                To_detail_list_intent.putExtra("name","강북구");
                break;
            case R.id.jongro:
                location_text.setText("종로구");
                To_detail_list_intent.putExtra("name","종로구");
                break;
            case R.id.nowon:
                location_text.setText("노원구");
                To_detail_list_intent.putExtra("name","노원구");
                break;
            case R.id.eunpyoung:
                location_text.setText("은평구");
                To_detail_list_intent.putExtra("name","은평구");
                break;
            case R.id.seodamoon:
                location_text.setText("서대문구");
                To_detail_list_intent.putExtra("name","서대문구");
                break;
            case R.id.mapo:
                location_text.setText("마포구");
                To_detail_list_intent.putExtra("name","마포구");
                break;
            case R.id.gangseo:
                location_text.setText("강서구");
                To_detail_list_intent.putExtra("name","강서구");
                break;
            case R.id.yangcheon:
                location_text.setText("양천구");
                To_detail_list_intent.putExtra("name","양천구");
                break;
            case R.id.ydp:
                location_text.setText("영등포구");
                To_detail_list_intent.putExtra("name","영등포구");
                break;
            case R.id.guro:
                location_text.setText("구로구");
                To_detail_list_intent.putExtra("name","구로구");
                break;
            case R.id.guemcheon:
                location_text.setText("금천구");
                To_detail_list_intent.putExtra("name","금천구");
                break;
            case R.id.dongjak:
                location_text.setText("동작구");
                To_detail_list_intent.putExtra("name","동작구");
                break;
            case R.id.yoongsan:
                location_text.setText("용산구");
                To_detail_list_intent.putExtra("name","용산구");
                break;
            case R.id.jung:
                location_text.setText("중구");
                To_detail_list_intent.putExtra("name","중구");
                break;
            case R.id.gangnam:
                location_text.setText("강남구");
                To_detail_list_intent.putExtra("name","강남구");
                break;
            case R.id.seocho:
                location_text.setText("서초구");
                To_detail_list_intent.putExtra("name","서초구");
                break;
            case R.id.sungdong:
                location_text.setText("성동구");
                To_detail_list_intent.putExtra("name","성동구");
                break;
            case R.id.jungrang:
                location_text.setText("중랑구");
                To_detail_list_intent.putExtra("name","중랑구");
                break;
            case R.id.gangdong:
                location_text.setText("강동구");
                To_detail_list_intent.putExtra("name","강동구");
                break;
            case R.id.gwangjin:
                location_text.setText("광진구");
                To_detail_list_intent.putExtra("name","광진구");
                break;
            case R.id.gwanak:
                location_text.setText("관악구");
                To_detail_list_intent.putExtra("name","관악구");
                break;
            case R.id.dongdamoon:
                location_text.setText("동대문구");
                To_detail_list_intent.putExtra("name","동대문구");
                break;
            case R.id.sungbook:
                location_text.setText("성북구");
                To_detail_list_intent.putExtra("name","성북구");
                break;
            case R.id.songpa:
                location_text.setText("송파구");
                To_detail_list_intent.putExtra("name","송파구");
                break;
        }
    }
}
