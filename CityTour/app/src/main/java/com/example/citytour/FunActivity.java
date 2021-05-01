package com.example.citytour;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FunActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstances) {
        super.onCreate(savedInstances);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Adlabs Imagica", "Pali-Khopoli Road", R.drawable.mk));
        words.add(new Word("Diamond Water Park", "Lohegaon", R.drawable.mk));
        words.add(new Word("Rajiv Gandhi Zoological Park", "Katraj", R.drawable.mk));
        words.add(new Word("Absolute Scuba", "Yerawada", R.drawable.mk));
        words.add(new Word("Khadakwasla Dam", "Off Sinhagad Road", R.drawable.mk));
        words.add(new Word("Saras Baug", "Saras Baug Road Pune", R.drawable.mk));
        words.add(new Word("Seven Wonders Dream Park", "Parwati Pytha", R.drawable.mk));
        words.add(new Word("Blue Bay Waterparks", "Pune-Bengaluru Highway", R.drawable.mk));
        words.add(new Word("Timezone Entertainment", "Viman Nagar Road", R.drawable.mk));
        words.add(new Word("Appu Ghar Amusment PArk", "Pimpri-Chinchawad", R.drawable.mk));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_fun);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
