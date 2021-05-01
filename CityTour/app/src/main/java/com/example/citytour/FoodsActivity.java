package com.example.citytour;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FoodsActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Vada Pav", "Garden Vada Pav; Joshi Vadewale; Priyadarshan Snacks", R.drawable.mk));
        words.add(new Word("Misal Pav", "Bedekar; Bhadait ", R.drawable.mk));
        words.add(new Word("Bhakarwadi", "Chitale; KAKA HALWAI", R.drawable.mk));
        words.add(new Word("Bhel", "Kalyan Bhel, Kailas Bhel", R.drawable.mk));
        words.add(new Word("Pohe", "Amruteshwar, Bipin Snacks", R.drawable.mk));
        words.add(new Word("Bahubali Thali", "Parantha House", R.drawable.mk));
        words.add(new Word("Bun Maska", "Vouhman Cafe; Goodluck Cafe", R.drawable.mk));
        words.add(new Word("Kheema Pav", "Cafe Goodluck", R.drawable.mk));
        words.add(new Word("Sabudana Wada", "J.M. Road", R.drawable.mk));
        words.add(new Word("Mastani", "Sujata Mastani", R.drawable.mk));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_foods);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
