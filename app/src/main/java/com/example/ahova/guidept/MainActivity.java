package com.example.ahova.guidept;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = findViewById(R.id.open);
        TextView diffrent = findViewById(R.id.diffrent);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, PlacesList.class);
                numbersIntent.putExtra("index", 0);
                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        diffrent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {







            }
        });


    }

}


