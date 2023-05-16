package com.example.phonecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bluetooth(View view) {
        Intent intent = new Intent(MainActivity.this, bluetooth.class);
        startActivity(intent);
    }

    public void powerbutton(View view) {
        Intent intent = new Intent(MainActivity.this, powerbutton.class);
        startActivity(intent);
    }

    public void camera(View view) {
        Intent intent = new Intent(MainActivity.this, camera.class);
        startActivity(intent);
    }

    public void cpu(View view) {
        Intent intent = new Intent(MainActivity.this, cpu.class);
        startActivity(intent);
    }

    public void storage(View view) {
        Intent intent = new Intent(MainActivity.this, storage.class);
        startActivity(intent);
    }

    public void mic(View view) {
        Intent intent = new Intent(MainActivity.this, mic.class);
        startActivity(intent);
    }

    public void logout(View view) {
        Intent intent = new Intent(MainActivity.this, logout.class);
        startActivity(intent);
    }
}