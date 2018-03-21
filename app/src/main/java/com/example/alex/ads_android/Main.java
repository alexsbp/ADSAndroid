package com.example.alex.ads_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main extends AppCompatActivity {

    ImageButton ImgButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ToNewWindow();
        OnOffButton();

    }

    public void ToNewWindow()
    {
        ImgButton = (ImageButton)findViewById(R.id.ImageButton_View);
        ImgButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Main.this, Main2Activity.class));
            }
        });
    }

    public void OnOffButton() {

        ImgButton = (ImageButton)findViewById(R.id.ImageButton_Passiv);

        ImgButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ImgButton.setImageResource(R.drawable.on);

            }
        });
    }




}
