package com.michal.dzwonki.Dagger.Component;

import com.michal.dzwonki.Dagger.Module.AppModule;
import com.michal.dzwonki.Dagger.Module.PresenterModule;
import com.michal.dzwonki.View.MainActivity;
import com.michal.dzwonki.View.MusicCard;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by michal on 28.06.17.
 */
@Singleton
@Component(modules = {AppModule.class, PresenterModule.class})
public interface AppComponent {

    void inject(MainActivity activity);
    void inject(MusicCard musicCard);

}
