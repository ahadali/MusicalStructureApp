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

public class SongAdapter extends ArrayAdapter<Songs> {

    SongAdapter(Context context, ArrayList<Songs> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_songs, parent, false);
        }


        Songs currentSong = getItem(position);

        TextView songTextView = listItemView.findViewById(R.id.song_title_id);

        if (currentSong != null) {
            songTextView.setText(currentSong.getSongName());
        }

        TextView artistTextView = listItemView.findViewById(R.id.song_artist_id);
        if (currentSong != null) {
            artistTextView.setText(currentSong.getArtistName());
        }


        ImageView songThumbnail = listItemView.findViewById(R.id.song_thumbnail_id);

        if (currentSong != null) {
            songThumbnail.setImageResource(currentSong.getImageResourceId());
        }

        TextView songDuration = listItemView.findViewById(R.id.song_duration_id);
        if (currentSong != null) {
            songDuration.setText(currentSong.getSongDuration());
        }


        return listItemView;
    }
}
