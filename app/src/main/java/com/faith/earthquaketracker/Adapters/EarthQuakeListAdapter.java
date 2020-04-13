package com.faith.earthquaketracker.Adapters;
import android.content.Intent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.faith.earthquaketracker.R;
import com.faith.earthquaketracker.UI.EarthQuakeDetailActivity;
import com.faith.earthquaketracker.models.EarthQuake;

import java.util.ArrayList;
import java.util.List;
public class EarthQuakeListAdapter extends RecyclerView.Adapter<EarthQuakeListAdapter.ViewHolder> {

    //defining variables
    private List<EarthQuake> earthQuakeList;
    String location;
    String depth;
    String magnitude;
    String locashen;
    String depthdd;
    String magnituded;
    String [] locations;
    String [] depths;
    String [] magnitudes;
    String [] descriptions;
    String description;

    //constructor
    public EarthQuakeListAdapter(List<EarthQuake> earthQuakeList) {
        this.earthQuakeList = earthQuakeList;
    }


    //inflating the recycler view item
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        //getting individual earthquake
        final EarthQuake earthQuake = earthQuakeList.get(position);

        //displaying earthQuake Title
        holder.title.setText(earthQuake.title);

        //getting variables from the description string
        description = earthQuake.description;
        descriptions = description.split(";");
        location = descriptions[1];
        depth = descriptions[3];
        magnitude = descriptions[4];
        locations = location.split(":");
        depths = depth.split(":");
        magnitudes = magnitude.split(":");
        locashen = locations[1];
        depthdd = depths [1];
        magnituded = magnitudes[1];
    }
    @Override
    public int getItemCount() {
        return earthQuakeList.size();
    }

    public void filterList(ArrayList<EarthQuake> filteredNames) {
        this.earthQuakeList = filteredNames;
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        //defining recycler view item
        TextView title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            title = itemView.findViewById(R.id.titleDisplay);

        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();

            if (position != RecyclerView.NO_POSITION) {
                EarthQuake earthQuake = earthQuakeList.get(position);

                //passing data to Next Activity
                Intent intent = new Intent(v.getContext(), EarthQuakeDetailActivity.class);
                intent.putExtra("title", earthQuake.title);
                intent.putExtra("date", earthQuake.pubDate);
                intent.putExtra("description", earthQuake.description);
                intent.putExtra("category", earthQuake.category);
                intent.putExtra("link", earthQuake.link);
                intent.putExtra("lat", earthQuake.lat);
                intent.putExtra("long", earthQuake.longtd);
                v.getContext().startActivity(intent);
            }
        }

    }

    public void updateList(List<EarthQuake> list){
        earthQuakeList = list;
        notifyDataSetChanged();
    }
}