package com.yazan.omer_yazan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FourthActivity extends AppCompatActivity {
    private ListView  YOliste;
    private ArrayList<String> YOtakımlar=new ArrayList<>();
    private ArrayAdapter<String> YOveriAdaptoru;
    private String OYgelenİsim,OYgelenSoyisim,OYgelenNo,OYgelenCinsiyet,OYgelenHobi,OYtakım;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);



        OYgelenİsim=getIntent().getStringExtra("isim");
        OYgelenSoyisim=getIntent().getStringExtra("soyisim");
        OYgelenNo=getIntent().getStringExtra("no");
        OYgelenCinsiyet=getIntent().getStringExtra("cinsiyet");
        OYgelenHobi=getIntent().getStringExtra("hobi");



        YOliste=findViewById(R.id.liste);
        YOtakımlar.add("Fenerbahçe");
        YOtakımlar.add("Beşiktaş");
        YOtakımlar.add("Trabzonspor");
        YOtakımlar.add("Düzcespor");
        YOtakımlar.add("Galatasaray");

        YOveriAdaptoru=new ArrayAdapter<String>(FourthActivity.this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,YOtakımlar);

        YOliste.setAdapter(YOveriAdaptoru);


        YOliste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                OYtakım=YOtakımlar.get(position);
                Intent i4=new Intent(FourthActivity.this,BesinciActivity.class);
                i4.putExtra("takım",OYtakım);
                i4.putExtra("hobi",OYgelenHobi);
                i4.putExtra("cinsiyet",OYgelenCinsiyet);
                i4.putExtra("isim",OYgelenİsim);
                i4.putExtra("soyisim",OYgelenSoyisim);
                i4.putExtra("no",OYgelenNo);
                startActivity(i4);

            }
        });

    }
}
