package com.laboratoriohidalgo.ottobus.bus;

import com.squareup.otto.Bus;

/**
 * Created by Sergio Mattioli on 14/07/2015.
 *  Singleton access for the Event Bus.
 */
public final class BusProvider {
    private static final Bus BUS = new Bus();

    public static Bus getInstance() {
        return BUS;
    }
}