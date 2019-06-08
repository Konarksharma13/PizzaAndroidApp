package com.example.pizza_android_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText txt1,txt2;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        btn=(Button)findViewById(R.id.login);
        txt1=(EditText)findViewById(R.id.id);
        txt2=(EditText)findViewById(R.id.pwd);

        final String un="konark";
        final String pwd="1301";

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id=txt1.getText().toString();
                String pwd1=txt2.getText().toString();
                if((TextUtils.isEmpty(id))||(TextUtils.isEmpty(pwd1))){
                    txt1.setError("Enter username");
                    txt2.setError("Enter password");

                }
                else {


                    if(txt1.getText().toString().equalsIgnoreCase(un)
                            && (txt2.getText().toString().equalsIgnoreCase(pwd)))
                    {

                        Intent i=new Intent(login.this, menu.class);
                        i.putExtra("data", un);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(login.this, "Please enter correct username/password", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
