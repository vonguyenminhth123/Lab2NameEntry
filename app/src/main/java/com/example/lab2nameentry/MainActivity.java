package com.example.lab2nameentry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameText = (EditText) findViewById(R.id.name);
    }
    public void handleButtonClick(View view) {
        //nameText.setText("The button was clicked");
        String strName = nameText.getText().toString();
        Intent i = new Intent(this, NameDisplay.class);
        i.putExtra("NAME", strName);
        startActivity(i);
    }
}