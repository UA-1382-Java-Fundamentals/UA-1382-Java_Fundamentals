/*
1. Create abstract class called Bird by scheme
with attributes feathers and layEggs and an
abstaract fly() method.
2. Create classes FlyingBird and NonFlyingBird.
3. Create classes Eagle, Swallow, Penguin and
Kiwi.
4. In main() method create an array Bird and
add different birds to it. Call fly() method for
all of it. Output the information about each
type of created bird.
 */

package com.softserve.academy.hw6_t1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(true, true),
                new Kiwi(true, true),
                new Penguin(false,true),
                new Swallow( true, true)
        };

        for (Bird b : birds) {
            System.out.print("Type: " + b.getType() + "; Feathers: " + b.isFeathers() + "; Eggs: " + b.isLayEggs() + "; ");
            b.fly();
        }
    }
}
