package com.jetlee.coordinatorlayoutdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.fab).setOnClickListener(this);
        findViewById(R.id.scrollFlag).setOnClickListener(this);
        findViewById(R.id.collapseToolbar).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab:
                startActivity(this, FabActivity.class);
                break;
            case R.id.scrollFlag:
                startActivity(this, ScrollFlagActivity.class);
                break;
            case R.id.collapseToolbar:
                startActivity(this, CollapsingToolbarActivity.class);
                break;
            default:
                break;
        }
    }

    private void startActivity(Context context, Class clazz) {
        Intent intent = new Intent(context, clazz);
        startActivity(intent);
    }
}
