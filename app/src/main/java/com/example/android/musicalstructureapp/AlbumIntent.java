package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AlbumIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_intent);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView album_title = findViewById(R.id.album_title);
        ImageView album_thumbnail = findViewById(R.id.albumThumbnail);
        Button play_button = findViewById(R.id.album_play_button);


        Intent intent = getIntent();
        String title = intent.getExtras().getString("Title");
        int thumbnail = intent.getExtras().getInt("Thumbnail");

        play_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AlbumIntent.this, "You played the album",
                        Toast.LENGTH_LONG).show();
            }
        });

        album_title.setText(title);
        album_thumbnail.setImageResource(thumbnail);

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
