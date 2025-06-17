package org.eduardomaravill.github_actions.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void getMinNumber() {
        assertEquals(1, Utils.getMinNumber(1, 2));
        assertEquals(2, Utils.getMinNumber(2, 2));
        assertEquals(-5, Utils.getMinNumber(-1, 0));
        assertEquals(-5, Utils.getMinNumber(-5, -3));
        assertEquals(0, Utils.getMinNumber(0, 0));
    }
}