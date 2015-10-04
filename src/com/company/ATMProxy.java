package com.company;

/**
 * Created by Sander on 4-10-2015.
 */
public class ATMProxy implements GetATMData {

    private GetATMData realATM;

    public ATMProxy() {
        realATM = new ATM();
    }

    /**
     * Get the current state the machine is in
     *
     * @return The current state of the machine
     */
    @Override
    public String getATMState() {
        return realATM.getATMState();
    }

    /**
     * Get the amount of money in the machine
     *
     * @return The amount of money in the machine
     */
    @Override
    public int getCashInMachine() {
        return realATM.getCashInMachine();
    }

    // For testing
    public ATM getATM() {
        return (ATM) realATM;
    }
}
