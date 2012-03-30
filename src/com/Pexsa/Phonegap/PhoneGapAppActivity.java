package com.Pexsa.Phonegap;

import com.phonegap.DroidGap;

import android.os.Bundle;

public class PhoneGapAppActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}