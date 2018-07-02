package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class TrendingFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_trending, container, false);

        final ArrayList<Trending> trends = new ArrayList<>();

        trends.add(new Trending(getString(R.string.theMiddle), getString(R.string.zedd), R.drawable.zedd, "1", "Last Week: 1"));
        trends.add(new Trending(getString(R.string.NeverBeTheSame), getString(R.string.CamilaCabello), R.drawable.camilacabelo, "2", "Last Week: 2"));
        trends.add(new Trending(getString(R.string.NiceForWhat), getString(R.string.Drake), R.drawable.drake, "3", "Last Week: 3"));
        trends.add(new Trending(getString(R.string.GodsPlan), getString(R.string.Drake), R.drawable.drake, "4", "Last Week: 6"));
        trends.add(new Trending(getString(R.string.meantToBe), getString(R.string.bebeRexha), R.drawable.beberexha, "5", "Last Week: 4"));
        trends.add(new Trending(getString(R.string.NoTearsLeftToCry), getString(R.string.arianaGrande), R.drawable.arianagrande, "6", "Last Week: 5"));
        trends.add(new Trending(getString(R.string.InMyBlood), getString(R.string.shawnMendes), R.drawable.shawnmendes, "7", "Last Week: 9"));
        trends.add(new Trending(getString(R.string.Delicate), getString(R.string.taylorSwift), R.drawable.taylorswift, "8", "Last Week: 8"));
        trends.add(new Trending(getString(R.string.Mine), getString(R.string.bazzi), R.drawable.bazzi, "9", "Last Week: 9"));
        trends.add(new Trending(getString(R.string.WhateverItTakes), getString(R.string.imagineDragons), R.drawable.imaginedragons, "10", "Last Week: 8"));

        TrendingAdapter adapter = new TrendingAdapter(getActivity(), trends);

        ListView trendListView = rootView.findViewById(R.id.list_trending);

        trendListView.setAdapter(adapter);

        return rootView;
    }
}
