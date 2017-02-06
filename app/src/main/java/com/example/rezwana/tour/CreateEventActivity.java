package com.example.rezwana.tour;

import android.content.Intent;
import android.os.Bundle;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by rezwana on 2/5/2017.
 */
public class CreateEventActivity  extends AppCompatActivity{

    TextView tvTravelEvent;
    EditText etEventName, etEstBudget, etStartDate, etEndDate;
    Button btEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        tvTravelEvent = (TextView) findViewById(R.id.tvTravelEvent);
        etEventName = (EditText) findViewById(R.id.etEventName);
        etEstBudget = (EditText) findViewById(R.id.etEstBudget);
        etStartDate = (EditText) findViewById(R.id.etStartDate);
        etEndDate = (EditText) findViewById(R.id.etEndDate);

        btEvent = (Button) findViewById(R .id.btEvent);

        //Floating Action Button
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBack = new Intent(CreateEventActivity.this, MainActivity.class);
                startActivity(intentBack);
                //   Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //         .setAction("Action", null).show();

            }
        });
    }
}
