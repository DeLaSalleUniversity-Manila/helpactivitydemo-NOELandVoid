package com.example.student.breastcancer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.*;
import java.io.IOException;
import java.io.InputStream;

public class ToastActivity extends AppCompatActivity {
    public void onClickSwear(View view){
        Toast.makeText(this, "Thank you for pledging!", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pledge);
    }

}
