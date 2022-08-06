package com.training;


import java.util.stream.IntStream;

public class VisitorDoors {

    private final boolean[] doors;

    public VisitorDoors(int doorsNumber) {
        doors = new boolean[doorsNumber];
    }

    /***
     * Main method for visit 100 doors
     */
    public void visitDoors() {
        for (int i = 0; i < doors.length; i++) {
            int[] indexDoorsToVisit = getMultiples(i + 1);
            for (int k : indexDoorsToVisit) {
                doors[k - 1] = !doors[k - 1];
            }
        }
    }

    /**
     * extract sub-set of multiple current index
     */
    public int[] getMultiples(int pass) {
        return IntStream.range(pass, doors.length + 1).filter(i -> i % pass == 0).toArray();
    }

    public boolean[] getDoors() {
        return doors;
    }

}
