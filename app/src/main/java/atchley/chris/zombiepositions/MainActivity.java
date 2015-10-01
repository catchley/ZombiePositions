package atchley.chris.zombiepositions;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;


public class MainActivity extends ActionBarActivity {
    protected Button mFourPlayerButton;
    protected Button mSixPlayerButton;
    InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFourPlayerButton = (Button) findViewById(R.id.fourPlayerButton);
        mSixPlayerButton = (Button) findViewById(R.id.sixPlayerButton);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-1576273189830832/9269882302");
        requestNewInterstitial();


        //Button click opens 4 player Chooser activity
        mFourPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Intent intent = new Intent(MainActivity.this, FourPlayerChooserActivity.class);
                    startActivity(intent);
                }

                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        requestNewInterstitial();
                        Intent intent = new Intent(MainActivity.this, FourPlayerChooserActivity.class);
                        startActivity(intent);
                    }
                });
            }
        }

        );



        //Button click opens 6 player activity
        mSixPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Intent intent = new Intent(MainActivity.this, SixPlayerActivity.class);
                    startActivity(intent);
                }
                mInterstitialAd.setAdListener(new AdListener() {
                    @Override
                    public void onAdClosed() {
                        requestNewInterstitial();
                        Intent intent = new Intent(MainActivity.this, SixPlayerActivity.class);
                        startActivity(intent);
                    }
                });
            }

        });



    }
    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("YOUR_DEVICE_HASH")
                .build();

        mInterstitialAd.loadAd(adRequest);
    }



}
