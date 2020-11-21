package com.example.saharaairlines;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verify);
    }
    public void gotoenroll(View view) {
        Intent Intent = new Intent(this, EnrollActivity.class);
        startActivity(Intent);
    }

}
