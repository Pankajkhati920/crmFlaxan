package com.flaxeninfosoft.flaxencrm.Sales.Views.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.flaxeninfosoft.flaxencrm.R;

import java.util.List;

public class ProjectAdapter extends RecyclerView.Adapter {

    @Override
 public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.project_lay, parent, false);
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
        }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
    }


  @Override
   public int getItemCount() {
        return 0;
    }
public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    public MyViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.name);
    }
}
}
