package com.example.moodbloom_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle b = getIntent().getExtras();
        moodbloom m = (moodbloom) b.getSerializable("moodbloom");

        TextView name = findViewById(R.id.textView3);
        TextView description = findViewById(R.id.textView2);
        ImageView img = findViewById(R.id.imageView2);

        name.setText(m.getName());
        description.setText(m.getDescription());
        img.setImageResource(m.getImage());
    }
    }
