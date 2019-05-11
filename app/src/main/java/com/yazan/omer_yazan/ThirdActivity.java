package com.yazan.omer_yazan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    private CheckBox YOkitap,YOfilm,YObisiklet,YOkamp,YOyuruyus;
    private Button YObuton;
    private String OYgelenİsim,OYgelenSoyisim,OYgelenNo,OYgelenCinsiyet;
    private String hobiSonuc="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);



        YOkitap=findViewById(R.id.checkBoxKitap);
        YOkamp=findViewById(R.id.checkBoxKamp);
        YObisiklet=findViewById(R.id.checkBoxBisiklet);
        YOfilm=findViewById(R.id.checkBoxFilm);
        YOyuruyus=findViewById(R.id.checkBoxYürüyüs);
        YObuton=findViewById(R.id.button3);



        OYgelenİsim=getIntent().getStringExtra("isim");
        OYgelenSoyisim=getIntent().getStringExtra("soyisim");
        OYgelenNo=getIntent().getStringExtra("no");
        OYgelenCinsiyet=getIntent().getStringExtra("cinsiyet");




        YObuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(YOkitap.isChecked()){
                    hobiSonuc=hobiSonuc+" Kitap Okumak ";
                }
                if(YOkamp.isChecked()){
                    hobiSonuc=hobiSonuc+" Kamp Yapmak ";
                }
                if(YObisiklet.isChecked()){
                    hobiSonuc=hobiSonuc+" Bisiklet Sürmek ";
                }
                if(YOyuruyus.isChecked()){
                    hobiSonuc=hobiSonuc+" Yuruyus Yapmak ";
                }
                if(YOfilm.isChecked()){
                    hobiSonuc=hobiSonuc+" Film İzlemek ";
                }


                Intent i3=new Intent(ThirdActivity.this,FourthActivity.class);
                i3.putExtra("hobi",hobiSonuc);
                i3.putExtra("cinsiyet",OYgelenCinsiyet);
                i3.putExtra("isim",OYgelenİsim);
                i3.putExtra("soyisim",OYgelenSoyisim);
                i3.putExtra("no",OYgelenNo);
                startActivity(i3);


            }
        });




    }
}
