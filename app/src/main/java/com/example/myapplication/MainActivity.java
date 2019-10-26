package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Integer> images=new ArrayList<>();
    ArrayList<String> text=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView=(RecyclerView) findViewById(R.id.recycler);
        Adapter adapter=new Adapter(images,text,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        init();



    }

    private void init() {

        images.add(R.drawable.bulb);
        text.add("Sample text 1");

        images.add(R.drawable.bulb);
        text.add("Sample text 2");

        images.add(R.drawable.bulb);
        text.add("Sample text 3");

        images.add(R.drawable.bulb);
        text.add("Sample text 4");

        images.add(R.drawable.bulb);
        text.add("Sample text 1");

        images.add(R.drawable.bulb);
        text.add("Sample text 1");

        images.add(R.drawable.bulb);
        text.add("Sample text 1");

        images.add(R.drawable.bulb);
        text.add("Sample text 1");
    }
}
