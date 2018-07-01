package com.example.user.tosnham;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RestuarantAdapter extends RecyclerView.Adapter<RestuarantAdapter.GalleryViewHolder> {

    @NonNull
    @Override
    public GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_reatuarant_activity, parent, false);
        return new GalleryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class GalleryViewHolder extends RecyclerView.ViewHolder {

        public GalleryViewHolder(View itemView) {
            super(itemView);
        }
    }

}

