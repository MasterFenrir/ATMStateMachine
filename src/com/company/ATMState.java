package com.company;

/**
 * Created by Sander on 4-10-2015.
 */
public interface ATMState {

    /**
     * Insert a card
     * @return The new ATMState, can be null if this action is not valid in the current state
     */
    ATMState insertCard();

    /**
     * Eject a card
     * @return The new ATMState, can be null if this action is not valid in the current state
     */
    ATMState ejectCard();

    /**
     * Insert the PIN
     * @param pin The PIN
     * @return The new ATMState, can be null if this action is not valid in the current state or the PIN is incorrect
     */
    ATMState insertPin(int pin);

    /**
     * Request a given amount of money
     * @param request The amount of money
     * @return The new ATMState, can be null if this action is not valid in the current state or if the money is not available
     */
    ATMState requestAmount(int request);

    /**
     * Disable the current ATM
     * @return The new state if disabling is possible now, otherwise null
     */
    ATMState disable();

    /**
     * Enable the current ATM
     * @return The new state if enabling is possible now, otherwise null
     */
    ATMState enable();
}
