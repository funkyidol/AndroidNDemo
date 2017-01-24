package com.gdg.androidnfeatures;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.gdg.androidnfeatures.appshortcuts.AppShortcutsActivity;
import com.gdg.androidnfeatures.multiwindow.BaseMultiWindowActivity;

public class MainActivity extends AppCompatActivity {

    Button btMultiWindow;
    Button btQuickSettings;
    Button btAppShortcuts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btMultiWindow = (Button) findViewById(R.id.bt_multi_window);
        btQuickSettings = (Button) findViewById(R.id.bt_quick_settings);
        btAppShortcuts = (Button) findViewById(R.id.bt_app_shortcut);

        btMultiWindow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, BaseMultiWindowActivity.class));
            }
        });

        btAppShortcuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AppShortcutsActivity.class));
            }
        });
    }
}
