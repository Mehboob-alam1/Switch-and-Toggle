package com.mehboob.widgetsabout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btnSubmit;
    ToggleButton toggleButton1, toggleButton2;
    Switch aSwitch;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton1 = findViewById(R.id.toggle1);
        toggleButton2 = findViewById(R.id.toggle2);
        btnSubmit = findViewById(R.id.btnSubmit);
        aSwitch = findViewById(R.id.switch1);


        btnSubmit.setOnClickListener(view -> {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Toggle1 State ").append(toggleButton1.getText());
            stringBuilder.append("\nToggle2 State ").append(toggleButton2.getText());
            stringBuilder.append("\n\nSwitch ").append(aSwitch.isChecked());

            Toast.makeText(this, "" + stringBuilder, Toast.LENGTH_SHORT).show();


        });


    }


    public void customToast() {


        LayoutInflater li = getLayoutInflater();


        View view = li.inflate(R.layout.custom_toast, null);

        Toast toast = new Toast(MainActivity.this);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();

    }
}