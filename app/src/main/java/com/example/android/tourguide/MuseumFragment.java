package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumFragment extends Fragment {


    public MuseumFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.museumName1), getString(R.string.museumAddress1), getString(R.string.museumDesc1), R.drawable.duomo, getString(R.string.museumUrl1), getString(R.string.museumLoc1)));
        places.add(new Place(getString(R.string.museumName2), getString(R.string.museumAddress2), getString(R.string.museumDesc2), R.drawable.galleria, getString(R.string.museumUrl2), getString(R.string.museumLoc2)));
        places.add(new Place(getString(R.string.museumName3), getString(R.string.museumAddress3), getString(R.string.museumDesc3), R.drawable.grazie, getString(R.string.museumUrl3), getString(R.string.museumLoc3)));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.place_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}

