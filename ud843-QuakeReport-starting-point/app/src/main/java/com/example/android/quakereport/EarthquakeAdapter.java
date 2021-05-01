package com.example.android.quakereport;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import android.graphics.drawable.GradientDrawable;


//custom ArrayAdapter
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /**
     * The part of the location string from the USGS service that we use to determine
     * whether or not there is a location offset present ("5km N of Cairo, Egypt").
     */
    private static final String LOCATION_SEPARATOR = " of ";



    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes){
        super(context,0 ,earthquakes);

    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView with view ID magnitude
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        // Format the magnitude to show 1 decimal place
        String formattedMagnitude = formatMagnitude(currentEarthquake.getMagnitude());
        // Display the magnitude of the current earthquake in that TextView
        magnitudeView.setText(formattedMagnitude);


        String primaryLocation;
        String locationOffset;
        //call getLocation method to get location
        String originalLocation = currentEarthquake.getLocation();

        //if the location contains "of" keyword then we split the string
        //otherwise we store original location into primary location
        if (originalLocation.contains(LOCATION_SEPARATOR)) {
            String[] parts = originalLocation.split(LOCATION_SEPARATOR);
            locationOffset = parts[0] + LOCATION_SEPARATOR;
            primaryLocation = parts[1];
        } else {
            locationOffset = getContext().getString(R.string.near_the);
            primaryLocation = originalLocation;
        }

        //Find the TextView with view id primary_location
        TextView primaryLocationView = (TextView) listItemView.findViewById(R.id.primary_location);
        // Display the primary location of the current earthquake in that TextView
        primaryLocationView.setText(primaryLocation);

        //Find the TextView with view id location_offset
        TextView locationOffsetView = (TextView) listItemView.findViewById(R.id.location_offset);
        // Display the time of the current earthquake in that TextView
        locationOffsetView.setText(locationOffset);

        // Create a new Date object from the time in milliseconds of the earthquake
        Date dateObject = new Date(currentEarthquake.getTimeInMilliseconds());
        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Format the date string (i.e. "Mar 3, 1984")
        String formattedDate = formatDate(dateObject);
        // Display the date of the current earthquake in that TextViewlocation offset
        dateView.setText(formattedDate);

        // Find the TextView with view ID time
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        // Format the time string (i.e. "4:30PM")
        String formattedTime = formatTime(dateObject);
        // Display the time of the current earthquake in that TextView
        timeView.setText(formattedTime);

        // Set the proper background color on the magnitude circle.
        // Fetch the background from the TextView, which is a GradientDrawable.
        GradientDrawable magnitudeCircle = (GradientDrawable) magnitudeView.getBackground();

        // Get the appropriate background color based on the current earthquake magnitude
        int magnitudeColor = getMagnitudeColor(currentEarthquake.getMagnitude());

        // Set the color on the magnitude circle
        magnitudeCircle.setColor(magnitudeColor);


        // Return the list item view that is now showing the appropriate data
        return listItemView;

    }

    /**
     * getMagnitudeColor method returns which color should be set to magnitude circle
     * @param magnitude is intensity of magnitude
     * @return color as integer
     */
     private int getMagnitudeColor(double magnitude){
         int magnitudeColorResourceId;

         //converts double magnitude to int as switch accepts only integer
         int magnitudeFloor = (int) Math.floor(magnitude);

         switch (magnitudeFloor) {
             case 0:
             case 1:
                 magnitudeColorResourceId = R.color.magnitude1;
                 break;
             case 2:
                 magnitudeColorResourceId = R.color.magnitude2;
                 break;
             case 3:
                 magnitudeColorResourceId = R.color.magnitude3;
                 break;
             case 4:
                 magnitudeColorResourceId = R.color.magnitude4;
                 break;
             case 5:
                 magnitudeColorResourceId = R.color.magnitude5;
                 break;
             case 6:
                 magnitudeColorResourceId = R.color.magnitude6;
                 break;
             case 7:
                 magnitudeColorResourceId = R.color.magnitude7;
                 break;
             case 8:
                 magnitudeColorResourceId = R.color.magnitude8;
                 break;
             case 9:
                 magnitudeColorResourceId = R.color.magnitude9;
                 break;
             default:
                 magnitudeColorResourceId = R.color.magnitude10plus;
                 break;
         }
         return ContextCompat.getColor(getContext(), magnitudeColorResourceId);
     }

    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

    /**
     * Return the formatted magnitude from a Magnitude object.
     */
    private String formatMagnitude(Double magnitude) {
        DecimalFormat magnitudeFormat = new DecimalFormat("0.0");
        return  magnitudeFormat.format(magnitude);
    }
}