package com.tutorialspoint;

public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;


    public Instrumentalist() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) { // Внедрение мелодии
        this.song = song;

    }

    public String screamSong() {
        return song;
    }


    public void setInstrument(Instrument instrument) { // Внедрение
        this.instrument = instrument; // инструмента
    }



}
