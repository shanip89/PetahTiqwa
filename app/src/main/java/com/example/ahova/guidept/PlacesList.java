package com.example.ahova.guidept;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class PlacesList extends AppCompatActivity {


    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list_me);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<Map> cities = new ArrayList<Map>();
        cities.add(new Map(R.drawable.ptmap, "Hello to the city", "it's about time", R.drawable.pthall, "https://goo.gl/maps/ECMsmAEDhzQ2"));
        cities.add(new Map (R.drawable.pthall, "The best musem you ever know", "want to know more?", R.drawable.artmap, "https://goo.gl/maps/93tiFYdWfU42"));
        mAdapter = new MapAdapter(this, cities);
        recyclerView.setAdapter(mAdapter);
    }
}

