package com.example.pizza_android_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class signUp extends AppCompatActivity {

    EditText fname,lname,pn,id,pwd;
    Button back,submit;
    RadioGroup group;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        fname=(EditText)findViewById(R.id.firstName);
        lname=(EditText)findViewById(R.id.lastName);
        pn=(EditText)findViewById(R.id.pn);
        id=(EditText)findViewById(R.id.id);
        pwd=(EditText)findViewById(R.id.pwd);
        group=(RadioGroup)findViewById(R.id.grp);
        back=(Button)findViewById(R.id.back);
        submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String un=fname.getText().toString();
                String txt2=lname.getText().toString();
                String txt3=pn.getText().toString();
                String txt4=id.getText().toString();
                String txt5=pwd.getText().toString();


                if((TextUtils.isEmpty(un)) && (TextUtils.isEmpty(txt2)) && (TextUtils.isEmpty(txt3))
                        && (TextUtils.isEmpty(txt4)) && (TextUtils.isEmpty(txt5)))
                {
                    fname.setError("Enter First name");
                    lname.setError("Enter Last name");
                    pn.setError("Enter Phone number");
                    id.setError("Enter Username");
                    pwd.setError("Enter Password");
                }
                else
                {
                    Intent i=new Intent(signUp.this, menu.class);
                    i.putExtra("data", un);
                    startActivity(i);
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(signUp.this, MainActivity.class);
                startActivity(i);

            }
        });
            }
}
