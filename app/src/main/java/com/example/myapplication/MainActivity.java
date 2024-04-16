package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("onCreate()");

        Button exitButton = findViewById(R.id.exitButton);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Log.d(TAG, "onCreate: Activity создана и это пример Отладки через Log.d()");
        Log.e(TAG, "Ошибка: это пример Log.e()");
        Log.w(TAG, "Предупреждение: это пример Log.w()");
        Log.i(TAG, "Информация: это пример Log.i()");
        Log.v(TAG, "Подробности: это пример Log.v()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        showToast("onStart()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        showToast("onStop()");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        showToast("onRestart()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("onDestroy()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        showToast("onPause()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        showToast("onResume()");
    }
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}