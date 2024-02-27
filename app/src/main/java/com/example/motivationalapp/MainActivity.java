package com.example.motivationalapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView quote;
    private Button next;
    private String[] quotes = {"It takes courage to grow up and become who you really are.\" — E.E. Cummings","eep your face always toward the sunshine, and shadows will fall behind you.\" — Walt Whitman",
    "\"You are never too old to set another goal or to dream a new dream.\" — C.S. Lewis",
    "\"If you prioritize yourself, you are going to save yourself.\" — Gabrielle Union"};
    private int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize TextView and Button
        quote = findViewById(R.id.textView3);
        next = findViewById(R.id.button);

        // Display the initial quote
        DisplayQuote();

        // Set up onClickListener for the "Next" button
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Increment index to display the next quote
                currentIndex = (currentIndex + 1) % quotes.length;
                // Update the displayed quote
                DisplayQuote();
            }
        });
    }

    // Method to display the current quote
    private void DisplayQuote() {
        quote.setText(quotes[currentIndex]);
    }
}
