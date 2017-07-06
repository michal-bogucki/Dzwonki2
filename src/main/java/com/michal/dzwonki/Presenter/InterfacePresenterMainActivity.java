package com.michal.dzwonki.Presenter;

import android.content.Context;

import com.michal.dzwonki.View.MainActivity;

/**
 * Created by michal on 28.06.17.
 */

public interface InterfacePresenterMainActivity {
    public void setMainActivity(MainActivity mainActivity);
    public void getAllMusic(Context context);
    public void showAllMusic();



}
