package atchley.chris.zombiepositions;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SixPlayerActivity extends ActionBarActivity {
    protected Button mPositionRandomButton;

    private TextView mTextView1, mTextView2,mTextView3,mTextView4,mTextView5,mTextView6;
    private randomizePositions mPositions = new randomizePositions();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six_player);
        mTextView1 = (TextView)findViewById(R.id.textView1);
        mTextView2 = (TextView)findViewById(R.id.textView2);
        mTextView3 = (TextView)findViewById(R.id.textView3);
        mTextView4 = (TextView)findViewById(R.id.textView4);
        mTextView5 = (TextView)findViewById(R.id.textView5);
        mTextView6 = (TextView)findViewById(R.id.textView6);

        mPositionRandomButton = (Button)findViewById(R.id.positionRandomButton);

        mPositionRandomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] position = mPositions.getPosition();
                mTextView1.setText(position[0]);
                mTextView2.setText(position[1]);
                mTextView3.setText(position[2]);
                mTextView4.setText(position[3]);
                mTextView5.setText(position[4]);
                mTextView6.setText(position[5]);


            }
        });




    }




}
