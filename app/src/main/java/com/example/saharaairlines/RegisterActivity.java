package com.example.saharaairlines;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void gotoverify(View view) {
        Intent Intent = new Intent(this, VerifyActivity.class);
        startActivity(Intent);
    }
}
