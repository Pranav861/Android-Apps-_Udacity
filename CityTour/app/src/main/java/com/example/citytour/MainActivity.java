package com.example.citytour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView foods_text_view = findViewById(R.id.foods_txt_view);
        TextView forts_text_view = findViewById(R.id.forts_txt_view);
        TextView fun_text_view = findViewById(R.id.fun_txt_view);
        TextView dampark_text_view = findViewById(R.id.damsandparks_txt_view);

        foods_text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foods_intent = new Intent(MainActivity.this, FoodsActivity.class);
                startActivity(foods_intent);
            }
        });

        forts_text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forts_intent = new Intent(MainActivity.this, FortsActivity.class);
                startActivity(forts_intent);
            }
        });
        fun_text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fun_intent = new Intent(MainActivity.this, FunActivity.class);
                startActivity(fun_intent);
            }
        });
        dampark_text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dampark_intent = new Intent(MainActivity.this, DamAndParkActivity.class);
                startActivity(dampark_intent);
            }
        });

    }
}