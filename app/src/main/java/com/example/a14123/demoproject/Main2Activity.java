package com.example.a14123.demoproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //intent获取数据
        int imageId = getIntent().getIntExtra("teacher_image",0);
        String desc = getIntent().getStringExtra("teacher_desc");

        //获取试图
        ImageView imageView = (ImageView) findViewById(R.id.teacher_large_imageView);
        TextView textView = (TextView) findViewById(R.id.teachwe_desc_textView);

        //设置试图
        imageView.setImageResource(imageId);
        textView.setText(desc);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
