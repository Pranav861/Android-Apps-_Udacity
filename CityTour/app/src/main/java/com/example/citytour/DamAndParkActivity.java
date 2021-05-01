package com.example.citytour;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DamAndParkActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstances) {
        super.onCreate(savedInstances);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Khadakwasla Dam", "off Sinhagad Road", R.drawable.mk));
        words.add(new Word("Panshet Dam", "Velhe", R.drawable.mk));
        words.add(new Word("Temghar dam", "Mulshi", R.drawable.mk));
        words.add(new Word("Saras Baug", "Pune", R.drawable.mk));
        words.add(new Word("Peshwa Udyan", "Sane Guruji Road", R.drawable.mk));
        words.add(new Word("Rajiv Gandhi Zoological Park", "Katraj", R.drawable.mk));
        words.add(new Word("Koyna Dam", "Pune", R.drawable.mk));
        words.add(new Word("Pawna Dam", "Pune", R.drawable.mk));
        words.add(new Word("Varsgaon Dam", "Pune", R.drawable.mk));
        words.add(new Word("Kasarai Dam", "Pune", R.drawable.mk));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_damandpark);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
