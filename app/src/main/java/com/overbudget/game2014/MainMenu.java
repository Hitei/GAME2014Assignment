package com.overbudget.game2014;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        TextView text = (TextView) findViewById(R.id.textView2);
        TextView text2 = (TextView) findViewById(R.id.textView2);
        TextView text3 = (TextView) findViewById(R.id.textView3);
        text.setTextColor(Color.RED);
        text2.setTextColor(Color.RED);
        text3.setTextColor(Color.RED);
        //GifImageView viewImage = (GifImageView) findViewById(R.id.text);
    }
}
