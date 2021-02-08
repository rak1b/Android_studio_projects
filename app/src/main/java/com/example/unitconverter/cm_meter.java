package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Float.parseFloat;

public class cm_meter extends AppCompatActivity {

    TextView fm_header, res;
    EditText inp1;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cm_meter);

        fm_header = findViewById(R.id.header);

        fm_header.setText(R.string.m_to_c);
        fm_header.setBackgroundResource(R.color.lighter);
        inp1 = findViewById(R.id.input1);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        res = findViewById(R.id.result);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp_input1 = inp1.getText().toString();


                float input1, in_m;
                input1 = parseFloat(tmp_input1);
                in_m = (float) (input1 / 100);

                res.setText(tmp_input1 + " Cm = " + Float.toString(in_m) + " Meter");
                res.setBackgroundResource(R.color.lighter);




            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp_input1 = inp1.getText().toString();


                float input1 = parseFloat(tmp_input1);
                float in_cm;
                in_cm = (float) (input1 * 100);

                res.setText(Float.toString(in_cm));
                res.setText(tmp_input1 + " Meter = " + Float.toString(in_cm) + " Cm");
                res.setBackgroundResource(R.color.lighter);


            }
        });

    }

}