package com.tutorialspoint;

public class Juggler implements Performer {

    private int beamBags = 3;

    public Juggler() {
    }

    public Juggler(int beamBags) {
        this.beamBags = beamBags;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("JUGGLING " + beamBags + " BEANBAGS");
    }
}
