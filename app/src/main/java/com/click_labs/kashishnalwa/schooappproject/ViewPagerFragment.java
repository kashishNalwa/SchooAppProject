package com.click_labs.kashishnalwa.schooappproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ViewPagerFragment extends Fragment {
    RecyclerView recyclerView;
    VivzAdapter adapter;
    ClassInformation classInformation;

    ViewPagerFragment(ClassInformation classInformation) {

        this.classInformation = classInformation;
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_view_pager_fragment, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler);

        adapter = new VivzAdapter(getContext(), classInformation.stuArray);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return rootView;
    }


}