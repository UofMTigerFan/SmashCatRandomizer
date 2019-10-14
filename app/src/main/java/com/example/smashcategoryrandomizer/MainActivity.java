package com.example.smashcategoryrandomizer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Random rng = new Random();
    private TextView cat;
    private ImageView Left;
    private ImageView Center;
    private ImageView Right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cat = findViewById(R.id.nameCategory);
        Left = findViewById(R.id.imageViewLeft);
        Center = findViewById(R.id.imageViewCenter);
        Right = findViewById(R.id.imageViewRight);

        Button btn = (Button)findViewById(R.id.swapButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomCategory();
            }
        });
    }

    private void randomCategory() {
        int RandomNumber = rng.nextInt(10) + 1;
        switch(RandomNumber) {
            case 1:
                //Swords
                cat.setText("Sword Fighters");
                MediaPlayer fe = MediaPlayer.create(MainActivity.this,R.raw.fetheme);
                fe.start();
                Left.setImageResource(R.drawable.ike);
                Center.setImageResource(R.drawable.hero);
                Right.setImageResource(R.drawable.lucina);

                break;
            case 2:
                //Heavyweights
                cat.setText("Big Bois");
                MediaPlayer evil = MediaPlayer.create(MainActivity.this,R.raw.ganon);
                evil.start();
                Left.setImageResource(R.drawable.bowser);
                Center.setImageResource(R.drawable.ganon);
                Right.setImageResource(R.drawable.king_dedede_03);

                break;
            case 3:
                //Ranged spam
                cat.setText("Ranged Spam");
                MediaPlayer mgs = MediaPlayer.create(MainActivity.this,R.raw.mgs);
                mgs.start();
                Left.setImageResource(R.drawable.yunglink);
                Center.setImageResource(R.drawable.ness);
                Right.setImageResource(R.drawable.snake);

                break;
            case 4:
                //Lightweight
                cat.setText("Lightweights");
                MediaPlayer star = MediaPlayer.create(MainActivity.this,R.raw.starfox);
                star.start();
                Left.setImageResource(R.drawable.ness);
                Center.setImageResource(R.drawable.fox);
                Right.setImageResource(R.drawable.kirby);

                break;
            case 5:
                //Low tiers
                cat.setText("Low Tiers :(");
                MediaPlayer low = MediaPlayer.create(MainActivity.this,R.raw.punchout);
                low.start();
                Left.setImageResource(R.drawable.kirby);
                Center.setImageResource(R.drawable.tmac);
                Right.setImageResource(R.drawable.bowserjr);

                break;
            case 6:
                //High tiers
                cat.setText("High Tiers");
                MediaPlayer persona = MediaPlayer.create(MainActivity.this,R.raw.lastsurprise);
                persona.start();
                Left.setImageResource(R.drawable.joker);
                Center.setImageResource(R.drawable.peach);
                Right.setImageResource(R.drawable.lucina);

                break;
            case 7:
                //Mid tiers
                cat.setText("Mid Tiers");
                MediaPlayer streetfight =MediaPlayer.create(MainActivity.this,R.raw.sftheme);
                streetfight.start();
                Left.setImageResource(R.drawable.robin);
                Center.setImageResource(R.drawable.ryu);
                Right.setImageResource(R.drawable.yunglink);

                break;
            case 8:
                //All rounders
                cat.setText("All-Rounders");
                MediaPlayer mario =MediaPlayer.create(MainActivity.this,R.raw.smb);
                mario.start();
                Left.setImageResource(R.drawable.dpit);
                Center.setImageResource(R.drawable.mario);
                Right.setImageResource(R.drawable.yoshi);

                break;
            case 9:
                //Meme characters
                cat.setText("Meme Characters");
                MediaPlayer mega = MediaPlayer.create(MainActivity.this,R.raw.megalovania);
                mega.start();
                Left.setImageResource(R.drawable.gameandwatch);
                Center.setImageResource(R.drawable.n2tcplon8qk31);
                Right.setImageResource(R.drawable.bowserjr);

                break;
            case 10:
                //Literally why
                cat.setText("Literally why");
                MediaPlayer sanic =MediaPlayer.create(MainActivity.this,R.raw.livelearn);
                sanic.start();
                Left.setImageResource(R.drawable.iceclimbers);
                Center.setImageResource(R.drawable.sonic);
                Right.setImageResource(R.drawable.piranhaplant);

                break;
        }
    }
}
