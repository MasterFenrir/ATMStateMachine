package com.company;

/**
 * Created by Sander on 4-10-2015.
 */
public class AbstractATMState implements ATMState {

    /**
     * Insert a card
     *
     * @return The new void, can be null if this action is not valid in the current state
     */
    @Override
    public void insertCard(ATM atm) {
        printError();
    }

    /**
     * Eject a card
     *
     */
    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Ejecting card");
        atm.setState(Idle.getInstance());
    }

    /**
     * Insert the PIN
     *
     * @param pin The PIN
     */
    @Override
    public void insertPin(ATM atm, int pin) {
        printError();
    }

    /**
     * Request a given amount of money
     *
     * @param request The amount of money
     */
    @Override
    public void requestAmount(ATM atm, int request) {
        printError();
    }

    /**
     * Disable the current ATM
     *
     */
    @Override
    public void disable(ATM atm) {
        printError();
    }

    /**
     * Enable the current ATM
     *
     */
    @Override
    public void enable(ATM atm) {
        printError();
    }

    /**
     * Print an error when this action is not allowed
     */
    protected void printError() {
        System.out.println("Not possible in the current state");
    }
}
