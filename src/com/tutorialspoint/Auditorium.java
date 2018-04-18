package com.tutorialspoint;

public class Auditorium {

    private boolean light;

    public Auditorium() {
        this.light = false;
    }
    public void turnOnLights() {
        this.light = true;
    }
    public void turnOffLights() {
        this.light = false;
    }
}
