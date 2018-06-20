package com.example.mateo.chatkazakateamproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Wydarzenie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.wydarzenie);
        String data = getIntent().getStringExtra("data");
        String nazwa = getIntent().getStringExtra("nazwa");
        String date = data.substring(0, 5);
        String godzina = data.substring(5);
        String dzien = data.substring(0, 2);
        String miesiac = data.substring(3,5);
        String opis = getIntent().getStringExtra("opis");
        TextView dataTxt = findViewById(R.id.textData);
        TextView nazwaTxt = findViewById(R.id.textNazwa);
        TextView miesiacTxt = findViewById(R.id.textMiesiac);
        TextView clockTxt = findViewById(R.id.textClock);
        TextView opisTxt = findViewById(R.id.textOpis);
        String miesiacN="";
        String clock;
        dataTxt.setText(dzien);
        nazwaTxt.setText(nazwa);
        opisTxt.setText(opis);

        switch(miesiac){
            case "01":
                miesiacN="Styczeń";
                break;
            case "02":
                miesiacN="Luty";
                break;
            case "03":
                miesiacN="Marzec";
                break;
            case "04":
                miesiacN="Kwiecień";
                break;
            case "05":
                miesiacN="Maj";
                break;
            case "06":
                miesiacN="Czerwca";
                break;
            case "07":
                miesiacN="Lipiec";
                break;
            case "08":
                miesiacN="Sierpień";
                break;
            case "09":
                miesiacN="Wrzesień";
                break;
            case "10":
                miesiacN="Październik";
                break;
            case "11":
                miesiacN="Listopad";
                break;
            case "12":
                miesiacN="Grudzień";
                break;
        }
        miesiacTxt.setText(miesiacN);
        clock = godzina + ", " +dzien +" "+miesiacN;
        clockTxt.setText(clock);
    }
}
