package com.yazan.omer_yazan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText YOisim,YOsoyisim,YOnumara;
    private Button   YObuton;
    private String OYisim,OYsoyisim,OYnumara;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        YOisim=findViewById(R.id.editTextİsim);
        YOsoyisim=findViewById(R.id.editTextSoyisim);
        YOnumara=findViewById(R.id.editTextNo);
        YObuton=findViewById(R.id.button);


        YObuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            OYisim=YOisim.getText().toString();
            OYsoyisim=YOsoyisim.getText().toString();
            OYnumara=YOnumara.getText().toString();

            Intent i1=new Intent(MainActivity.this,SecondActivity.class);


            i1.putExtra("isim",OYisim);
            i1.putExtra("soyisim",OYsoyisim);
            i1.putExtra("no",OYnumara);






               startActivity(i1);


            }
        });













    }
}
