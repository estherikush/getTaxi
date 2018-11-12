package com.esthere.gettaxi1.controller;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.esthere.gettaxi1.R;
import com.esthere.gettaxi1.model.backend.IBackend;
import com.esthere.gettaxi1.model.datasource.Globals;
import com.esthere.gettaxi1.model.datasource.Lists;
import com.esthere.gettaxi1.model.entities.User;

public class LoginActivity extends Activity {

    EditText password, email;
    //IBackend backend = new Lists();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
    }

    public void submitClicked(View view) {
        String s1 = email.getText().toString();
        String s2 = password.getText().toString();
        User user = new User(s1, s2);
        if (Globals.backend.Login(user)) {
            Intent intent=new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, R.string.FAIL_LOGIN, Toast.LENGTH_SHORT).show();
        }
    }

    public void resetClicked(View view) {
        email.setText("");
        password.setText("");
    }
}
