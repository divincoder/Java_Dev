package com.example.nn0lumesther.javadev.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.nn0lumesther.javadev.R;
import com.example.nn0lumesther.javadev.model.Developer;

import static com.example.nn0lumesther.javadev.adapter.DeveloperAdapter.DEVELOPER_KEY;

public class DetailActivity extends AppCompatActivity {
    private Developer developer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView username = (TextView) findViewById(R.id.username);

        if (getIntent() != null) {
            developer = getIntent().getParcelableExtra(DEVELOPER_KEY);
            username.setText(developer.getLogin());
        }
    }
}
