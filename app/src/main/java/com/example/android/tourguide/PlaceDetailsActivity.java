package com.example.android.tourguide;

/**
 * Created by Shinam on 10/07/2017.
 */

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class PlaceDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_details);

        //Get the properties
        Bundle b = getIntent().getExtras();
        Place object = b.getParcelable("myDataKey");

        String placeName = object.getmPlaceName();
        String placeAddress = object.getmPlaceAddress();
        String placeDescription = object.getmPlaceDescription();
        int placeImage = object.getmPlaceImageResourceID();
        final String placeSite = object.getmPlaceSiteURL();
        final String placeLocation = object.getmPlaceLocation();

        //Set screen title
        this.setTitle(placeName);

        //Activate Up Button to enable
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ImageView imageView = (ImageView) findViewById(R.id.detailed_image);
        imageView.setImageResource(placeImage);

        TextView nameTextView = (TextView) findViewById(R.id.detailed_name);
        nameTextView.setText(placeName);

        TextView addressTextView = (TextView) findViewById(R.id.detailed_address);
        addressTextView.setText(placeAddress);

        TextView descriptionTextView = (TextView) findViewById(R.id.detailed_desc);
        descriptionTextView.setText(placeDescription);

        //Create an implicit intent for the web page
        LinearLayout linkView = (LinearLayout) findViewById(R.id.link_webpage);
        linkView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri webPage = Uri.parse(placeSite);
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webPage);
                if (webIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(webIntent);
                }
            }
        });

        //Create an implicit intent for google map
        LinearLayout mapView = (LinearLayout) findViewById(R.id.link_map);
        mapView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri geoLocation = Uri.parse("geo:" + placeLocation + "?z=16");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, geoLocation);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
    }
}
