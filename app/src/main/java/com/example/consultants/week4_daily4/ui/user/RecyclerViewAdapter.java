package com.example.consultants.week4_daily4.ui.user;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.consultants.week4_daily4.R;
import com.example.consultants.week4_daily4.model.Dicks.Venue;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    public static final String TAG = RecyclerViewAdapter.class.getSimpleName() + "_TAG";
    List<Venue> venueList;


    public RecyclerViewAdapter(List<Venue>venueList){
        this.venueList = venueList;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Log.d(TAG, "onCreateViewHolder: ");
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.venue_item_list,viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder viewHolder, int position) {
        Log.d(TAG, "onBindViewHolder: ");
        Venue venue = venueList.get(position);

        viewHolder.tvID.setText(venue.getStoreId().toString());
        viewHolder.tvCity.setText(venue.getLocation().getCity().toString());
        viewHolder.tvState.setText(venue.getLocation().getState().toString());
        viewHolder.tvRating.setText(venue.getRating().toString());

    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: ");
        return venueList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvID;
        private final TextView tvCity;
        private final TextView tvState;
        private final TextView tvRating;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvID = itemView.findViewById(R.id.tvID);
            tvCity = itemView.findViewById(R.id.tvCity);
            tvState = itemView.findViewById(R.id.tvState);
            tvRating = itemView.findViewById(R.id.tvRating);
        }
    }
}
