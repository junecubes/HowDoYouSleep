package com.app.howdoyousleep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.StartAppSDK;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StartAppSDK.init(this, "206295897", true);
    }

    public void onBackPressed() {
        StartAppAd.onBackPressed(this);
        super.onBackPressed();
    }
}
