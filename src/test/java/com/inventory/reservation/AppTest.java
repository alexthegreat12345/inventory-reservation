package com.inventory.reservation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void greetingIncludesName() {
        assertEquals("Hello, inventory", App.greeting("inventory"));
    }

    @Test
    void greetingWithoutName() {
        assertEquals("Hello", App.greeting(" "));
        assertEquals("Hello", App.greeting(null));
    }
}
