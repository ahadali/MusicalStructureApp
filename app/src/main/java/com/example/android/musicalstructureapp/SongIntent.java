package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class SongIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_intent);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView smallThumbnail = findViewById(R.id.small_thumbnail);
        ImageView thumbnail = findViewById(R.id.song_thumbnail);
        TextView songName = findViewById(R.id.song_name);
        TextView artistName = findViewById(R.id.artist_name);

        Intent intent = getIntent();
        int smthmbnail = intent.getExtras().getInt("smallThumbnail");
        int thmbnail = intent.getExtras().getInt("Thumbnail");
        String sngName = intent.getExtras().getString("songName");
        String artstName = intent.getExtras().getString("artistName");

        smallThumbnail.setImageResource(smthmbnail);
        thumbnail.setImageResource(thmbnail);
        songName.setText(sngName);
        artistName.setText(artstName);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

}
