package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ArraysListStringActivity extends AppCompatActivity {

    private ListView listViewString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrays_list_string);


        listViewString = findViewById(R.id.listViewString);

        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Bruno Bordin");
        listaNomes.add("Pati Amaral");
        listaNomes.add("Bruno Gagliasso");
        listaNomes.add("Filipe Titto");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                ArraysListStringActivity.this,
                android.R.layout.simple_list_item_1,
                listaNomes
        );
        listViewString.setAdapter(adapter);

        listViewString.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(
                        ArraysListStringActivity.this,
                        "Posiciçao da lista " + i + " -> " + listaNomes.get(i),
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}