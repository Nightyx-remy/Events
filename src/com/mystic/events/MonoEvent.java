package com.mystic.events;

import java.util.function.Consumer;

/**
 * This class represent an event that take only one parameter
 * @param <Source> the parameter's type
 *
 * @see Consumer
 */
public class MonoEvent<Source> extends IEvent<Consumer<Source>> {

    /**
     * Notify all the listeners
     */
    public void invoke(Source source) {
        listeners.forEach(listener -> listener.accept(source));
    }

}
