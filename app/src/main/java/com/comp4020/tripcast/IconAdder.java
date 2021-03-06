package com.comp4020.tripcast;

/**
 * Created by brianyeo on 2015-03-14.
 */

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;

import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class IconAdder {

    //currently takes "Rain", "Sun", "Snow", and "Tornado" as possible weather states
    public static void addIcon(String iconType, GoogleMap mMap, LatLng position) {
        MarkerOptions markOps = new MarkerOptions()
                .position(position)
                .title(iconType);

        switch (iconType) {
            case "Rain":
                markOps.icon(BitmapDescriptorFactory.fromResource(R.drawable.rain));
                break;
            case "Sun":
                markOps.icon(BitmapDescriptorFactory.fromResource(R.drawable.sun));
                break;
            case "Snow":
                markOps.icon(BitmapDescriptorFactory.fromResource(R.drawable.snow));
                break;
            case "Tornado":
                markOps.icon(BitmapDescriptorFactory.fromResource(R.drawable.tornado));
                break;
            default:
                break;
        }

        mMap.addMarker(markOps);

    }
}
