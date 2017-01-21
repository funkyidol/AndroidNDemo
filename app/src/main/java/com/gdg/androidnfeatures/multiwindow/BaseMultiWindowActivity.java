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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_multi_window);

        btNormalActivity = (Button) findViewById(R.id.bt_normal_activity);
        btNewTaskActivity = (Button) findViewById(R.id.bt_new_task_activity);
        btAdjacentActivity = (Button) findViewById(R.id.bt_adjacent_activity);

        btNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BaseMultiWindowActivity.this, SimpleActivity.class));
            }
        });
    }
}
