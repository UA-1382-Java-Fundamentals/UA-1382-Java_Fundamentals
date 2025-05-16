package com.softserve.academy.edu1.Hw6.Hw1;

import com.softserve.academy.edu1.Hw6.Hw1.FlyingBird.Bird.Eagle;
import com.softserve.academy.edu1.Hw6.Hw1.FlyingBird.Bird.Swallow;
import com.softserve.academy.edu1.Hw6.Hw1.NonFlyingBird.Bird.Kiwi;
import com.softserve.academy.edu1.Hw6.Hw1.NonFlyingBird.Bird.Penguin;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Kiwi kiwi = new Kiwi();
        Penguin penguin = new Penguin();
        Swallow swallow = new Swallow();
        eagle.info();
        kiwi.info();
        penguin.info();
        swallow.info();
    }
}
