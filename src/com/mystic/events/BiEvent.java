package com.mystic.events;

import java.util.function.BiConsumer;

/**
 * This class represent an event that take two parameters
 * @param <A> the first parameter's type
 * @param <B> the second parameter's type
 *
 * @see BiConsumer
 */
public class BiEvent<A, B> extends IEvent<BiConsumer<A, B>> {

    /**
     * Notify all the listeners
     */
    public void invoke(A a, B b) {
        listeners.forEach(listener -> listener.accept(a, b));
    }

}
