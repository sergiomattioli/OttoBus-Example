package com.laboratoriohidalgo.ottobus.view;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;
import com.laboratoriohidalgo.ottobus.bus.BusProvider;
import com.laboratoriohidalgo.ottobus.R;
import com.laboratoriohidalgo.ottobus.events.OnItemClickedEvent;
import com.squareup.otto.Subscribe;

/**
 * Created by Sergio Mattioli on 14/07/2015.
 */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        BusProvider.getInstance().register(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        BusProvider.getInstance().unregister(this);
    }

    @Subscribe
    public void onItemClicked(OnItemClickedEvent event) {
        Toast.makeText(this, event.toString(), Toast.LENGTH_SHORT).show();
    }
}
