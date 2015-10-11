package com.example.student.breastcancer;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import java.io.*;
import java.util.*;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    // FIX SPLASH SCREEN

    public void onClickHelp(View view){
        setContentView(R.layout.help);

        TextView textView = (TextView)findViewById(R.id.textView3);

        String data = readTextFile(this, R.raw.help);
        textView.setText(data);
    }
    public static String readTextFile(Context ctx, int resId)
    {
        InputStream inputStream = ctx.getResources().openRawResource(resId);

        InputStreamReader inputreader = new InputStreamReader(inputStream);
        BufferedReader bufferedreader = new BufferedReader(inputreader);
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        try
        {
            while (( line = bufferedreader.readLine()) != null)
            {
                stringBuilder.append(line);
                stringBuilder.append('\n');
            }
        }
        catch (IOException e)
        {
            return null;
        }
        return stringBuilder.toString();
    }
    public void onClickPledge(View view){
        setContentView(R.layout.pledge);
    }
    public void onClickWhat(View view){
        setContentView(R.layout.whatisbreastcancer);
    }
    public void onClickDo(View view){
        setContentView(R.layout.doihavebreastcancer);
    }
    public void onClickIThink (View view){
        setContentView(R.layout.ithinkihaveit);
    }
    public void onClickIDont (View view){
        setContentView(R.layout.idontthhink);
    }
    public void onClickBack(View view){
        setContentView(R.layout.activity_main);
    }
    public void onClickBack1(View view){
        setContentView(R.layout.activity_main);
    }
    public void onClickBack2(View view){
        setContentView(R.layout.activity_main);
    }
    public void onClickBack3(View view){
        setContentView(R.layout.activity_main);
    }
    public void onClickBack4(View view){
        setContentView(R.layout.activity_main);
    }
    public void onClickBack5(View view){
        setContentView(R.layout.activity_main);
    }
    public void onClickSwear(View view){
        Toast.makeText(this, "Thank you for pledging!", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
