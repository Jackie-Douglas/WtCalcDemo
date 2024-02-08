package com.example.wtcalcdemo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtViewResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setLogo(R.mipmap.ic_launcher_wt_round);
        actionBar.setTitle(R.string.txtTitle);

        // This is wrong way to type
        // TextView txtViewResults = findViewById(R.id.txtViewResults);

        txtViewResults = findViewById(R.id.txtViewResults);
        EditText editTextInputWt = findViewById(R.id.editTextInputWt);
        RadioGroup radGroupConv = findViewById(R.id.radGroupConv);
        Button btnConvertWt = findViewById(R.id.btnConvertWt);
        radGroupConv.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radBtnLbsToKgs) {
                    Toast.makeText(MainActivity.this,
                            "Let us convert Pounds to Kilos", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.radBtnKgsToLbs) {
                    Toast.makeText(MainActivity.this,
                            "Let us convert Kilos to Pounds", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // complete this before next class

        // radGroupConv.getCheckedRadioButtonId() --> -1 if nothing is selected
        // --> R.id.radBtnLbsToKgs if that radio button is checked
        // --> R.id.radBtnKgsToLbs if the other radio button is checked

    }
}