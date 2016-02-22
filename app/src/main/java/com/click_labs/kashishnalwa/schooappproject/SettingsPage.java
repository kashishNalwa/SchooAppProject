package com.click_labs.kashishnalwa.schooappproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SettingsPage extends AppCompatActivity {
TextView appBarTv;
    ImageView appBarIv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_page);
        appBarTv=(TextView) findViewById(R.id.app_bar_text_view);
        appBarTv.setText("Settings");
        appBarIv=(ImageView) findViewById(R.id.app_bar_image_view);
        appBarIv.setImageResource(R.drawable.btn_nav_back_normal1);
    }

    public void appBarMethod(View view){
        Intent intent=new Intent(this,Class_Information.class);
        startActivity(intent);
    }
}
