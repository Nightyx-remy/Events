package com.mystic.events;

import java.util.ArrayList;

/**
 * This abstract class is the structure of all the events
 * @param <Listener> the listener type
 *
 * @see EmptyEvent
 * @see MonoEvent
 * @see BiEvent
 */
public abstract class IEvent<Listener> {

    protected final ArrayList<Listener> listeners = new ArrayList<>();

    /**
     * Add a listener to the list
     * @param listener the listener that will be added
     * @throws NullPointerException if the listener is null
     */
    public void addListener(Listener listener) throws NullPointerException {
        if(listener == null) throw new NullPointerException("Failed to add listener!");
        listeners.add(listener);
    }

    /**
     * Remove a listener from the list
     * @param listener the listener that will be removed
     * @throws NullPointerException if the listener is null
     */
    public void removeListener(Listener listener) throws NullPointerException {
        if(listener == null) throw new NullPointerException("Failed to add listener!");
        listeners.remove(listener);
    }

}
