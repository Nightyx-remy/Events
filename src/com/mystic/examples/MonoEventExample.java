package com.mystic.examples;

import com.mystic.events.MonoEvent;

/**
 * Example for the {@link MonoEvent} class
 */
public class MonoEventExample {

    public static void main(String[] args) {
        MonoEvent<Integer> event = new MonoEvent<>();
        event.addListener(System.out::println);
        event.invoke(12);
    }

}
