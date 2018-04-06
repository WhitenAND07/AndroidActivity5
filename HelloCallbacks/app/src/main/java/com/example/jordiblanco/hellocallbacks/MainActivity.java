package com.example.jordiblanco.hellocallbacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    private final static  String DADES = "dades";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.Text);
        textView.setText(getString(R.string.onCreate));
    }

    @Override
    protected void onStart(){
        textView.setText(textView.getText().toString() + getText(R.string.newLine) +
                getText(R.string.onStart));
        super.onStart();
    }
    @Override
    protected void onResume() {
        textView.setText(textView.getText().toString() + getText(R.string.newLine) +
                getText(R.string.onResume));
        super.onResume();
    }

    @Override
    protected void onPause() {
        textView.setText(textView.getText().toString() + getText(R.string.newLine) +
                getText(R.string.onPause));
        super.onPause();
    }

    @Override
    protected void onStop() {
        textView.setText(textView.getText().toString() + getText(R.string.newLine) +
                getText(R.string.onStop));
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        textView.setText(textView.getText().toString() + getText(R.string.newLine) +
                getText(R.string.onDestroy));
        super.onDestroy();

    }

    @Override
    protected void onRestart() {
        textView.setText(textView.getText().toString() + getText(R.string.newLine) +
                getText(R.string.onRestart));
        super.onRestart();
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        textView.setText(textView.getText().toString() + getText(R.string.newLine) +
                getText(R.string.onSaveInstanceState));
        String data = textView.getText().toString();
        outState.putString(DADES,data);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if(savedInstanceState != null){
            String data = savedInstanceState.getString(String.valueOf(DADES));
            textView.setText(textView.getText().toString() + getText(R.string.newLine) + data);
        }
        textView.setText(textView.getText().toString() + getText(R.string.newLine) +
                getText(R.string.onRestoreInstanceState));
    }
}
