package com.mehboob.widgetsabout.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

import com.mehboob.widgetsabout.Adapters.CustomAdapter;
import com.mehboob.widgetsabout.R;

public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener, View.OnClickListener {
    private Spinner spinner;
    AlertDialog.Builder builder;
    private AutoCompleteTextView autoCompleteTextView;
    private ListView listView;
    AppCompatButton button;
    RatingBar ratingBar;
    String[] sports = {"Choose a category", "Cricket", "Football", "Hockey", "Polo"};
    int[] Images = {R.drawable.ic_baseline_home_24, R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground};
    String[] title = {"Home", "Background", "Foreground"};
    String[] sub_title = {"Home desc ", "Background desc ", "Foreground desc"};
    //
    String[] subjects = {"English", "Maths", "Physics", "Chemistry", "Urdu", "Islamiat"};
    String[] dishes = {"Biryani", "Sandwich", "Burger", "Chow-min", "Dow Dow", "Pulao", "Mix Sabzi", "Kilao", "Chicken", "Karahi", "Sikh Kabab", "Quorma", "Samosa"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ratingBar=findViewById(R.id.ratin);
        spinner = findViewById(R.id.spinner);
        autoCompleteTextView = findViewById(R.id.autoCompletetext);
        listView = findViewById(R.id.listView);
        button=findViewById(R.id.btnSubmit);
        ratingBar.setRating(5);
        builder = new AlertDialog.Builder(this);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, sports);


        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);

//
        ArrayAdapter<String> autoCompleteAdapter = new ArrayAdapter<>(this, android.R.layout.select_dialog_item, subjects);

        autoCompleteTextView.setThreshold(3);
        autoCompleteTextView.setAdapter(autoCompleteAdapter);


//        ArrayAdapter<String> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
//        listView.setAdapter(dishesAdapter);
        CustomAdapter adapter1 = new CustomAdapter(this, title, sub_title, Images);

        listView.setAdapter(adapter1);

        listView.setOnItemClickListener(this::onItemClick);
        button.setOnClickListener(this::onClick);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        String name = (String) adapterView.getItemAtPosition(i);

        switch (name) {
            case "Choose a category":
                Toast.makeText(this, "Select any item", Toast.LENGTH_SHORT).show();
                break;
            case "Cricket":

        }

        Toast.makeText(this, "Selected Item name is " + adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        String obj = (String) adapterView.getItemAtPosition(i);

        Toast.makeText(this, "Elected item " + obj, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        builder.setMessage("Are you sure you want to exit")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finishAffinity();
                    }
                }).setNegativeButton("N0", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity2.this, "Bajwa", Toast.LENGTH_SHORT).show();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    public void onClick(View view) {


          startActivity(new Intent(MainActivity2.this,DashBoardActivity.class));


    }
}