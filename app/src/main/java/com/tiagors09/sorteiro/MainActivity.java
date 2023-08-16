package com.tiagors09.sorteiro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void raffleNumber(View v) {
        TextView drawnNumber = findViewById(R.id.drawnNumber);
        drawnNumber.setText(Double.toString(Math.random() * 10));
    }
}