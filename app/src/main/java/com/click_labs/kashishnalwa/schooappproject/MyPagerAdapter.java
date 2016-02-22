package com.click_labs.kashishnalwa.schooappproject;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kashish nalwa on 30-01-2016.
 */
public class MyPagerAdapter extends FragmentStatePagerAdapter {
    Fragment frag;
    Context context;
   // List<StudentInformation> data = new ArrayList<>(15);
  //  final String[] classNames = {"1st Class", "2nd Class", "3rd Class", "4th Class", "5th Class"};
    int[] givenNoOfStudents;
    int noOfStudents;
    int classNumber;
    List<ClassInformation> toPassData = new ArrayList<>();

    public MyPagerAdapter(FragmentManager fm, Context context, List<ClassInformation> data) {
        super(fm);
        this.context = context;
        this.toPassData = data;
        this.givenNoOfStudents = givenNoOfStudents;
    }

    @Override
    public Fragment getItem(int position) {

       return new ViewPagerFragment(toPassData.get(position));


    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return toPassData.get(position).whichClass;
    }


}
