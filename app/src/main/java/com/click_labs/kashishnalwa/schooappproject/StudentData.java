package com.click_labs.kashishnalwa.schooappproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class StudentData extends AppCompatActivity {
    TextView displayName;
    TextView displayRollNo;
    TextView displayClass;
    ImageView displayImage;
    TextView appBarTv;
    ImageView appBarIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_data);
        initialise();
        Intent intent = getIntent();
        StudentInformation T2;
        T2 = (StudentInformation) intent.getSerializableExtra(VivzAdapter.EXTRA_MESSAGE);
        displayClass.setText(T2.classNo);
        displayName.setText(T2.studentName);
        displayRollNo.setText(T2.studentRollNo);
        displayImage.setImageResource(T2.studentImage);
    }

    private void initialise() {
        displayClass = (TextView) findViewById(R.id.class_enter_tv);
        displayName = (TextView) findViewById(R.id.student_name_enter_tv);
        displayRollNo = (TextView) findViewById(R.id.student_roll_no_enter_tv);
        displayImage = (ImageView) findViewById(R.id.image_iv);
        appBarTv = (TextView) findViewById(R.id.app_bar_text_view);
        appBarIv = (ImageView) findViewById(R.id.app_bar_image_view);
        appBarIv.setImageResource(R.drawable.btn_nav_back_normal1);
        appBarTv.setText("Student Information");
    }

    public void appBarMethod(View view) {
        Intent intent = new Intent(this, Class_Information.class);
        startActivity(intent);
    }
}
