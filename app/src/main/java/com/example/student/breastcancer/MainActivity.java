package com.example.student.breastcancer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import java.util.*;
import android.widget.*;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    //INCLUDE ONCLICKITHINK
    public void onClickHelp(View view){
        setContentView(R.layout.help);
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
