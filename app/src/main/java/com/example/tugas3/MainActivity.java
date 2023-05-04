package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {
    MaterialCardView cardAnggota1;
    MaterialCardView cardAnggota2;
    MaterialCardView cardAnggota3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //isi variable
        cardAnggota1 = (MaterialCardView) findViewById(R.id.card_anggota_1);
        cardAnggota2 = (MaterialCardView) findViewById(R.id.card_anggota_2);
        cardAnggota3 = (MaterialCardView) findViewById(R.id.card_anggota_3);
        cardAnggota1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Anggota1Activity.class);
                startActivity(intent);
            }
        });

        cardAnggota2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Anggota2Activity.class);
                startActivity(intent);
            }
        });

        cardAnggota3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Anggota3Activity.class);
                startActivity(intent);
            }
        });
    }
}