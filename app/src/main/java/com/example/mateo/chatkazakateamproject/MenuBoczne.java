package com.example.mateo.chatkazakateamproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MenuBoczne extends AppCompatActivity {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.panel_boczny);
        Button kalendarz = findViewById(R.id.kalendarz);
        Button onas = findViewById(R.id.butOnas);
        onas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Onas.class);
                startActivity(intent);
            }
        });
        kalendarz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context=getApplicationContext();
                Intent intent = new Intent(context, Kalendarz.class);
                startActivity(intent);
            }
        });


    }

}
