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
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        drawnNumber.setText(Integer.toString(
                (int) (Math.random() * range) + min
        ));
    }
}