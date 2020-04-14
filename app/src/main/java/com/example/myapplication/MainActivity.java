package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button signin,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (SharedPrefManager.getInstance(this).isLoggedIn()) {
            finish();
            startActivity(new Intent(this, WellcomeActivity.class));
            return;
        }
        signin = (Button) findViewById(R.id.signin);
        signup = (Button) findViewById(R.id.signup);

        signin.setOnClickListener(this);
        signup.setOnClickListener(this);

    }
        @Override
    public void onClick(View v) {
            if (v == signin)
                startActivity(new Intent(this, LoginActivity.class));
            if(v == signup)
                startActivity(new Intent(this, RegisterActivity.class));
    }
}
