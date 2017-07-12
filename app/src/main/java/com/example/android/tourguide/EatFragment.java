package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EatFragment extends Fragment {


    public EatFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.eatName1), getString(R.string.eatAddress1), getString(R.string.eatDesc1), R.drawable.duomo, getString(R.string.eatUrl1), getString(R.string.eatLoc1)));
        places.add(new Place(getString(R.string.eatName2), getString(R.string.eatAddress2), getString(R.string.eatDesc2), R.drawable.galleria, getString(R.string.eatUrl2), getString(R.string.eatLoc2)));
        places.add(new Place(getString(R.string.eatName3), getString(R.string.eatAddress3), getString(R.string.eatDesc3), R.drawable.grazie, getString(R.string.eatUrl3), getString(R.string.eatLoc3)));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.place_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}

