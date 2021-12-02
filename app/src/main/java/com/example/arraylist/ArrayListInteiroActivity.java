package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ArrayListInteiroActivity extends AppCompatActivity {

    private ListView listViewInteiro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list_inteiro);

        listViewInteiro = findViewById(R.id.listViewInteiro);

        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(10);
        listaNumeros.add(5);
        listaNumeros.add(4);
        listaNumeros.add(12);
        listaNumeros.add(5);

        ArrayAdapter<Integer> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                listaNumeros
        );
        listViewInteiro.setAdapter(adapter);

        listViewInteiro.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(ArrayListInteiroActivity.this,
                        "Elemento clicado " + i + " --> " + listaNumeros.get(i),
                       Toast.LENGTH_SHORT).show();
            }
        });
    }
}