package com.yazan.omer_yazan;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class BesinciActivity extends AppCompatActivity {
    private String OYgelenİsim,OYgelenSoyisim,OYgelenNo,OYgelenCinsiyet,OYgelenHobi,OYgelenTakım;
    private TextView YOisim,YOsoyisim,YOnumara,YOcinsiyet,YOhobi,YOtakim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_besinci);

        YOisim=findViewById(R.id.textView2);
        YOsoyisim=findViewById(R.id.textView3);
        YOnumara=findViewById(R.id.textView4);
        YOcinsiyet=findViewById(R.id.textView5);
        YOhobi=findViewById(R.id.textView8);
        YOtakim=findViewById(R.id.textView9);

        OYgelenİsim=getIntent().getStringExtra("isim");
        OYgelenSoyisim=getIntent().getStringExtra("soyisim");
        OYgelenNo=getIntent().getStringExtra("no");
        OYgelenCinsiyet=getIntent().getStringExtra("cinsiyet");
        OYgelenHobi=getIntent().getStringExtra("hobi");
        OYgelenTakım=getIntent().getStringExtra("takım");




        YOisim.setText(OYgelenİsim);
        YOsoyisim.setText(OYgelenSoyisim);
        YOnumara.setText(OYgelenNo);
        YOcinsiyet.setText(OYgelenCinsiyet);
        YOhobi.setText(OYgelenHobi);
        YOtakim.setText(OYgelenTakım);





    }
}
