package com.mehboob.widgetsabout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {
    private Context context;
    private int[] images;
    private String[] title;

    public GridAdapter(Context context, int[] images, String[] title) {
        this.context = context;
        this.images = images;
        this.title = title;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    @SuppressLint("MissingInflatedId")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View grid_view = LayoutInflater.from(context).inflate(R.layout.grid_layout_custom, null, false);

        ImageView iv = grid_view.findViewById(R.id.image);

       TextView tv= grid_view.findViewById(R.id.title_1);

        iv.setImageResource(images[i]);
        tv.setText(title[i]);


        return grid_view;
    }
}
