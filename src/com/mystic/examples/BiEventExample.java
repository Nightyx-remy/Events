package com.mystic.examples;

import com.mystic.events.BiEvent;

/**
 * Example for the {@link BiEvent} class
 */
public class BiEventExample {

    public static void main(String[] args) {
        BiEvent<Integer, Boolean> event = new BiEvent<>();
        event.addListener((a, b) -> System.out.println(a + " " + b));
        event.invoke(12, false);
    }

}
