package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.unitconverter.R;

import static java.lang.Float.parseFloat;

public class feet_meter extends AppCompatActivity {
    TextView fm_header,res;
    EditText inp1;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feet_meter);

        fm_header = findViewById(R.id.header);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String check_val =  bundle.getString("msg");

            if(check_val.equals("FM")){
                fm_header.setText(R.string.f_to_m);
                fm_header.setBackgroundResource(R.color.light);
                inp1 = findViewById(R.id.input1);
                btn1 = findViewById(R.id.btn1);
                btn2= findViewById(R.id.btn2);
                res = findViewById(R.id.result);


                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String tmp_input1 = inp1.getText().toString();


                        float input1 = parseFloat(tmp_input1);
                        float in_meter;
                        in_meter = (float) (input1 * 0.3048000);

                        res.setText(tmp_input1 + " Feet = " + Float.toString(in_meter) + " Meter");
                        res.setBackgroundResource(R.color.light);

                    }
                });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String tmp_input1 = inp1.getText().toString();


                        float input1,in_feet;
                        input1 = parseFloat(tmp_input1);
                        in_feet = (float) (input1 / 0.3048000);

                        res.setText(tmp_input1 + " Meter = " + Float.toString(in_feet) + " Feet");
                        res.setBackgroundResource(R.color.light);



                    }
                });




            }
//
//            else if(check_val.equals("MC")){
//                fm_header.setText(R.string.m_to_c);
//                fm_header.setBackgroundResource(R.color.lighter);
//                inp1.setHint(R.string.m_to_c);
//                btn1.setText(R.string.meter);
//                btn2.setText(R.string.cm);
//
//
//            }
//            else if(check_val.equals("KMM")){
//                fm_header.setText(R.string.km_to_m);
//                fm_header.setBackgroundResource(R.color.lightest);
//                inp1.setHint(R.string.meter_km_hint);
//                btn1.setText(R.string.meter);
//                btn2.setText(R.string.km);
//
//
//            }

        }

    }


}