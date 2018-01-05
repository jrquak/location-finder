package com.jordy.rsrrevalidatieservice;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/**
 * A class that implements InfoWindowAdapter to show the information about a location
 * above a marker.
 */

public class CustomInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {

    private Activity cntxt;
    private TextView title;
    private TextView snippet;

    public CustomInfoWindowAdapter(Activity cntxt) {
        this.cntxt = cntxt;
    }

    @Override
    public View getInfoWindow(Marker marker) {
        View view = cntxt.getLayoutInflater().inflate(R.layout.popup_screen, null);

        title = (TextView) view.findViewById(R.id.title);
        title.setText(marker.getTitle());

        snippet = (TextView) view.findViewById(R.id.snippet);
        snippet.setText(marker.getSnippet());

        return view;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
