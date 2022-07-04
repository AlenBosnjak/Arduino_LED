package com.example.ledremote;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class OneColourActivity extends AppCompatActivity {
    private Mode currentMode;
    private Colour currentColour= new Colour(0,0,0);
    private ColourList colourList = new ColourList();
    private DrawableList drawableList = new DrawableList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eine_farbe);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        currentMode = new Mode(message);




    }

    // change current colour and change preview
    public void chooseAColour(View view) {

    String colourNumber = (String) view.getTag();
    int numb = Integer.parseInt(colourNumber);
    // showColour is the preview image in this activity
    ImageView showColour = findViewById(R.id.showColour);

        String showColourDrawable = drawableList.getColourAtIndex(numb);

        int resID = getResources().getIdentifier(showColourDrawable, "drawable", "com.example.ledremote");

        showColour.setImageResource(resID);


    currentColour.copyColour(colourList.getColourAtIndex(numb));
    MessageCreator tester = new MessageCreator(currentMode, currentColour);


    }

    public void clickSendButton(View view) throws IOException {
       Thread t1 = new Thread(new MessageSender(currentMode , currentColour));
       t1.start();
    }

}
