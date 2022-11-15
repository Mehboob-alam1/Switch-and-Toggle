package com.mehboob.widgetsabout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity  implements AdapterView.OnItemSelectedListener {
private Spinner spinner;
String[] sports={"Choose a category","Cricket","Football","Hockey","Polo"};
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        spinner= findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,sports);


        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);





    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        String name = (String) adapterView.getItemAtPosition(i);

        switch (name){
            case "Choose a category":
                Toast.makeText(this, "Select any item", Toast.LENGTH_SHORT).show();
                break;
            case "Cricket":

        }

        Toast.makeText(this, "Seleted Item name is "+adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}