package com.example.android.tourguide;

/**
 * Created by Shinam on 10/07/2017.
 */

public class Place {

    private String mPlaceName;
    private String mPlaceAddress;
    private String mPlaceDescription;
    private int mPlaceImageResourceID;
    private String mPlaceSiteURL;
    private String mPlaceLocation;

    public Place(String mPlaceName, String mPlaceAddress, String mPlaceDescription, int mPlaceImageResourceID, String mPlaceSiteURL, String mPlaceLocation) {
        this.mPlaceName = mPlaceName;
        this.mPlaceAddress = mPlaceAddress;
        this.mPlaceDescription = mPlaceDescription;
        this.mPlaceImageResourceID = mPlaceImageResourceID;
        this.mPlaceSiteURL = mPlaceSiteURL;
        this.mPlaceLocation = mPlaceLocation;
    }

    public String getmPlaceName() {
        return mPlaceName;
    }

    public String getmPlaceAddress() {
        return mPlaceAddress;
    }

    public String getmPlaceDescription() {
        return mPlaceDescription;
    }

    public int getmPlaceImageResourceID() {
        return mPlaceImageResourceID;
    }

    public String getmPlaceSiteURL() {
        return mPlaceSiteURL;
    }

    public String getmPlaceLocation() {
        return mPlaceLocation;
    }
}

