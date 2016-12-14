package com.overbudget.game2014;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.AutoCompleteTextView;

import static android.widget.TextView.*;

public class MainMenu extends AppCompatActivity {
    EditText editText;
    MainActivity main;
    String name;
    public static final String PREFS_NAME = "MyPrefsFile";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        editText = (EditText) findViewById(R.id.editText);
        TextView text = (TextView) findViewById(R.id.textView2);
        TextView text2 = (TextView) findViewById(R.id.textView2);
        TextView text3 = (TextView) findViewById(R.id.textView3);
        text.setTextColor(Color.RED);
        text2.setTextColor(Color.RED);
        text3.setTextColor(Color.RED);

        //GifImageView viewImage = (GifImageView) findViewById(R.id.text);
        editText.setOnEditorActionListener(new OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    sendMessage();
                    handled = true;
                }
                return handled;
            }
        });
    }


    void sendMessage()
    {
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        String petName = settings.getString("silentMode", editText.getText().toString());
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        name = editText.getText().toString();
        intent.putExtra("value", name);
        startActivity(intent);


    }
    @Override
    protected void onStop() {
        super.onStop();

        // We need an Editor object to make preference changes.
        // All objects are from android.context.Context
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString("Name", editText.getText().toString());

        // Commit the edits!
        editor.commit();
    }
}
