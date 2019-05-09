package com.example.centerpoint;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class CreateActivity extends AppCompatActivity {

    public EditText showText;

    @Override
    public void OnCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        showText = (EditText)findViewById(R.id.editText);
    }

    public void check(View v){

    }

    public void complete(View v){

    }


}
