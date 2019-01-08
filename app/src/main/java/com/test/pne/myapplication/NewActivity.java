package com.test.pne.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        ImageView imageView = (ImageView) findViewById(R.id.iv_image);
        imageView.setImageResource(R.drawable.img);
    }
}
