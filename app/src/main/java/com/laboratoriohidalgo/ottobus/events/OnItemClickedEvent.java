package com.laboratoriohidalgo.ottobus.events;

/**
 * Created by Sergio Mattioli on 14/07/2015.
 */
public class OnItemClickedEvent {

    public  String item;

    public OnItemClickedEvent(String item){
        this.item = item;
    }

    @Override
    public String toString() {
        return "OnItemClickedEvent{" +
                "item='" + item + '\'' +
                '}';
    }
}
