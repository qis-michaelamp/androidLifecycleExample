package com.example.lenovo.androidlifecycleexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle", "OnCreate Invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle", "OnResume Invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle", "OnStart Invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle", "OnPause Invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle", "OnStop Invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle", "OnRestart Invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle", "OnDestroy Invoked");
    }
}
