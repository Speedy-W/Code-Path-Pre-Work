package com.example.pre_workbonusfeatures;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        // User can tap a button to change the text color of the label.
        findViewById(R.id.Button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change the text color of the label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));
            }
        });
        // User can tap on button to change the color of the background color.
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.red));
            }
        });
        //user can tap on the button to change the test string of the label "Android is Awesome"
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setText("Android Is Awesome!");
            }
        });
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // User can tap on the background view to reset all views
                //1. Reset the text to "Hello from Chris!" id - @id/text
                textView.setText("Hello From Chris!");
                //2. Reset the color of the txt to original color'
                //Original text color - black, text id - @id/text
                textView.setTextColor(getResources().getColor(R.color.black));
                //3. Reset the background color
                //Original background color - R.color.ElcBlue
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.ElcBlue));


            }
        });
        //User can tap the "Change text string" button to update the label with the text from the text field.
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change the text view to whats in the edit text view
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();

                if (userEnteredText.isEmpty()) {
                    textView.setText("Enter your own text!");
                } else {
                    textView.setText((userEnteredText));
                }

            }
        });
    }
}
