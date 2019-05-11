package com.yazan.omer_yazan;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    private RadioButton YOerkek,YOkadın;
    private Button YObuton;
    private String OYgelenİsim,OYgelenSoyisim,OYgelenNo;
    private String sonuc="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        YOerkek=findViewById(R.id.radioButtonErkek);
        YOkadın=findViewById(R.id.radioButtonKadın);
        YObuton=findViewById(R.id.button2);


        OYgelenİsim=getIntent().getStringExtra("isim");
        OYgelenSoyisim=getIntent().getStringExtra("soyisim");
        OYgelenNo=getIntent().getStringExtra("no");



        YObuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(YOerkek.isChecked()){

                      sonuc=sonuc+"Erkek";

                }
                if(YOkadın.isChecked()){
                    sonuc=sonuc+"Kadın";
                }

                Snackbar.make(v,"Doğru seçtiğinize emi nmisiniz ? Daha sonra değiştiremezsiniz.",Snackbar.LENGTH_LONG).setAction("Evet", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent i2=new Intent(SecondActivity.this,ThirdActivity.class);
                        i2.putExtra("cinsiyet",sonuc);
                        i2.putExtra("isim",OYgelenİsim);
                        i2.putExtra("soyisim",OYgelenSoyisim);
                        i2.putExtra("no",OYgelenNo);
                        startActivity(i2);
                         sonuc="";
                    }
                }).show();




            }
        });





    }
}
