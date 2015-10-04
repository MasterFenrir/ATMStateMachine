package com.company;

/**
 * Created by Sander on 4-10-2015.
 */
public interface ATMState {

    /**
     * Insert a card
     */
    void insertCard(ATM atm);

    /**
     * Eject a card
     */
    void ejectCard(ATM atm);

    /**
     * Insert the PIN
     * @param pin The PIN
     */
    void insertPin(ATM atm, int pin);

    /**
     * Request a given amount of money
     * @param request The amount of money
     */
    void requestAmount(ATM atm, int request);

    /**
     * Disable the current ATM
     */
    void disable(ATM atm);

    /**
     * Enable the current ATM
     */
    void enable(ATM atm);
}
