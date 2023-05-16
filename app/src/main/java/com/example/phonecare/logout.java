package com.example.phonecare;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class logout extends AppCompatActivity {
    private Button btnLogout;

    private FirebaseFirestore db;
    private FirebaseAuth mAuth;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        db = FirebaseFirestore.getInstance();

        mAuth = FirebaseAuth.getInstance();
        btnLogout = findViewById(R.id.btnLogout);db = FirebaseFirestore.getInstance();

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mAuth.signOut();
                Intent intent = new Intent(logout.this,Register.class);
                startActivity(intent);
                finish();
                Toast.makeText(getApplicationContext(), "Logout done", Toast.LENGTH_SHORT).show();
            }
        });
    }
}