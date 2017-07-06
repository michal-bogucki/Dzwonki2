package com.michal.dzwonki.Dagger.Module;

import com.michal.dzwonki.Presenter.PresenterMainActivity;
import com.michal.dzwonki.Presenter.PresenterMusicCard;
import com.michal.dzwonki.View.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by michal on 28.06.17.
 */
@Module
public class PresenterModule {


    @Provides
    public PresenterMainActivity presenterMainActivity() {
        return new PresenterMainActivity();
    }

    @Provides
    public PresenterMusicCard presenterMusicCard() {
        return new PresenterMusicCard();
    }
}
