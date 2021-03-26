package com.mystic.events;

/**
 * This class represent an event that take no parameters
 *
 * @see Action
 */
public class EmptyEvent extends IEvent<Action> {

    /**
     * Notify all the listeners
     */
    public void invoke() {
        listeners.forEach(Action::invoke);
    }

}
