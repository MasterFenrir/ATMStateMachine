package com.company;

/**
 * Created by Sander on 4-10-2015.
 */
public class AbstractATMState implements ATMState {

    /**
     * Insert a card
     *
     * @return The new ATMState, can be null if this action is not valid in the current state
     */
    @Override
    public ATMState insertCard() {
        printError();
        return null;
    }

    /**
     * Eject a card
     *
     * @return The new ATMState, can be null if this action is not valid in the current state
     */
    @Override
    public ATMState ejectCard() {
        printError();
        return null;
    }

    /**
     * Insert the PIN
     *
     * @param pin The PIN
     * @return The new ATMState, can be null if this action is not valid in the current state or the PIN is incorrect
     */
    @Override
    public ATMState insertPin(int pin) {
        printError();
        return null;
    }

    /**
     * Request a given amount of money
     *
     * @param request The amount of money
     * @return The new ATMState, can be null if this action is not valid in the current state or if the money is not available
     */
    @Override
    public ATMState requestAmount(int request) {
        printError();
        return null;
    }

    /**
     * Disable the current ATM
     *
     * @return The new state if disabling is possible now, otherwise null
     */
    @Override
    public ATMState disable() {
        printError();
        return null;
    }

    /**
     * Enable the current ATM
     *
     * @return The new state if enabling is possible now, otherwise null
     */
    @Override
    public ATMState enable() {
        printError();
        return null;
    }

    /**
     * Print an error when this action is not allowed
     */
    private void printError(){
        System.out.println("Not possible in the current state");
    }
}
