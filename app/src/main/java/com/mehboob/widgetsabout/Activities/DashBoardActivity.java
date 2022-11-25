package com.mehboob.widgetsabout.Activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mehboob.widgetsabout.Adapters.GridAdapter;
import com.mehboob.widgetsabout.Adapters.RecyclerAdpater;
import com.mehboob.widgetsabout.Models.ReccyclerModel;
import com.mehboob.widgetsabout.R;

import java.util.ArrayList;
import java.util.Date;

public class DashBoardActivity extends AppCompatActivity {

RecyclerAdpater adaapter;


private RecyclerView recyclerView;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        recyclerView=findViewById(R.id.recyclerView);

       ArrayList<ReccyclerModel> list = new ArrayList<>();

       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));
       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));
       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));
       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));
       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));
       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));
       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));
       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));
       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));
       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));
       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));
       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));
       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));
       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));
       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));
       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));
       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));
       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));
       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));
       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));
       list.add( new ReccyclerModel(R.drawable.ic_baseline_home_24,"Home"));


                adaapter = new RecyclerAdpater(this,list);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));
                recyclerView.setAdapter(adaapter);







    }

}
