package com.smart.path;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.smart.path.view.MutilateView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MutilateView(this));
    }
}
