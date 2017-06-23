package com.example.android.shushme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by prof.BOLA on 6/22/2017.
 */

public class GeofenceBroadcasstReceiver extends BroadcastReceiver {

    public static final String TAG = GeofenceBroadcasstReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive ");
    }
}
