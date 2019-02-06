package com.example.ahova.guidept;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static android.content.Intent.ACTION_VIEW;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_me);

        TextView textView = (TextView) findViewById(R.id.did_you_know);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }

    public void openDialog(){
        Knowthis knowthis = new Knowthis();
        knowthis.show(getSupportFragmentManager(), "Let you know");
    }

    public void ImageMap(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/ECMsmAEDhzQ2"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}
