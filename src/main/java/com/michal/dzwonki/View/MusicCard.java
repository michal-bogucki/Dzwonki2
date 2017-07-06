package com.michal.dzwonki.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.michal.dzwonki.App;
import com.michal.dzwonki.Presenter.PresenterMusicCard;
import com.michal.dzwonki.R;

import javax.inject.Inject;

public class MusicCard extends AppCompatActivity implements InterfaceMusicCard {

    private static final String TAG = "MusicCard";
    @Inject
    PresenterMusicCard mPresenterMusicCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_card);
        ((App) getApplication()).getAppComponent().inject(this);
        mPresenterMusicCard.setMusicCard(this);
        getMusic();
    }

    @Override
    public void getMusic() {

    }

    @Override
    public void showMusic() {

    }
}
