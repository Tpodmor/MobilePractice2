package ru.mirea.petukhov.lifecycleactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String WORD = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(WORD, "onCreate()");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(WORD, "onStart()");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(WORD, "onRestoreInstanceState()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(WORD, "onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(WORD, "onPause()");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.i(WORD, "onSaveInstanceState()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(WORD, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(WORD, "onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(WORD, "onRestart()");
    }
}