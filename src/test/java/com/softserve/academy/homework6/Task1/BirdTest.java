package com.softserve.academy.homework6.Task1;

import com.softserve.academy.homework6.Task1.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest  {

    @Test
    void testFly() {
    }

    @Test
    void testPrintInfo() {
    }


    @Test
    void testEagleIsFlyingBird() {
        Bird eagle = new Eagle();
        assertTrue(eagle instanceof FlyingBird);
        assertEquals("Eagle", eagle.getType());
        assertTrue(eagle.hasFeathers());
        assertTrue(eagle.canLayEggs());
    }

    @Test
    void testSwallowIsFlyingBird() {
        Bird swallow = new Swallow();
        assertTrue(swallow instanceof FlyingBird);
        assertEquals("Swallow", swallow.getType());
        assertTrue(swallow.hasFeathers());
        assertTrue(swallow.canLayEggs());
    }

    @Test
    void testPenguinIsNonFlyingBird() {
        Bird penguin = new Penguin();
        assertTrue(penguin instanceof NonFlyingBird);
        assertEquals("Penguin", penguin.getType());
        assertTrue(penguin.hasFeathers());
        assertTrue(penguin.canLayEggs());
    }

    @Test
    void testKiwiIsNonFlyingBird() {
        Bird kiwi = new Kiwi();
        assertTrue(kiwi instanceof NonFlyingBird);
        assertEquals("Kiwi", kiwi.getType());
        assertTrue(kiwi.hasFeathers());
        assertTrue(kiwi.canLayEggs());
    }
}