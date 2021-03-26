package com.mystic.examples;

import com.mystic.events.EmptyEvent;

/**
 * Example for the {@link EmptyEvent} class
 */
public class EmptyEventExample {

    public static void main(String[] args) {
        EmptyEvent event = new EmptyEvent();
        event.addListener(() -> System.out.println("Empty event updated"));
        event.invoke();
    }

}
