package com.example.girish.bake.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.girish.bake.Activity.Main2Activity;
import com.example.girish.bake.Activity.MainActivity;
import com.example.girish.bake.Model.BakeResponse;
import com.example.girish.bake.R;

import java.util.List;


public class BakeAdapter extends RecyclerView.Adapter<BakeAdapter.bakeViewHolder> {
final String TAG="RecyclerView";
    private List<BakeResponse> bakeResults;
    private int rowLayout;
    private Context context;
    MainActivity mainActivity;

    public static class bakeViewHolder extends RecyclerView.ViewHolder {
        LinearLayout bakeLayout;
        TextView bakeName;
        TextView data;
        TextView movieDescription;
        TextView rating;


        public bakeViewHolder(View v) {
            super(v);
            bakeLayout = (LinearLayout) v.findViewById(R.id.movies_layout);
            bakeName = (TextView) v.findViewById(R.id.title);

            //data = (TextView) v.findViewById(R.id.subtitle);
            //movieDescription = (TextView) v.findViewById(R.id.description);
            //rating = (TextView) v.findViewById(R.id.rating);
        }
    }

    public BakeAdapter(List<BakeResponse> bakeResults,MainActivity mainActivity, int rowLayout, Context context) {
        this.bakeResults = bakeResults;
        this.rowLayout = rowLayout;
        this.mainActivity=mainActivity;
        this.context = context;

    }

    @Override
    public BakeAdapter.bakeViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);

        return new bakeViewHolder(view);
    }


    @Override
    public void onBindViewHolder(bakeViewHolder holder, final int position) {
        holder.bakeName.setText(bakeResults.get(position).getName());
      //  holder.data.setText(bakeResults.get(position).getReleaseDate());
       // holder.movieDescription.setText(bakeResults.get(position).getOverview());
        //holder.rating.setText(bakeResults.get(position).getVoteAverage().toString());

        holder.bakeName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();



                mainActivity.callDetailPage();

            }
        });
    }

    @Override
    public int getItemCount() {
        return bakeResults.size();
    }
}