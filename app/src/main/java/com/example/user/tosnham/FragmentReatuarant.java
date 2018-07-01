package com.example.user.tosnham;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentReatuarant extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_restuarant, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rclGallery = view.findViewById(R.id.restaurant_recyclerview);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(), 1);
        rclGallery.setLayoutManager(layoutManager);

        RestuarantAdapter adapter = new RestuarantAdapter();
        rclGallery.setAdapter(adapter);
    }

}
