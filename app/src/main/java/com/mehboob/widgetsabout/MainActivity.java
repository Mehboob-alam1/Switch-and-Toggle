package com.mehboob.widgetsabout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.mehboob.widgetsabout.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
private static final String TAG="MainActivity";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(view -> {

            if (binding.etEmail.getText().toString().isEmpty()){
                binding.etEmail.setError("Email required");
            }else if (binding.etPassword.getText().toString().isEmpty()){
                binding.etPassword.setError("Password required");
            }else if (binding.etEmail.getText().toString().equals("mehboobcodes@gmail.com") && binding.etPassword.getText().toString().equals("123456")){
                Toast.makeText(this, "Successfully login", Toast.LENGTH_SHORT).show();
            }else  if (!binding.etEmail.getText().toString().equals("mehboobcodes@gmail.com")){
                Log.d(TAG,"Wrong email");
                binding.etEmail.setError("Wrong email");
            }else  if (!binding.etPassword.getText().toString().equals("123456")){
                Log.d(TAG,"Wrong password");
                binding.etPassword.setError("Wrong password");
            }




        });




    }




}