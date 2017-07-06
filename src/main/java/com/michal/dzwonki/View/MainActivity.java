package com.michal.dzwonki.View;

import android.media.Ringtone;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.michal.dzwonki.Adapter.RingtonesAdapter;
import com.michal.dzwonki.App;
import com.michal.dzwonki.Presenter.PresenterMainActivity;
import com.michal.dzwonki.R;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements InterfaceMainActivity {
    private static final String TAG = "MainActivity";
    @Inject
    PresenterMainActivity mPresenterMainActivity;
    @BindView(R.id.RingtonesList)
    RecyclerView RingtonesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ((App) getApplication()).getAppComponent().inject(this);
        mPresenterMainActivity.setMainActivity(this);
        getAllMusic();


    }

    @Override
    public void getAllMusic() {
    mPresenterMainActivity.getAllMusic(this);
    }


    @Override
    public void showAllMusic(List<Ringtone> ringtones) {
        RingtonesList.setHasFixedSize(true);
        RingtonesList.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        RingtonesList.setAdapter(new RingtonesAdapter(ringtones,this));
    }
}
