package com.michal.dzwonki;

import android.app.Application;

import com.michal.dzwonki.Dagger.Component.AppComponent;
import com.michal.dzwonki.Dagger.Component.DaggerAppComponent;
import com.michal.dzwonki.Dagger.Module.AppModule;

/**
 * Created by michal on 28.06.17.
 */

public class App extends Application {
    AppComponent mAppComponent;

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))

                .build();
    }


}
