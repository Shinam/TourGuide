package com.example.android.tourguide;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Shinam on 10/07/2017.
 */

public class Place implements Parcelable{

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

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<Place> CREATOR
            = new Parcelable.Creator<Place>() {

        @Override
        public Place createFromParcel(Parcel in) {
            return new Place(in);
        }

        @Override
        public Place[] newArray(int size) {
            return new Place[size];
        }
    };

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(mPlaceName);
        out.writeString(mPlaceAddress);
        out.writeString(mPlaceDescription);
        out.writeInt(mPlaceImageResourceID);
        out.writeString(mPlaceSiteURL);
        out.writeString(mPlaceLocation);
    }

    private Place(Parcel in) {
        mPlaceName = in.readString();
        mPlaceAddress = in.readString();
        mPlaceDescription = in.readString();
        mPlaceImageResourceID = in.readInt();
        mPlaceSiteURL = in.readString();
        mPlaceLocation = in.readString();
    }
}

