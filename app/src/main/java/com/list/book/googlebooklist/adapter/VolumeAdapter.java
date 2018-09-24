package com.list.book.googlebooklist.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.list.book.googlebooklist.R;
import com.list.book.googlebooklist.data.types.volume.Volume;

import java.util.List;

public class VolumeAdapter extends RecyclerView.Adapter<VolumeAdapter.ViewHolder> {

    private Context mContext;
    private List<Volume> mVolumeList;
    private LayoutInflater mLayoutInflater;

    public VolumeAdapter(Context mContext, List<Volume> mVolumeList) {
        this.mContext = mContext;
        this.mVolumeList = mVolumeList;
        this.mLayoutInflater = LayoutInflater.from(this.mContext);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        return new ViewHolder(this.mLayoutInflater
                .inflate(R.layout.single_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        final Volume volume = this.mVolumeList.get(i);
        if (volume != null && volume.getVolumeInfo() != null) {
            viewHolder.title.setText(volume.getVolumeInfo().getTitle());
            viewHolder.subTitle.setText(volume.getVolumeInfo().getSubtitle());
            viewHolder.author.setText(""+i);

        }
    }

    @Override
    public int getItemCount() {
        return this.mVolumeList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageUrl;
        TextView title;
        TextView subTitle;
        TextView author;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageUrl = itemView.findViewById(R.id.book_image);
            title = itemView.findViewById(R.id.title);
            subTitle = itemView.findViewById(R.id.sub_title);
            author = itemView.findViewById(R.id.author);
        }
    }
}
