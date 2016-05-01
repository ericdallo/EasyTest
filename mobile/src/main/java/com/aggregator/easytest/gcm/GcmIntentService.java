package com.aggregator.easytest.gcm;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;

import com.aggregator.easytest.R;
import com.google.android.gms.gcm.GcmListenerService;

public class GcmIntentService extends GcmListenerService {

    @Override
    public void onMessageReceived(String from, Bundle data) {
        String message = data.getString("message");
        NotificationManager notificationManager= (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.cast_ic_notification_on)
                .setContentTitle("Test")
                .setContentText(message);
        notificationManager.notify(1, mBuilder.build());
    }
}
