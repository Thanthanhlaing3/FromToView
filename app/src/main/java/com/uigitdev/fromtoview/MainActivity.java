package com.uigitdev.fromtoview;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.uigitdev.fromtoview.uigitdev.design.FromToView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FromToView fromToView = new FromToView(findViewById(R.id.from_to_view));
        fromToView.setCurrentPosition("Times Square, New York, Manhattan, New York");
        Log.d("Dlog", fromToView.getDestination());
        Log.d("Dlog", fromToView.getCurrentPosition());
    }
}
