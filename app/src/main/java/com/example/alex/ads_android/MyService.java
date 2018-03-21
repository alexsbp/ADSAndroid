package com.example.alex.ads_android;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MyService extends Service
{
    Main main = new Main();
    //TextView txtView;

    public MyService()
    {
    }
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    public void onCreate()
    {
        TouchCounter();

        super.onCreate();
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
    }

    public void TouchCounter()
    {
        main.touchCount +=10;
        Toast.makeText(this, "service starting", Toast.LENGTH_SHORT).show();
    }


}

