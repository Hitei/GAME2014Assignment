package com.overbudget.game2014;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import org.w3c.dom.Text;

public class StarvingSystem extends AppCompatActivity {

    int arda;
    public int starvingNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starving_system);

//this is showing starvingNum/100
        arda = 100;
        final TextView text = (TextView) findViewById(R.id.textView);
        text.setText(Integer.toString(starvingNum) + "/" + Integer.toString(arda));

        final TextView DeathText = (TextView) findViewById(R.id.editText4);


//number decreasing here
        new CountDownTimer(6060000,1000000000)
        {
            public void onTick(long millisUntilFinished)
            {
                text.setText("Stamina Remaining: " + millisUntilFinished / 60000);

            }


            public void onFinish()
             {
                 DeathText.setText("Your pet is dead!");
             }
    }.start();

    }
}
