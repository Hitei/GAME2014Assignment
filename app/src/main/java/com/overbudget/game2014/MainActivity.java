package com.overbudget.game2014;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {
    MainMenu main;
    TextView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle extra = getIntent().getExtras();
        String value = extra.getString("value");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = (TextView) findViewById(R.id.Name);
        view.setText(value);
        SharedPreferences settings = getSharedPreferences(main.PREFS_NAME, 0);
        String name = settings.getString("Name", value);
    }
}
