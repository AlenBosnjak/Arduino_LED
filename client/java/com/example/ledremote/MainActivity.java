package com.example.ledremote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private Colour currentColour= new Colour(0,0,0);

    public static final String EXTRA_MESSAGE = "com.example.ledremote.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickEineFarbe(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, OneColourActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "Farbe:");
        startActivity(intent);
    }

    public void clickRegenbogen(View view) {
        // Do something in response to button
        Mode currentMode = new Mode("Regenbogen:");
        Thread t1 = new Thread(new MessageSender(currentMode , currentColour));
        t1.start();
    }

    public void clickAusschalten(View view) {
        // Do something in response to button
        Mode currentMode = new Mode("Farbe:");
        Thread t1 = new Thread(new MessageSender(currentMode , currentColour));
        t1.start();
    }

    public void clickTVMode(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, OneColourActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "TVmode:");
        startActivity(intent);
    }


}