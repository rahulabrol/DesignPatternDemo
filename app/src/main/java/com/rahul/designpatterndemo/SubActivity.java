package com.rahul.designpatterndemo;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

public class SubActivity extends AppCompatActivity {
    private static final String TAG = "SubActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Log.e(TAG, "onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy called");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(TAG, "onSaveInstanceState called");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(TAG, "onRestoreInstanceState called");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.e(TAG, "onBackPressed called");
    }
}

