package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;
import java.util.List;

public class GenreFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_genre, container, false);

        List<Genre> genreList = new ArrayList<>();
        genreList.add(new Genre(R.drawable.acoustic, getString(R.string.Acoustic)));
        genreList.add(new Genre(R.drawable.edm, getString(R.string.EDM)));
        genreList.add(new Genre(R.drawable.indianclassical, getString(R.string.IndianClassical)));
        genreList.add(new Genre(R.drawable.party, getString(R.string.Party)));
        genreList.add(new Genre(R.drawable.romance, getString(R.string.Romantic)));
        genreList.add(new Genre(R.drawable.pop, getString(R.string.Pop)));

        RecyclerView genreRV = rootView.findViewById(R.id.genre_recyclerview_id);
        GenreAdapter adapter = new GenreAdapter(getActivity(), genreList);
        genreRV.setLayoutManager(new GridLayoutManager(getActivity(), 1));
        genreRV.setAdapter(adapter);

        return rootView;

    }
}
