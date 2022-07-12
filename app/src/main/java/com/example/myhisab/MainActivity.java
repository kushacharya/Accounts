package com.example.myhisab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText total, person,personname ,cont;
    TextView avgshow;
    Button avg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        total = findViewById(R.id.total);
        person = findViewById(R.id.person);
        personname = findViewById(R.id.personname);
        cont = findViewById(R.id.cont);
        avgshow = findViewById(R.id.avgshow);
        avg = findViewById(R.id.avg);
        avg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String totalamt = total.getText().toString();
                String personno = person.getText().toString();
                double totalamtf = Double.parseDouble(totalamt);
                double personnof = Double.parseDouble(personno);
                double avgamt = (totalamtf/personnof);
                avgshow.setText("avegrage value is "+avgamt);
            }
        });
    }
}