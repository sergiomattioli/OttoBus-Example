package com.laboratoriohidalgo.ottobus.view;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.laboratoriohidalgo.ottobus.R;
import com.laboratoriohidalgo.ottobus.bus.BusProvider;
import com.laboratoriohidalgo.ottobus.events.OnItemClickedEvent;
import com.laboratoriohidalgo.ottobus.model.Data;
import com.squareup.otto.Bus;

/**
 * Created by Sergio Mattioli on 14/07/2015.
 */
public class MainListFragment extends ListFragment {

    public MainListFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BusProvider.getInstance().register(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        BusProvider.getInstance().unregister(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Data.ITEMS);
        setListAdapter(adapter);

        return rootView;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        Bus bus = BusProvider.getInstance();
        bus.post(new OnItemClickedEvent(Data.ITEMS.get(position)));

    }

}
