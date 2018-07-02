package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class SongFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_songs, container, false);

        final ArrayList<Songs> songs = new ArrayList<>();

        songs.add(new Songs(getString(R.string.wakemeup), getString(R.string.Avicii), R.drawable.aviciiwakemeup, "4.09"));
        songs.add(new Songs(getString(R.string.rapgod), getString(R.string.eminem), R.drawable.eminemrapgod, "6.04"));
        songs.add(new Songs(getString(R.string.dilChori), getString(R.string.yoyoHoneySingh), R.drawable.dilchori, "4.00"));
        songs.add(new Songs(getString(R.string.closer), getString(R.string.TheChainsmokers), R.drawable.thechainsmokerscloser, "4.06"));
        songs.add(new Songs(getString(R.string.bassRani), getString(R.string.nucleya), R.drawable.nucleyabassrani, "3.33"));
        songs.add(new Songs(getString(R.string.shapeOfYou), getString(R.string.edSheeran), R.drawable.shapeofyou, "3.54"));
        songs.add(new Songs(getString(R.string.perfect), getString(R.string.edSheeran), R.drawable.perfetcedsheeran, "4.46"));
        songs.add(new Songs(getString(R.string.numb), getString(R.string.LinkinPark), R.drawable.linkinparknumb, "5.21"));
        songs.add(new Songs(getString(R.string.dilDiyanGallan), getString(R.string.atifAslam), R.drawable.dildiyangallan, "4.20"));
        songs.add(new Songs(getString(R.string.lahore), getString(R.string.guruRandhava), R.drawable.gurulahore, "3.17"));
        songs.add(new Songs(getString(R.string.mama), getString(R.string.jonasBlue), R.drawable.jonasbluemama, "3.39"));
        songs.add(new Songs(getString(R.string.sorry), getString(R.string.justinBieber), R.drawable.sorry, "5.02"));

        SongAdapter adapter = new SongAdapter(getActivity(), songs);

        ListView songListView = rootView.findViewById(R.id.list);

        songListView.setAdapter(adapter);

        songListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent songIntent = new Intent(getActivity(), SongIntent.class);
                songIntent.putExtra("smallThumbnail", songs.get(position).getImageResourceId());
                songIntent.putExtra("Thumbnail", songs.get(position).getImageResourceId());
                songIntent.putExtra("songName", songs.get(position).getSongName());
                songIntent.putExtra("artistName", songs.get(position).getArtistName());
                getActivity().startActivity(songIntent);
            }
        });

        return rootView;


    }
}
