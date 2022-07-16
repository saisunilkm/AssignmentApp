package com.thoughtfocus.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
        e1 = (EditText) findViewById(R.id.enteryourname);
    }

    public void nextButton(View view) {
        Intent i1 = new Intent(this,SecondActivity.class);
        i1.putExtra("username",e1.getText().toString());
        startActivity(i1);
    }

    public void page2Button(View view) {
        Intent i2 = new Intent(this,ThirdActivity.class);
        startActivity(i2);
    }
}