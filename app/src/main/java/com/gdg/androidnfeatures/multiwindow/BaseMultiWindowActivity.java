package com.gdg.androidnfeatures.multiwindow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.gdg.androidnfeatures.R;

public class BaseMultiWindowActivity extends AppCompatActivity {

    Button btNormalActivity;
    Button btNewTaskActivity;
    Button btAdjacentActivity;
    Button btFullscreenActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_multi_window);

        btNormalActivity = (Button) findViewById(R.id.bt_normal_activity);
        btNewTaskActivity = (Button) findViewById(R.id.bt_new_task_activity);
        btAdjacentActivity = (Button) findViewById(R.id.bt_adjacent_activity);
        btFullscreenActivity = (Button) findViewById(R.id.bt_fullscreen_activity);

        btNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BaseMultiWindowActivity.this, SimpleActivity.class));
            }
        });

        btNewTaskActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BaseMultiWindowActivity.this, NewTaskActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        /**
         * Start the activity in the new Task in order for the flag to take effect. Otherwise it
         * will launch in the same window it was initiated from. This flag is just a hint to
         * the system and does not guarantee that the activity will always start in the adjacent
         * window.
         */
        btAdjacentActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BaseMultiWindowActivity.this, AdjacentActivity.class);
                intent.addFlags(
                        Intent.FLAG_ACTIVITY_LAUNCH_ADJACENT | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        /**
         * This will launch a fullscreen activity. But the activity will not be able to hide
         * status bar when in multi-window mode
         */
        btFullscreenActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BaseMultiWindowActivity.this, FullScreenActivity.class);
                startActivity(intent);
            }
        });
    }
}
