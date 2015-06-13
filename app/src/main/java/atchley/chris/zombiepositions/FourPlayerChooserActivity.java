package atchley.chris.zombiepositions;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;


public class FourPlayerChooserActivity extends ActionBarActivity {

    private Button mChrisButton;
    private Button mBrianButton;
    private Button mMikeButton;
    private Button mTwomeyButton;
    private Button mDirtButton;
    private Button mPatRiceButton;
    ArrayList<String> players= new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_player_chooser);

        
        mMikeButton = (Button) findViewById(R.id.mikeButton);
        mChrisButton = (Button) findViewById(R.id.chrisButton);
        mBrianButton = (Button) findViewById(R.id.brianButton);
        mDirtButton = (Button) findViewById(R.id.dirtButton);
        mPatRiceButton = (Button) findViewById(R.id.patRiceButton);
        mTwomeyButton = (Button) findViewById(R.id.twomeyButton);



        mChrisButton.setOnClickListener(new View.OnClickListener() {
            String name = getString(R.string.chris_name);


            @Override
            public void onClick(View v) {
                playSound();
                addName(name, players, mChrisButton);
                }
        });


        mMikeButton.setOnClickListener(new View.OnClickListener() {
            String name = getString(R.string.mikes_name);

            @Override
            public void onClick(View v) {
                playSound();
                  addName(name, players, mMikeButton);
                }
        });


        mBrianButton.setOnClickListener(new View.OnClickListener() {
            String name = getString(R.string.brians_name);

            @Override
            public void onClick(View v) {
                playSound();
                addName(name, players, mBrianButton);
            }
        });


        mDirtButton.setOnClickListener(new View.OnClickListener() {
            String name = getString(R.string.dirts_name);

            @Override
            public void onClick(View v) {
                playSound();
                addName(name, players, mDirtButton);
            }
        });


        mPatRiceButton.setOnClickListener(new View.OnClickListener() {
            String name = getString(R.string.pat_rice_name);

            @Override
            public void onClick(View v) {
                playSound();
                addName(name, players, mPatRiceButton);
            }
        });


        mTwomeyButton.setOnClickListener(new View.OnClickListener() {
            String name = getString(R.string.twomeys_name);

            @Override
            public void onClick(View v) {
                playSound();
                addName(name, players, mTwomeyButton);
            }
        });


        Button randButton = (Button) findViewById(R.id.doneChoosingButton);
        randButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (players.size() < 1) {

                    Toast.makeText(FourPlayerChooserActivity.this, getString(R.string.chooseMoreText), Toast.LENGTH_LONG).show();
               } else {


                    Intent intent = new Intent(FourPlayerChooserActivity.this, FourPlayerActivity.class);
                    intent.putStringArrayListExtra("array", players);

                    startActivity(intent);


                }
            }


        });







    }


    public void addName(String name, ArrayList arrayList, Button button){
        if (arrayList.contains(name)){
            arrayList.remove(name);
            Toast.makeText(FourPlayerChooserActivity.this,name +" removed!", Toast.LENGTH_LONG).show();
            button.setBackgroundColor(Color.parseColor("#8ffff920"));
            button.setText("Add " + name);

        }else{
            arrayList.add(name);
            Toast.makeText(FourPlayerChooserActivity.this,name +getString(R.string.addedText), Toast.LENGTH_LONG).show();
            button.setBackgroundColor(Color.parseColor("#8eff2929"));
            button.setText(name + getString((R.string.addedText)));

        }

    }

    private void playSound(){
        MediaPlayer player = MediaPlayer.create(this,R.raw.coin);
        player.start();
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });

    }





}







