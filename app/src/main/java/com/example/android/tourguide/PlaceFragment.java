package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaceFragment extends Fragment {


    public PlaceFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.placeName1), getString(R.string.placeAddress1), getString(R.string.placeDesc1), R.drawable.duomo, getString(R.string.placeUrl1), getString(R.string.placeLoc1)));
        places.add(new Place(getString(R.string.placeName2), getString(R.string.placeAddress2), getString(R.string.placeDesc2), R.drawable.grazie, getString(R.string.placeUrl2), getString(R.string.placeLoc2)));
        places.add(new Place(getString(R.string.placeName3), getString(R.string.placeAddress3), getString(R.string.placeDesc3), R.drawable.galleria, getString(R.string.placeUrl3), getString(R.string.placeLoc3)));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.place_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}

