package com.click_labs.kashishnalwa.schooappproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPage extends BaseActivity {
TextView appBarTv;
    EditText emailId;
    EditText pass;
    String enteredEmail;
    String correctEmail="kashish.nalwa@theroboticshomepage.com";
    String enteredPass;
    String correctPass="clickpass5";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        intialise();
    }

    private void intialise() {
        appBarTv=(TextView) findViewById(R.id.app_bar_text_view);
        appBarTv.setText("LogIn");
        emailId=(EditText)findViewById(R.id.email_et);
        pass=(EditText) findViewById(R.id.password_et);
    }

    public void goToClassInformationPage(View view){
        enteredEmail=emailId.getText().toString();
        enteredPass=pass.getText().toString();
        if(enteredEmail.equals(correctEmail)){
            if (enteredPass.equals(correctPass)){

                Intent intent=new Intent(this,Class_Information.class);
                startActivity(intent);
                finish();

            }
        }else{
            Toast.makeText(getApplicationContext(),"not correct",Toast.LENGTH_LONG).show();

        }


    }

}
