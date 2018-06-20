package com.example.mateo.chatkazakateamproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        Button menuBok = findViewById(R.id.menuBok);
        Button sztuka = findViewById(R.id.szt);
        Button kultura = findViewById(R.id.kult);
        Button nauka = findViewById(R.id.nauka);
        Button rozrywka = findViewById(R.id.rozr);
        Button sport = findViewById(R.id.spo);
        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context=getApplicationContext();
                Intent intent = new Intent(context, Sport.class);
                startActivity(intent);
            }
        });
        rozrywka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context=getApplicationContext();
                Intent intent = new Intent(context, Rozrywka.class);
                startActivity(intent);
            }
        });
        nauka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context=getApplicationContext();
                Intent intent = new Intent(context, Nauka.class);
                startActivity(intent);
            }
        });
        sztuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context=getApplicationContext();
                Intent intent = new Intent(context, Sztuka.class);
                startActivity(intent);
            }
        });
        kultura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context=getApplicationContext();
                Intent intent = new Intent(context, Kultura.class);
                startActivity(intent);
            }
        });


        menuBok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context=getApplicationContext();
                Intent intent = new Intent(context, MenuBoczne.class);
                startActivity(intent);
            }
        });
    }
}
