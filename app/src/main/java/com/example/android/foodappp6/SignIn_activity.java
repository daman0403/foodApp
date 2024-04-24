package com.example.android.foodappp6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class SignIn_activity extends AppCompatActivity {

    TextView tvSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);


        Objects.requireNonNull(getSupportActionBar()).setTitle("Sign in");

        tvSignUp = findViewById(R.id.tvSignUp);
        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignIn_activity.this, SignUp_activity.class);
                startActivity(intent);
            }
        });

    }
}