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


public class AlbumFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_albums, container, false);

        List<Album> listAlbum = new ArrayList<>();
        listAlbum.add(new Album(getString(R.string.Avicii), R.drawable.aviciialbum));
        listAlbum.add(new Album(getString(R.string.TheChainsmokers), R.drawable.chainsmokersalbum));
        listAlbum.add(new Album(getString(R.string.TigerZindaHai), R.drawable.tigerzindahaialbum));
        listAlbum.add(new Album(getString(R.string.twoStates), R.drawable.twostatesalbum));
        listAlbum.add(new Album(getString(R.string.Despacito), R.drawable.despacitoalbum));
        listAlbum.add(new Album(getString(R.string.BaaghiTwo), R.drawable.baaghi2album));
        listAlbum.add(new Album(getString(R.string.DJSnake), R.drawable.djsnakealbum));
        listAlbum.add(new Album(getString(R.string.LinkinPark), R.drawable.linkinparkalbum));
        listAlbum.add(new Album(getString(R.string.OneDirection), R.drawable.onedirectionalbum));
        listAlbum.add(new Album(getString(R.string.OwlCity), R.drawable.owlcityalbum));

        RecyclerView albumRV = rootView.findViewById(R.id.recyclerview_id);
        AlbumAdapter adapter = new AlbumAdapter(getActivity(), listAlbum);
        albumRV.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        albumRV.setAdapter(adapter);


        return rootView;

    }
}
