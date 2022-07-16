package com.thoughtfocus.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class SecondActivity extends AppCompatActivity {
    TextView t1;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast.makeText(this, "Your in second page", Toast.LENGTH_SHORT).show();
        t1 = (TextView) findViewById(R.id.nameresult);
        e1 = (EditText) findViewById(R.id.enterphonenumber);

        Bundle b1 = getIntent().getExtras();
        String s1 = b1.getString("username");
        t1.setText(s1);
    }


    public void nextButton(View view) {
        Intent i1 = new Intent(this,ThirdActivity.class);
        i1.putExtra("usernumber",e1.getText().toString());
        startActivity(i1);
    }
}