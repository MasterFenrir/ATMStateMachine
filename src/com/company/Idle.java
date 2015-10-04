package com.company;

/**
 * Created by Sander on 4-10-2015.
 */
public class Idle extends AbstractATMState {

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
            instance = new Idle();
        }
        return instance;
    }

    /**
     * Private constructor
     */
    private Idle(){}

    /**
     * Insert a card
     *
     * @return The new ATMState, can be null if this action is not valid in the current state
     */
    @Override
    public ATMState insertCard() {
        System.out.println("Card inserted");
        return HasCard.getInstance();
    }

    /**
     * Disable the current ATM
     *
     * @return The new state if disabling is possible now, otherwise null
     */
    @Override
    public ATMState disable() {
        System.out.println("Disabling the ATM");
        return OutOfService.getInstance();
    }
}
