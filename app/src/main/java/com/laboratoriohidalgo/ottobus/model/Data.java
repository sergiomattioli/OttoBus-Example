package com.laboratoriohidalgo.ottobus.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergio Mattioli on 14/07/2015.
 */
public class Data {

    /**
     * An array of sample (dummy) items.
     */
    public static List<String> ITEMS = new ArrayList<String>();
    static {
        addItem("Android");
        addItem("iPhone");
        addItem("Blackberry");
        addItem("Ubuntu");
        addItem("Windows XP");
        addItem("Windows 7");
        addItem("Windows 8.1");
        addItem("Windows 10");
        addItem("Mac OS X");
        addItem("Windows Phone");
        addItem("Debian");
    }
    private static void addItem(String item) {
        ITEMS.add(item);
    }

}
