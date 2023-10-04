package com.example.lab2nameentry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NameDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_display);

        TextView tv = (TextView) findViewById(R.id.showName);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String username = extras.getString("NAME");
            tv.setText("Hello " + username);
        }
    }
}