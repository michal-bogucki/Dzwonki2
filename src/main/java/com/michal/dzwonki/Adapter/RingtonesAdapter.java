package com.michal.dzwonki.Adapter;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.michal.dzwonki.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by michal on 29.06.17.
 */

public class RingtonesAdapter extends RecyclerView.Adapter<RingtonesAdapter.MyViewHolder> {
    private List<Ringtone> mRingtonesList = new ArrayList<>();
    Context context;

    public RingtonesAdapter(List<Ringtone> mRingtonesList, Context context) {
        this.mRingtonesList = mRingtonesList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ringtone_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Ringtone ringtone = mRingtonesList.get(position);
        (holder).RingtoneName.setText(ringtone.getTitle(context));
        holder.itemView.setTag(ringtone);
    }

    @Override
    public int getItemCount() {
        return mRingtonesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.RingtoneName)
        TextView RingtoneName;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
            itemView.setTag(this);

        }

        @Override
        public void onClick(View v) {

           Ringtone r = ((Ringtone)(v.getTag()));
            String uri = "content://media/internal/audio/media/";
            Uri uri_ = Uri.parse(uri+r.getStreamType());
            RingtoneManager.setActualDefaultRingtoneUri(context,RingtoneManager.TYPE_RINGTONE,uri_);
            if(r.isPlaying()){
                r.stop();
            } else {
                r.play();
            }

        }
    }
}
