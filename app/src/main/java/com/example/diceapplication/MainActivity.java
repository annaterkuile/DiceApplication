package com.example.diceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.media.MediaPlayer;
import android.media.AudioManager;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView rollTextDice;
    private ImageView imageViewDice;
    private Random rng = new Random();
    private AudioManager myAudioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollTextDice = findViewById(R.id.roll_Text_Dice);
        imageViewDice = findViewById(R.id.image_view_dice);
        myAudioManager = (AudioManager)getSystemService(MainActivity.AUDIO_SERVICE);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
//                MediaPlayer diceSoundMP = MediaPlayer.create(MainActivity.this, R.raw.dice_roll);
//                myAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC, 20, 0);
//                diceSoundMP.start();
            }
        });
    }

    private void rollDice() {
        int randomNumber = rng.nextInt(20)+1;
        MediaPlayer diceSoundMP = MediaPlayer.create(MainActivity.this, R.raw.dice_roll);
        MediaPlayer missSoundMP = MediaPlayer.create(MainActivity.this, R.raw.miss_roll);
        MediaPlayer hitSoundMP = MediaPlayer.create(MainActivity.this, R.raw.hit_roll);
        myAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC, 20, 0);

        switch(randomNumber) {
            case 1:
                imageViewDice.setImageResource((R.drawable.d20_1));
                missSoundMP.start();
                criticalMiss();
                break;
            case 2:
                imageViewDice.setImageResource((R.drawable.d20_2));
                diceSoundMP.start();
                blank();
                break;
            case 3:
                imageViewDice.setImageResource((R.drawable.d20_3));
                diceSoundMP.start();
                blank();
                break;
            case 4:
                imageViewDice.setImageResource((R.drawable.d20_4));
                diceSoundMP.start();
                blank();
                break;
            case 5:
                imageViewDice.setImageResource((R.drawable.d20_5));
                diceSoundMP.start();
                blank();
                break;
            case 6:
                imageViewDice.setImageResource((R.drawable.d20_6));
                diceSoundMP.start();
                blank();
                break;
            case 7:
                imageViewDice.setImageResource((R.drawable.d20_7));
                diceSoundMP.start();
                blank();
                break;
            case 8:
                imageViewDice.setImageResource((R.drawable.d20_8));
                diceSoundMP.start();
                blank();
                break;
            case 9:
                imageViewDice.setImageResource((R.drawable.d20_9));
                diceSoundMP.start();
                blank();
                break;
            case 10:
                imageViewDice.setImageResource((R.drawable.d20_10));
                diceSoundMP.start();
                blank();
                break;
            case 11:
                imageViewDice.setImageResource((R.drawable.d20_11));
                diceSoundMP.start();
                blank();
                break;
            case 12:
                imageViewDice.setImageResource((R.drawable.d20_12));
                diceSoundMP.start();
                blank();
                break;
            case 13:
                imageViewDice.setImageResource((R.drawable.d20_13));
                diceSoundMP.start();
                blank();
                break;
            case 14:
                imageViewDice.setImageResource((R.drawable.d20_14));
                diceSoundMP.start();
                blank();
                break;
            case 15:
                imageViewDice.setImageResource((R.drawable.d20_15));
                diceSoundMP.start();
                blank();
                break;
            case 16:
                imageViewDice.setImageResource((R.drawable.d20_16));
                diceSoundMP.start();
                blank();
                break;
            case 17:
                imageViewDice.setImageResource((R.drawable.d20_17));
                diceSoundMP.start();
                blank();
                break;
            case 18:
                imageViewDice.setImageResource((R.drawable.d20_18));
                diceSoundMP.start();
                blank();
                break;
            case 19:
                imageViewDice.setImageResource((R.drawable.d20_19));
                diceSoundMP.start();
                blank();
                break;
            case 20:
                imageViewDice.setImageResource((R.drawable.d20_20));
                hitSoundMP.start();
                criticalHit();
                break;
        }
    }

    private void criticalHit() {
        rollTextDice.setText( "Critical Hit!" );
        rollTextDice.setTextColor(getResources().getColor(R.color.Red));

    }

    private void criticalMiss() {
        rollTextDice.setText( "Critical Miss!" );
        rollTextDice.setTextColor(getResources().getColor(R.color.Red));

    }

    private void blank() {
        rollTextDice.setText( " " );
    }

}
