package com.example.alex.ads_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main2Activity extends AppCompatActivity {

   Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ToOldWindow();
    }

    public void ToOldWindow()
    {
        b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Main2Activity.this, Main.class));


                /**Intent intent = new Intent(getApplicationContext(), Main.class);
                startActivity(intent);*/
            }
        });
    }
}



