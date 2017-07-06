package com.michal.dzwonki.Presenter;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

import com.michal.dzwonki.View.MainActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michal on 28.06.17.
 */

public class PresenterMainActivity implements InterfacePresenterMainActivity {


    private static final String TAG = " uri ";
    private  MainActivity view;


    @Override
    public void setMainActivity(MainActivity mainActivity) {
        view = mainActivity;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void getAllMusic(Context context) {
        List<Ringtone> ringtones = new ArrayList<>();
        RingtoneManager manager = new RingtoneManager(context);

        manager.setType(RingtoneManager.TYPE_ALL);
        int n = manager.getCursor().getCount();
        for (int i = 0;i<n;i++){

            Ringtone currentRingtone = RingtoneManager.getRingtone(view, manager.getRingtoneUri(i));
            Log.d(TAG, manager.getRingtoneUri(i)+ " "+currentRingtone.getAudioAttributes().toString() );
            //ringtones.add(currentRingtone.);
        }

        view.showAllMusic(ringtones);
    }

    @Override
    public void showAllMusic() {

    }
}
