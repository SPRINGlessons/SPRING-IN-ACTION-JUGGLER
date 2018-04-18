package com.tutorialspoint;

public class Ticket {

    private int uniqueNumber;

    public Ticket() {
        this.uniqueNumber = 1;
    }


    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public int getNewTicket() {
        this.uniqueNumber = this.uniqueNumber + 1;

        return this.uniqueNumber;
    }


}
