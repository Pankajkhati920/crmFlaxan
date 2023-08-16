package com.flaxeninfosoft.flaxencrm.Android.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.flaxeninfosoft.flaxencrm.R;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.TeamViewHolder> {

    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.team_list_item, parent, false);
        return new TeamViewHolder(v);
    }

    public void onBindViewHolder(@NonNull TeamViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class TeamViewHolder extends RecyclerView.ViewHolder {

        TextView name, date, dept;
        ImageView img, docs;

        public TeamViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            date = itemView.findViewById(R.id.date);
            dept = itemView.findViewById(R.id.dept);
            img = itemView.findViewById(R.id.img);


        }
    }


}

