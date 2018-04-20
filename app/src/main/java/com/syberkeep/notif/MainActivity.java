package com.syberkeep.notif;

import android.app.Notification;
import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init() {
        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Notification.Builder builder = new Notification.Builder(MainActivity.this);
//                builder.setSmallIcon(R.mipmap.ic_launcher)
//                        .setPriority(Notification.PRIORITY_HIGH)
//                        .setOngoing(true);
//                builder.setLights(0xff00ff00, 300, 100);
//                NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//                if (manager != null) {
//                    manager.notify(1, builder.build());
//                }
                Log.e("TAG", "Message");
            }
        });
    }
}
