package com.example.android.quakereport;

public class Earthquake {

    //global variable for magnitude
    public  double mMagnitude;

    //global variable for location
    public String mLocation;

    //global variable for url
    public String mUrl;

    //global variable for time
    private long mTimeInMilliseconds;


    //Constructor
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }


    /**
     * Get the  magnitude
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the Location
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the URL
     */
    public String getUrl() {
        return mUrl;
    }

    /**
     * Return the Date and time
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
