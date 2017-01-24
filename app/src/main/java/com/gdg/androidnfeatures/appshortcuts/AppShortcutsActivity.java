package com.gdg.androidnfeatures.appshortcuts;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.gdg.androidnfeatures.R;

import java.util.Arrays;

public class AppShortcutsActivity extends AppCompatActivity {

    private Button btEnableAppShortcut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_shortcuts);

        final ShortcutInfo dynamicShortcut =
                new ShortcutInfo.Builder(this, "dynamic shortcut").setShortLabel("Dynamic")
                        .setLongLabel("Open dynamic shortcut")
                        .setIcon(Icon.createWithResource(this, R.drawable.ic_dynamic))
                        .setIntent(new Intent(DynamicShortcutActivity.ACTION))
                        .setRank(1)
                        .build();

        btEnableAppShortcut = (Button) findViewById(R.id.bt_enable_shortcut);
        btEnableAppShortcut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ShortcutManager shortcutManager = getSystemService(ShortcutManager.class);

                /**
                 * Dynamic Shortcuts
                 * By setting a custom rank to a dynamic shortcut we can control the order they
                 * appear when revealed:
                 * the higher the rank, the most top the shortcut goes.
                 * the rank of a static shortcut cannot be changed they will be shown in the
                 * order they're defined in the shortcuts.xml file.
                 */

                shortcutManager.setDynamicShortcuts(Arrays.asList(dynamicShortcut));

            }
        });
    }
}
