package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.unitconverter.R;

public class MainActivity extends AppCompatActivity {
    Button fm_btn,mc_btn,km_m_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm_btn =findViewById(R.id.F_M_btn);
        mc_btn = findViewById(R.id.M_C_btn);
        km_m_btn = findViewById(R.id.KM_M_btn);

        fm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,feet_meter.class);
                intent.putExtra("msg","FM");
//                Toast.makeText(getApplicationContext(),"Clicked Fm btn",Toast.LENGTH_LONG).show();
                startActivity(intent);

            }
        });

        mc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,cm_meter.class);
//                Toast.makeText(getApplicationContext(),"Clicked MC btn",Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });

        km_m_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,k_meter.class);
                intent.putExtra("msg","KMM");
//                Toast.makeText(getApplicationContext(),"Clicked KMM btn",Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
    }
}