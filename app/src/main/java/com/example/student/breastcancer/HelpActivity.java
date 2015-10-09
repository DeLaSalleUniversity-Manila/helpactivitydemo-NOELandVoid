package com.example.student.breastcancer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.*;
import java.io.IOException;
import java.io.InputStream;

public class HelpActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
        InputStream iFile = getResources().openRawResource(R.raw.help);
        try {
            TextView helpText = (TextView) findViewById(R.id.textView3);
            String strFile = inputStreamToString(iFile);
            helpText.setText(strFile);
        } catch (Exception e) {
            // Handle Exception, i.e. toast cannot open file
        }
    }

    public String inputStreamToString(InputStream is) throws IOException {
        StringBuffer sBuffer = new StringBuffer();
        DataInputStream dataIO = new DataInputStream(is);
        String strLine = null;

        while ((strLine = dataIO.readLine()) != null) {
            sBuffer.append(strLine + "\n");
        }

        dataIO.close();
        is.close();

        return sBuffer.toString();
    }
    private void handleIntent() {
        Intent i = getIntent();
        String day_out = i.getStringExtra("message");
        TextView tv_out = (TextView) findViewById(R.id.textView3);
        tv_out.setText(day_out);
    }
}