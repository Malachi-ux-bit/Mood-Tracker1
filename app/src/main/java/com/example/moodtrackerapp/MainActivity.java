package com.example.moodtrackerapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declare UI component variables
    private EditText moodInput;
    private Button submitButton;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Links this code to your UI layout file

        // Initialize UI components by finding them in the layout
        moodInput = findViewById(R.id.moodInput);
        submitButton = findViewById(R.id.submitButton);
        resultText = findViewById(R.id.resultText);

        // Set a click listener on the button to define its behavior
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the text from the EditText and remove leading/trailing whitespace
                String mood = moodInput.getText().toString().trim();

                // Check if the input is empty
                if (mood.isEmpty()) {
                    resultText.setText("Please enter a mood!");
                } else {
                    // Display the entered mood back to the user
                    resultText.setText("Today is a " + mood + " day!");
                }
            }
        });
    }
}
