package com.slugger7.upresearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void login(View view) {
        TextView username = (TextView) findViewById(R.id.txt_username);
        TextView password = (TextView) findViewById(R.id.txt_password);

        assert username != null;
        assert password != null;
        if ("cos301".equals(username.getText().toString()) && password.getText().toString().equals("password"))
        {
            Intent intent = new Intent(this, home.class);
            startActivity(intent);
            finish();
        }
    }
}
