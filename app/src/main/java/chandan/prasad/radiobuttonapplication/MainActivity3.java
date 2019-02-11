package chandan.prasad.radiobuttonapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.rexcellent:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Excellent", Toast.LENGTH_SHORT).show();


                break;
            case R.id.rverygood:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Very Good", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rgood:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Good", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ravg:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Average", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbest:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Best", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rsupercool:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Super Cool", Toast.LENGTH_SHORT).show();
                break;

        }

    }

}

