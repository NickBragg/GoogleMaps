package com.example.patrick.googlemaps;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends Activity {


    GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(null == googleMap) {
            googleMap = ((MapFragment) getFragmentManager().findFragmentById(
                    R.id.mapView)).getMap();
        }
        if(googleMap != null)
        {
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(0, 0))
                    .title("Marker")
                    .draggable(true));

            googleMap.addMarker(new MarkerOptions()
            .position(new LatLng(5,5))
                    .title("Marker")
                    .draggable(true));
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(7,7)));

        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
