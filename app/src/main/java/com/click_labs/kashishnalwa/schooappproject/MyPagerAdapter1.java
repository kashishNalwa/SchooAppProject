package com.click_labs.kashishnalwa.schooappproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by kashish nalwa on 31-01-2016.
 */
public class MyPagerAdapter1 extends FragmentStatePagerAdapter {
    int id;
    Fragment frag;

    public MyPagerAdapter1(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                id= R.drawable.school_1;
                frag=new ViewPagerFragment1(id);
                break;
            case 1:
                id=R.drawable.school_2;
                frag=new ViewPagerFragment1(id);
                break;
            case 2:
                id=R.drawable.school_3;
                frag=new ViewPagerFragment1(id);
                break;
            case 3:
                id=R.drawable.school_4;
                frag=new ViewPagerFragment1(id);
                break;
            case 4:
                id=R.drawable.school_5;
                frag=new ViewPagerFragment1(id);
                break;


        }

        return frag;
    }

    @Override
    public int getCount() {
        return 5;
    }
}