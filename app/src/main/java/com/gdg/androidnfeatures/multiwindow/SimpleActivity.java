package com.gdg.androidnfeatures.multiwindow;

import android.content.res.Configuration;
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

    /**
     * In Multi-window mode, activity will go in pause state once it looses focus even though it
     * is visible.
     */
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

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d(TAG, "onConfigurationChanged");
    }

    /**
     * You can get the status if the currently the activity is in multi-window mode or not.
     * @param isInMultiWindowMode
     */
    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);
        Log.d(TAG, "onMultiWindowModeChanged: " + isInMultiWindowMode);
    }
}
