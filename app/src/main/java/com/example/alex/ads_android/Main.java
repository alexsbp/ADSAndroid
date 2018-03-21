package com.example.alex.ads_android;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    ImageButton ImgButton;
    int touchCount;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        txtView = (TextView) findViewById(R.id.textView);

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

    public void StartService (View view)
    {
        startService(new Intent(Main.this, MyService.class));
    }

    public void UpdateTouchCount(View view)
    {
        button = (ImageButton)findViewById(R.id.ImageButton_View);
        txtView.setText("count: "+ touchCount);
    }






}
