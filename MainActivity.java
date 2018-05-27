package com.example.sagar.lab7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText uname,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname=findViewById(R.id.uname);
        pass=findViewById(R.id.pass);
    }

    public void login(View view) {
        if(uname.getText().toString().equals("admin") && pass.getText().toString().equals("admin")){
            Toast.makeText(this,"Login Successful",Toast.LENGTH_LONG).show();
            startActivity(new Intent(this,Main2Activity.class));
        }
        else{
            Toast.makeText(this,"Invalid Username or password",Toast.LENGTH_LONG).show();
        }
    }

    public void close(View view) {
        finish();
    }
}
