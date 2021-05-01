package com.example.citytour;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FortsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstances) {
        super.onCreate(savedInstances);
        setContentView(R.layout.word_list);


        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Sinhagad Fort", "20kms to south-west of Pune", R.drawable.mk));
        words.add(new Word("Purandar Fort", "41 km via Saswad-Bopdev-Pune Road", R.drawable.mk));
        words.add(new Word("Tikona Fort", "Maval, near Kamshet", R.drawable.mk));
        words.add(new Word("Lohagad Fort", "Near Lonavala", R.drawable.mk));
        words.add(new Word("Shivneri Fort", "Junnar", R.drawable.mk));
        words.add(new Word("Torna Fort", "71 km via NH 48 and SH 65", R.drawable.mk));
        words.add(new Word("Tung Fort", "Pune", R.drawable.mk));
        words.add(new Word("Rohida Fort", "Pune", R.drawable.mk));
        words.add(new Word("Kenjalgad Fort", "Pune", R.drawable.mk));
        words.add(new Word("Korigad Fort", "Pune", R.drawable.mk));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_forts);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
