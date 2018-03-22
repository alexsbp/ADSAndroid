package com.example.alex.ads_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main extends AppCompatActivity {

    ImageButton button_Passive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToNewWindow();

    }

    public void ToNewWindow()
    {
        button_Passive = (ImageButton)findViewById(R.id.ImageButton_View);
        button_Passive.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Main.this, Main2Activity.class));
            }
        });
    }

    public void ToSettingsWindow(View view)
    {
        startActivity(new Intent(Main.this, Main3Activity.class));
    }



}
