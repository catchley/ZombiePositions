package atchley.chris.zombiepositions;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
    protected Button mFourPlayerButton;
    protected Button mSixPlayerButton;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFourPlayerButton = (Button)findViewById(R.id.fourPlayerButton);
        mSixPlayerButton = (Button)findViewById(R.id.sixPlayerButton);


        //Button click opens 4 player Chooser activity
        mFourPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent intent = new Intent(MainActivity.this,FourPlayerChooserActivity.class);
                startActivity(intent);
            }
        });


        //Button click opens 6 player activity
        mSixPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SixPlayerActivity.class);
                startActivity(intent);
            }
        });


    }


   }
