package com.training;


import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * 100 doors in a row are all initially closed. You make 100 passes by the doors. The first time through, you visit
 * every door and toggle the door (if the door is closed, you open it; if it is open, you close it).
 * The second time you only visit every 2nd door (door #2, #4, #6, ...).
 * The third time, every 3rd door (door #3, #6, #9, ...), etc, until you only visit the 100th door.
 * <p>
 * Question: What state are the doors in after the last pass? Which are open, which are closed?
 */

public class VisitorDoorsTest {

//    @Before
//    public void initDoors() {
////        Random random = new Random();
////        for (int i = 0; i < doors.length; i++) {
////            doors[i] = random.nextBoolean();
////            System.out.println(doors[i]);
////        }
//    }
//
//    @After
//    public void printResult() {
//       // System.out.println("final state doors : " + Arrays.toString(doors.getDoors()));
//    }

    @Test
    public void firstPass() {
        VisitorDoors doors = new VisitorDoors(1);
        System.out.println("init state doors for one passe : " + Arrays.toString(doors.getDoors()));
        boolean[] expected = new boolean[]{true};
        doors.visitDoors();
        System.out.println("final state doors for one passe :  " + Arrays.toString(doors.getDoors()));
        Assert.assertArrayEquals(expected, doors.getDoors());
    }

    @Test
    public void secondPass() {
        VisitorDoors doors = new VisitorDoors(2);
        System.out.println("init state doors for second passe : " + Arrays.toString(doors.getDoors()));
        boolean[] expected = new boolean[]{true, false};
        doors.visitDoors();
        System.out.println("final state doors for second passe : " + Arrays.toString(doors.getDoors()));
        Assert.assertArrayEquals(expected, doors.getDoors());
    }

    @Test
    public void thirdPass() {
        VisitorDoors doors = new VisitorDoors(3);
        System.out.println("init state doors for third passe : " + Arrays.toString(doors.getDoors()));
        boolean[] expected = new boolean[]{true, false, false};
        doors.visitDoors();
        System.out.println("final state doors for third passe : " + Arrays.toString(doors.getDoors()));
        Assert.assertArrayEquals(expected, doors.getDoors());
    }

    @Test
    public void hundredPass(){
        VisitorDoors doors = new VisitorDoors(100);
        System.out.println("init state doors for hundred passe : " + Arrays.toString(doors.getDoors()));
        boolean[] expected = new boolean[]{true, false, false, true, false, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true};
        doors.visitDoors();
        System.out.println("final state doors for hundred passe : " + Arrays.toString(doors.getDoors()));
        Assert.assertArrayEquals(expected, doors.getDoors());
    }
}
