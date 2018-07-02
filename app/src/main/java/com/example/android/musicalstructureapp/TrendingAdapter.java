package com.example.android.musicalstructureapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class TrendingAdapter extends ArrayAdapter<Trending> {
    TrendingAdapter(@NonNull Context context, ArrayList<Trending> trends) {
        super(context, 0, trends);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_trending, parent, false);
        }


        Trending currentTrendingSong = getItem(position);

        TextView songTextView = listItemView.findViewById(R.id.song_name_id);

        if (currentTrendingSong != null) {
            songTextView.setText(currentTrendingSong.getTrendingSongName());
        }

        TextView artistTextView = listItemView.findViewById(R.id.artist_id);
        if (currentTrendingSong != null) {
            artistTextView.setText(currentTrendingSong.getTrendingArtistName());
        }


        ImageView songThumbnail = listItemView.findViewById(R.id.thumbnail_id);

        if (currentTrendingSong != null) {
            songThumbnail.setImageResource(currentTrendingSong.getImageResourceId());
        }

        TextView songRating = listItemView.findViewById(R.id.rating_id);
        if (currentTrendingSong != null) {
            songRating.setText(currentTrendingSong.getRating());
        }

        TextView lastWeekRating = listItemView.findViewById(R.id.last_week_rating);
        if (currentTrendingSong != null) {
            lastWeekRating.setText(currentTrendingSong.getLastWeekRating());
        }

        return listItemView;
    }
}
