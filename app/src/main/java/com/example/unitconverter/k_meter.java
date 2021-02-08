package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Float.parseFloat;

public class k_meter extends AppCompatActivity {


    TextView fm_header, res;
    EditText inp1;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_meter);


        fm_header = findViewById(R.id.header);

        fm_header.setText(R.string.km_to_m);
        fm_header.setBackgroundResource(R.color.lighter);
        inp1 = findViewById(R.id.input1);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        res = findViewById(R.id.result);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp_input1 = inp1.getText().toString();


                float input1, in_m;
                input1 = parseFloat(tmp_input1);
                in_m = (float) (input1 * 1000);

                res.setText(tmp_input1 + " Meter = " + Float.toString(in_m) + " Km");
                res.setBackgroundResource(R.color.lightest);




            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp_input1 = inp1.getText().toString();


                float input1 = parseFloat(tmp_input1);
                float in_km;
                in_km = (float) (input1 / 1000);

                res.setText(Float.toString(in_km));
                res.setText(tmp_input1 + " Km = " + Float.toString(in_km) + " Meter");
                res.setBackgroundResource(R.color.lighter);


            }
        });


    }
}