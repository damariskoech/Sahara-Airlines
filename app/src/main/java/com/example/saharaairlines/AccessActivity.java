package com.example.saharaairlines;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access);
    }
    public void gotoregister(View view) {
        Intent Intent = new Intent(this, RegisterActivity.class);
        startActivity(Intent);

    }
    public void gotologin(View view) {
        Intent Intent = new Intent(this, LoginActivity.class);
        startActivity(Intent);
    }
}
