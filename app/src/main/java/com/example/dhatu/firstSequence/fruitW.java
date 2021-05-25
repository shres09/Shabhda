package com.example.dhatu.firstSequence;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dhatu.MainActivity;
import com.example.dhatu.R;

public class fruitW extends AppCompatActivity {
    ImageButton fruitsound;
    Button back4;
    MediaPlayer fruitsoundbruh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruitw);

        back4 = (Button) findViewById(R.id.back4);
        back4.setOnClickListener(v -> openquestion());
        fruitsoundbruh = MediaPlayer.create(fruitW.this, R.raw.fruit);
        final MediaPlayer boysoundbruh = MediaPlayer.create(this, R.raw.fruit);


        fruitsound = (ImageButton) findViewById(R.id.fruitsound);
        fruitsound.setOnClickListener(v -> playBoy());
    }

    private void openquestion(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void playBoy(){
        fruitsoundbruh.start();
    }


}

