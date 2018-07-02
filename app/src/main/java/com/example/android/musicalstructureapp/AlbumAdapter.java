package com.example.android.musicalstructureapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.MyViewHolder> {

    private Context mContext;
    private List<Album> mData;

    AlbumAdapter(Context mContext, List<Album> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.list_album, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.album_title.setText(mData.get(position).getAlbumName());
        holder.album_image.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent albumIntent = new Intent(mContext, AlbumIntent.class);
                albumIntent.putExtra("Title", mData.get(position).getAlbumName());
                albumIntent.putExtra("Thumbnail", mData.get(position).getThumbnail());
                mContext.startActivity(albumIntent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView album_title;

        ImageView album_image;

        CardView cardView;

        MyViewHolder(View itemView) {
            super(itemView);

            album_title = itemView.findViewById(R.id.album_title_id);
            album_image = itemView.findViewById(R.id.album_img_id);
            cardView = itemView.findViewById(R.id.lst_album_id);

        }
    }
}
