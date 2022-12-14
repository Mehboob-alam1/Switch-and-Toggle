package com.mehboob.widgetsabout.Activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;


import com.mehboob.widgetsabout.R;
import com.mehboob.widgetsabout.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityMainBinding binding;
    private static final String TAG = "MainActivity";
    AlertDialog.Builder builder;
    ImageView iv;
    ProgressDialog dialog;
    RatingBar ratingBar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        dialog = new ProgressDialog(MainActivity.this);

        dialog.setTitle("Sign In");
        dialog.setMessage("Please wait.....");
        // dialog.setCancelable(false);


        builder = new AlertDialog.Builder(this);
        iv = findViewById(R.id.imageView);

        iv.setOnClickListener(view -> {

            onBackPressed();
        });

        binding.btnLogin.setOnClickListener(this);




    }

    @Override
    public void onBackPressed() {


        builder.setMessage("Are you sure you want to exit!")
                .setTitle("Exit")

                .setPositiveButton("Awa La", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finishAffinity();
                    }
                }).setNegativeButton("Nay La", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.dismiss();
                    }
                }).setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Neutral mode", Toast.LENGTH_SHORT).show();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();


    }

    @Override
    public void onClick(View view) {

        startActivity(new Intent(MainActivity.this, MainActivity2.class));

    }
}