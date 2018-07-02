package com.example.android.musicalstructureapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class GenreAdapter extends RecyclerView.Adapter<GenreAdapter.MyViewHolder> {

    private Context mContext;
    private List<Genre> mData;

    GenreAdapter(Context mContext, List<Genre> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @NonNull
    @Override
    public GenreAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.list_genre, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GenreAdapter.MyViewHolder holder, int position) {

        holder.genre_name.setText(mData.get(position).getGenreName());
        holder.genre_thumbnail.setImageResource(mData.get(position).getGenreThumbnail());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView genre_name;

        ImageView genre_thumbnail;

        MyViewHolder(View itemView) {
            super(itemView);

            genre_name = itemView.findViewById(R.id.genre_name_id);
            genre_thumbnail = itemView.findViewById(R.id.genre_img_id);
        }
    }
}
