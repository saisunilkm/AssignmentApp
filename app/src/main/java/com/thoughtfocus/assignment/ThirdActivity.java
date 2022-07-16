package com.thoughtfocus.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Toast.makeText(this, "Your in Third page", Toast.LENGTH_SHORT).show();
        t1 = findViewById(R.id.phonenumber);


    Bundle b1 = getIntent().getExtras();
    String s1 = b1.getString("usernumber");
    t1.setText(s1);
    }

    public void homeButton(View view) {
        Intent i1 = new Intent(this,MainActivity.class);
        startActivity(i1);
    }
}