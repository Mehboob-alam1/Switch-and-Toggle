package com.mehboob.widgetsabout.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.mehboob.widgetsabout.R;

public class CustomAdapter extends BaseAdapter {

    Context context;
    final String[] title;
    final String[] subtitle;
    final int[] images;

    public CustomAdapter(Context context, String[] title, String[] subtitle, int[] images) {
        this.context = context;
        this.title = title;
        this.subtitle = subtitle;
        this.images = images;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }




    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {



        View view = LayoutInflater.from(context).inflate(R.layout.sample_listview, parent, false);

        ImageView iv = view.findViewById(R.id.list_image);
        TextView Title = view.findViewById(R.id.list_title);
        TextView Subtitle = view.findViewById(R.id.list_subtitle);


        iv.setImageResource(images[position]);
        Title.setText(title[position]);
        Subtitle.setText(subtitle[position]);


        return view;
    }
}
