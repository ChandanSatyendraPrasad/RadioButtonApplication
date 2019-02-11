package chandan.prasad.radiobuttonapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    RadioGroup radiogrp11, radiogrp21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        radiogrp11 = findViewById(R.id.radioGroup11);
        radiogrp21 = findViewById(R.id.radioGroup21);
        radiogrp11.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.rexcellent1:
                        Toast.makeText(getApplicationContext(), "Excellent",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rverygood1:
                        Toast.makeText(getApplicationContext(), "Very Good",
                                Toast.LENGTH_SHORT).show();

                        break;
                    case R.id.rgood1:
                        Toast.makeText(getApplicationContext(), "Good",
                                Toast.LENGTH_SHORT).show();

                        break;
                    case R.id.ravg1:
                        Toast.makeText(getApplicationContext(), "Average",
                                Toast.LENGTH_SHORT).show();

                        break;

                }

            }
        });

        radiogrp21.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.rbest1:
                        Toast.makeText(getApplicationContext(), "Best",
                                Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.rsupercool1:
                        Toast.makeText(getApplicationContext(), "Super Cool",
                                Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });

    }

    public void test2(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity3.class));
    }
}
