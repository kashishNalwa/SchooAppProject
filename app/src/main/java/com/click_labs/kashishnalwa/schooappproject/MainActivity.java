package com.click_labs.kashishnalwa.schooappproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends BaseActivity {
    ViewPager pager;
    MyPagerAdapter1 adapter;
    ImageButton rightBtn;
    ImageButton leftBtn;


    // currentPagerPosition tells the current pager in the ViewPager
    int currentPagerPosition;
    TextView appBarTv;
    ImageView appBarIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        //pagerListenerInitialisation method to add OnPageChangeListener
        pagerListenerInitialisation();
        //buttonListenerInitialisation method to set OnClickListener
        buttonListenerInitialisation();


    }

    private void buttonListenerInitialisation() {
        leftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(--currentPagerPosition, true);

            }
        });
        rightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(++currentPagerPosition, true);

            }
        });
    }

    private void pagerListenerInitialisation() {
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                currentPagerPosition = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initialize() {
        pager = (ViewPager) findViewById(R.id.view_pager);
        adapter = new MyPagerAdapter1(getSupportFragmentManager());
        pager.setAdapter(adapter);
        rightBtn = (ImageButton) findViewById(R.id.right_imbtn);
        leftBtn = (ImageButton) findViewById(R.id.left_imbtn);
        appBarTv=(TextView) findViewById(R.id.app_bar_text_view);
        appBarIv=(ImageView) findViewById(R.id.app_bar_image_view);
        appBarIv.setImageResource(R.drawable.school_logo);

        appBarTv.setText("Delhi Public School");
    }

    public void goToLoginPage(View view){
        Intent intent=new Intent(this,LoginPage.class);
        startActivity(intent);
        finish();
    }
}
