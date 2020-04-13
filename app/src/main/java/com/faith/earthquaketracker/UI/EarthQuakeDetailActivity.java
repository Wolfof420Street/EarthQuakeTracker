package com.faith.earthquaketracker.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.faith.earthquaketracker.R;

public class EarthQuakeDetailActivity extends AppCompatActivity {

    //defining views
    TextView titleTxt;
    TextView linkTxt;
    TextView dateTxt;
    TextView categoryTxt;
    TextView latTxt;
    TextView longTxt;
    TextView descriptionTxt;

    //defining variables
    String title;
    String link;
    String date;
    String category;
    String lat;
    String longtd;
    String description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth_quake_detail);

        //initializing views
        titleTxt = findViewById(R.id.titleTxt);
        linkTxt = findViewById(R.id.linkedTxt);
        dateTxt = findViewById(R.id.dateTxt);
        categoryTxt = findViewById(R.id.categoryTxt);
        latTxt = findViewById(R.id.latTxt);
        longTxt = findViewById(R.id.longTxt);
        descriptionTxt = findViewById(R.id.descriptionTxt);

        //getting data from previous activity

        Intent intent = getIntent();
        title = intent.getStringExtra("title");
        link = intent.getStringExtra("link");
        date = intent.getStringExtra("date");
        category = intent.getStringExtra("category");
        lat = intent.getStringExtra("lat");
        longtd = intent.getStringExtra("long");
        description = intent.getStringExtra("description");



        //displaying data to the user

        titleTxt.setText(title);
        linkTxt.setText(link);
        dateTxt.setText(date);
        categoryTxt.setText(category);
        latTxt.setText(lat);
        longTxt.setText(longtd);
        descriptionTxt.setText(description);


    }
}
