package atchley.chris.zombiepositions;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class FourPlayerActivity extends ActionBarActivity {
    private ArrayList<String> mArray = new ArrayList<String>();
    private randomizePositions mRandomizePlayers = new randomizePositions();
    private Button mRandPlayersButton;
    private TextView mStairsTextView;
    private TextView mWindowTextView;
    private TextView mRoverTextView;
    private TextView mBalconyTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_player);
        mRandPlayersButton = (Button)findViewById(R.id.playerRandButton);
        mStairsTextView = (TextView)findViewById(R.id.stairsTextView);
        mWindowTextView = (TextView)findViewById(R.id.windowTextView);
        mRoverTextView = (TextView)findViewById(R.id.roverTextView);
        mBalconyTextView = (TextView)findViewById(R.id.balconyTextView);


        mArray = getIntent().getExtras().getStringArrayList("array");

        mRandPlayersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mArray.size()==1){
                    String[] players = mRandomizePlayers.getNameOnePlayer(mArray);
                    mStairsTextView.setText("");
                    mWindowTextView.setText("");
                    mRoverTextView.setText(players[0]);
                    mBalconyTextView.setText("");
                }
                else if(mArray.size()==2){
                    String[] players = mRandomizePlayers.getNameTwoPlayer(mArray);
                    mStairsTextView.setText(players[0]);
                    mWindowTextView.setText("");
                    mRoverTextView.setText("");
                    mBalconyTextView.setText(players[1]);
                }
                else if(mArray.size()==3){
                    String[] players = mRandomizePlayers.getNameThreePlayer(mArray);
                    mStairsTextView.setText(players[0]);
                    mWindowTextView.setText("");
                    mRoverTextView.setText(players[2]);
                    mBalconyTextView.setText(players[1]);
                }
                else if(mArray.size()>3){
                    String[] players = mRandomizePlayers.getName(mArray);
                    mStairsTextView.setText(players[0]);
                    mWindowTextView.setText(players[1]);
                    mRoverTextView.setText(players[2]);
                    mBalconyTextView.setText(players[3]);

                }

                //Toast.makeText(FourPlayerActivity.this, players[0]+ players[1]+ players[2]+ players[3], Toast.LENGTH_LONG).show();
            }
        });

    }

}
