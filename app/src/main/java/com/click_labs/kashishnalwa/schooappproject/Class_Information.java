package com.click_labs.kashishnalwa.schooappproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Class_Information extends BaseActivity {
    ViewPager viewPager;
    MyPagerAdapter adapter;
    TabLayout tabLayout;
    TextView appBarTv;
    ImageView appBarIv;
    ImageView appBarIbtn;


    int[] givenImage = {R.drawable.photo1, R.drawable.photo2, R.drawable.photo1,
            R.drawable.photo2, R.drawable.photo1, R.drawable.photo2,
            R.drawable.photo1, R.drawable.photo2, R.drawable.photo1, R.drawable.photo2,
            R.drawable.photo1, R.drawable.photo2, R.drawable.photo1
            , R.drawable.photo2, R.drawable.photo1};
    String[] givenNames = {"Kashish Nalwa", "Gurpreet Singh", "Karan Singla", "Umpreet Singh", "Rahul Sharma",
            "Atul Sharma", "Randeep Singh", "Venkateshwar ", "Kishor Kumar", "Jagroop Singh",
            "Parminder Singh", "Ashutosh Gupta", "Devashish", "Nitin Sharma", "Moid Hassan"};
    String[] givenRollNo = {"UE128040", "UE128041", "UE128042", "UE128043", "UE128044", "UE128045", "UE128046",
            "UE128047", "UE128048", "UE128049", "UE128050", "UE128051", "UE128052", "UE128053", "UE128054"};
    int[] givenNoOfStudents = {10, 8, 15, 7, 3};
    String[] givenClassNames={"1st class","2nd class","3rd class","4th class","5th class"};
    ArrayList<ClassInformation> data = new ArrayList<ClassInformation>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class__information);
        addDataToPass();
        intialize();
        viewPager = (ViewPager) findViewById(R.id.pager);
        adapter = new MyPagerAdapter(getSupportFragmentManager(), Class_Information.this, data);
        viewPager.setAdapter(adapter);
        tabLayout = (TabLayout) findViewById(R.id.sliding_tab);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void addDataToPass() {

        for(int n=0;n<givenNoOfStudents.length;n++) {

            ArrayList<StudentInformation> array=new ArrayList<>();
            for (int i = 0; i < givenNoOfStudents[n]; i++) {
                StudentInformation stud = new StudentInformation();
                stud.classNo = givenClassNames[n];
                stud.studentName = givenNames[i];
                stud.studentImage = givenImage[i];
                stud.studentRollNo = givenRollNo[i];
                array.add(stud);
            }
            ClassInformation cl=new ClassInformation();
            cl.whichClass="class "+(n+1);
            cl.stuArray=array;
            data.add(cl);
        }
    }


    private void intialize() {

        appBarTv = (TextView) findViewById(R.id.app_bar_text_view);
        appBarIv = (ImageView) findViewById(R.id.app_bar_image_view);
        appBarIv.setImageResource(R.drawable.btn_nav_back_normal1);
        appBarIbtn = (ImageView) findViewById(R.id.app_bar_ibtn);
        appBarIbtn.setImageResource(R.drawable.settings2);
        appBarTv.setText("Class Information");
    }

    public void appBarMethd(View view) {
        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);
    }

    public void goToSettingsPage(View view) {
        Intent intent = new Intent(this, SettingsPage.class);
        startActivity(intent);


    }
}

