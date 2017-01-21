package com.gdg.androidnfeatures.multiwindow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.gdg.androidnfeatures.R;

public class SimpleActivity extends AppCompatActivity {

    private static final String TAG = "SimpleActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "OnPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "OnResume");
    }
}
