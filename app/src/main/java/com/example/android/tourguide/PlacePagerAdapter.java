package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Shinam on 10/07/2017.
 */

public class PlacePagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public PlacePagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlaceFragment();
        } else if (position == 1) {
            return new EatFragment();
        } else if (position == 2) {
            return new DrinkFragment();
        } else {
            return new MuseumFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.place);
        } else if (position == 1) {
            return mContext.getString(R.string.eat);
        } else if (position == 2) {
            return mContext.getString(R.string.drink);
        } else {
            return mContext.getString(R.string.museum);
        }
    }
}
