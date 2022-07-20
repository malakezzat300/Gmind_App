package com.malakezzat.android.GmindGame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.unity3d.player.UnityPlayerActivity;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.open_unity);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, UnityPlayerActivity.class);
                intent.putExtra("unity","by Malak Ezzat for Gmind");
                startActivity(intent);
            }
        });

    }

}