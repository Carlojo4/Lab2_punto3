package com.example.familia.lab2_punto3;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void method (View view){
        final EditText _quices=(EditText)findViewById(R.id.equices);
        final EditText _expo=(EditText)findViewById(R.id.eexpo);
        final EditText _prac=(EditText)findViewById(R.id.eprac);
        final EditText _proy=(EditText)findViewById(R.id.eproy);
        final TextView tnota = (TextView)findViewById(R.id.tnota);
        double quices,expo,prac,proy,nota;
        quices= Double.valueOf(_quices.getText().toString());
        expo = Double.valueOf(_expo.getText().toString());
        prac = Double.valueOf(_prac.getText().toString());
        proy = Double.valueOf(_proy.getText().toString());

        if(quices<=5 && expo <=5 && prac<=5 && proy<=5) {
            nota = quices * 0.15 + expo * 0.1 + prac * 0.4 + proy * 0.35;
        }else// if(quices>5 || expo >5 || prac>5 || proy>5)
            nota=0;
        tnota.setText(String.valueOf(nota));
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
