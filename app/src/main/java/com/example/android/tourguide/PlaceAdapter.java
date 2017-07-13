package com.example.android.tourguide;

/**
 * Created by Shinam on 10/07/2017.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.tourguide.R.string.address;

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

        PlaceViewHolder viewHolder = (PlaceViewHolder) listItemView.getTag();

        if(viewHolder == null){
            viewHolder = new PlaceViewHolder();
            viewHolder.name = (TextView) listItemView.findViewById(R.id.list_item_name);
            viewHolder.address = (TextView) listItemView.findViewById(R.id.list_item_address);
            viewHolder.imageID = (ImageView) listItemView.findViewById(R.id.list_item_image);
            listItemView.setTag(viewHolder);
        }

        Place currentPlace = getItem(position);

        viewHolder.name.setText(currentPlace.getmPlaceName());
        viewHolder.address.setText(currentPlace.getmPlaceAddress());
        viewHolder.imageID.setImageResource(currentPlace.getmPlaceImageResourceID());

        final Intent itemIntent = new Intent(context, PlaceDetailsActivity.class);

        //Put the properties
        itemIntent.putExtra("myDataKey", currentPlace);


        //Start the intent
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });

        return listItemView;
    }

    private class PlaceViewHolder{
        public TextView name;
        public TextView address;
        public ImageView imageID;

    }
}

