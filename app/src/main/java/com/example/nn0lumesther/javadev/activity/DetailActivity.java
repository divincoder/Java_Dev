package com.example.nn0lumesther.javadev.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.nn0lumesther.javadev.R;
import com.example.nn0lumesther.javadev.model.Developer;

import static com.example.nn0lumesther.javadev.adapter.DeveloperAdapter.DEVELOPER_KEY;

public class DetailActivity extends AppCompatActivity {
    private Developer developer;
    private TextView username;
    private TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initViews();

        if (getIntent() != null) {
            developer = getIntent().getParcelableExtra(DEVELOPER_KEY);
            username.setText(developer.getLogin());
            link.setText(developer.getUrl());
            Log.d("TAG", "This block of code ran");
        }
    }

    private void initViews(){
        username = (TextView) findViewById(R.id.username);
        link = (TextView) findViewById(R.id.link_text);
    }
}
