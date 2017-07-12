package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class DrinkFragment extends Fragment {


    public DrinkFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.drinkName1), getString(R.string.drinkAddress1), getString(R.string.drinkDesc1), R.drawable.duomo, getString(R.string.drinkUrl1), getString(R.string.drinkLoc1)));
        places.add(new Place(getString(R.string.drinkName2), getString(R.string.drinkAddress2), getString(R.string.drinkDesc2), R.drawable.galleria, getString(R.string.drinkUrl2), getString(R.string.drinkLoc2)));
        places.add(new Place(getString(R.string.drinkName3), getString(R.string.drinkAddress3), getString(R.string.drinkDesc3), R.drawable.grazie, getString(R.string.drinkUrl3), getString(R.string.drinkLoc3)));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.place_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}

