package com.click_labs.kashishnalwa.schooappproject;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.click_labs.kashishnalwa.schooappproject.R;

public class ViewPagerFragment1 extends Fragment {
    int id;
    ImageView imageView;
    public ViewPagerFragment1(int id){
this.id=id;
    }

    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View rootView=inflater.inflate(R.layout.activity_view_pager_fragment1,container,false);
        imageView=(ImageView) rootView.findViewById(R.id.view_pager);
        imageView.setImageResource(id);
        return rootView;
    }

}