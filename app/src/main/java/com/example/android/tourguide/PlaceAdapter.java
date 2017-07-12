package com.example.android.tourguide;

/**
 * Created by Shinam on 10/07/2017.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    private Context context = getContext();

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        //Get the object's properties
        String name = currentPlace.getmPlaceName();
        String address = currentPlace.getmPlaceAddress();
        String description = currentPlace.getmPlaceDescription();
        int imageID = currentPlace.getmPlaceImageResourceID();
        String siteURL = currentPlace.getmPlaceSiteURL();
        String location = currentPlace.getmPlaceLocation();

        final ImageView itemImageView = (ImageView) listItemView.findViewById(R.id.list_item_image);
        itemImageView.setImageResource(imageID);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.list_item_name);
        nameTextView.setText(name);

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.list_item_address);
        addressTextView.setText(address);

        final Intent itemIntent = new Intent(context, PlaceDetailsActivity.class);

        //Put the properties
        itemIntent.putExtra(context.getString(R.string.name), name);
        itemIntent.putExtra(context.getString(R.string.address), address);
        itemIntent.putExtra(context.getString(R.string.desc), description);
        itemIntent.putExtra(context.getString(R.string.image), imageID);
        itemIntent.putExtra(context.getString(R.string.site), siteURL);
        itemIntent.putExtra(context.getString(R.string.location), location);


        //Start the intent
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });

        return listItemView;
    }
}

