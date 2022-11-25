package com.mehboob.widgetsabout.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mehboob.widgetsabout.Models.ReccyclerModel;
import com.mehboob.widgetsabout.R;

import java.util.ArrayList;

public class RecyclerAdpater extends RecyclerView.Adapter<RecyclerAdpater.MyViewHolder>{
private Context context;
private ArrayList<ReccyclerModel> list;

    public RecyclerAdpater(Context context, ArrayList<ReccyclerModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View veiw = LayoutInflater.from(context).inflate(R.layout.hhh,parent,false);
        return new MyViewHolder(veiw);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    ReccyclerModel data=    list.get(position);

    holder.tv.setText(data.getTitle());
    holder.iv.setImageResource(data.getImage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
ImageView iv;
TextView tv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
 iv= itemView.findViewById(R.id.recycleImage);
tv=     itemView.findViewById(R.id.recycleText);
        }
    }
}
