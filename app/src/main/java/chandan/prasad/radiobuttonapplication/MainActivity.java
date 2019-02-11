package chandan.prasad.radiobuttonapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        RadioGroup.OnCheckedChangeListener {

    RadioGroup radiogrp1, radiogrp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radiogrp1 = findViewById(R.id.radioGroup1);
        radiogrp2 = findViewById(R.id.radioGroup2);

        radiogrp1.setOnCheckedChangeListener(this);
        radiogrp2.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        switch (checkedId) {
            case R.id.rexcellent:
                Toast.makeText(getApplicationContext(), "Excellent", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rverygood:
                Toast.makeText(getApplicationContext(), "Very Good", Toast.LENGTH_SHORT).show();

                break;
            case R.id.rgood:
                Toast.makeText(getApplicationContext(), "Good", Toast.LENGTH_SHORT).show();

                break;
            case R.id.ravg:
                Toast.makeText(getApplicationContext(), "Average", Toast.LENGTH_SHORT).show();

                break;
            case R.id.rbest:
                Toast.makeText(getApplicationContext(), "BEst", Toast.LENGTH_SHORT).show();

                break;
            case R.id.rsupercool:
                Toast.makeText(getApplicationContext(), "Super Cool", Toast.LENGTH_SHORT).show();

                break;

        }

    }

    public void text(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity2.class));
    }
}
