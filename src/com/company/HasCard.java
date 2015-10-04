package com.company;

/**
 * Created by Sander on 4-10-2015.
 */
public class HasCard extends AbstractATMState {

    /**
     * The singleton object
     */
    private static ATMState instance;

    /**
     * Singleton getter
     * @return The ATM state
     */
    public static ATMState getInstance(){
        if(instance == null){
            instance = new HasCard();
        }
        return instance;
    }

    /**
     * Private constructor
     */
    private HasCard(){}

    /**
     * Eject a card
     *
     * @return The new ATMState, can be null if this action is not valid in the current state
     */
    @Override
    public ATMState ejectCard() {
        System.out.println("Ejecting card");
        return Idle.getInstance();
    }

    /**
     * Insert the PIN
     *
     * @param pin The PIN
     * @return The new ATMState, can be null if this action is not valid in the current state or the PIN is incorrect
     */
    @Override
    public ATMState insertPin(int pin) {
        if(pin == 1234){
            System.out.println("Correct pin");
            return HasCorrectPin.getInstance();
        }
        System.out.println("Incorrect pin");
        return null;
    }
}
