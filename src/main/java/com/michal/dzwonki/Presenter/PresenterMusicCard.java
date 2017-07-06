package com.michal.dzwonki.Presenter;

import com.michal.dzwonki.View.MusicCard;

/**
 * Created by michal on 28.06.17.
 */

public class PresenterMusicCard implements InterfacePresenterMusicCard {
    private MusicCard view;

    @Override
    public void getMusic() {

    }

    @Override
    public void setMusicCard(MusicCard musicCard) {
        this.view = musicCard;
    }
}
