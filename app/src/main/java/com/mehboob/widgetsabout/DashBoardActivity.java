package com.mehboob.widgetsabout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DashBoardActivity extends AppCompatActivity {
    WebView webView;
    GridView gridView;
    private static final String TAG="DashboardActivity";
    int[] images={R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground};
            private GridAdapter gridAdapter;

            String[] title ={"launcher","launcher","launcher","launcher","launcher","launcher","launcher","launcher","launcher","launcher","launcher","launcher","launcher","launcher","launcher","launcher","launcher","launcher","launcher","launcher","launcher"};

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        gridView=findViewById(R.id.grid_view);

        gridAdapter= new GridAdapter(this,images,title);

        gridView.setAdapter(gridAdapter);

//        webView = findViewById(R.id.webview);
//
//
//        webView.getSettings().setJavaScriptEnabled(true);
//
//        webView.loadUrl("https://www.w3schools.com/");

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
   switch (i){
       case 0:
           Toast.makeText(DashBoardActivity.this, "Clicked 1", Toast.LENGTH_SHORT).show();
           break;
       case 1:
           Toast.makeText(DashBoardActivity.this, "Clicked 2", Toast.LENGTH_SHORT).show();
           break;
       case 2:
           Toast.makeText(DashBoardActivity.this, "Clicked 3", Toast.LENGTH_SHORT).show();
           break;
       case 3:
           Toast.makeText(DashBoardActivity.this, "Clicked 4", Toast.LENGTH_SHORT).show();
           break;
       case 4:
           Toast.makeText(DashBoardActivity.this, "Clicked 5", Toast.LENGTH_SHORT).show();
           break;
   }
            }
        });


    }
}
