package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {
    Button bold,italics,underline,bold_ital;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.editText);
        bold=findViewById(R.id.bold);
        italics=findViewById(R.id.italics);
        underline=findViewById(R.id.underline);
        bold_ital=findViewById(R.id.bold_ital);
        bold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setTypeface(null, Typeface.BOLD);
            }
        });
        italics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setTypeface(null, Typeface.ITALIC);
            }
        });
        bold_ital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setTypeface(null,Typeface.BOLD_ITALIC);
            }
        });
    }
}
