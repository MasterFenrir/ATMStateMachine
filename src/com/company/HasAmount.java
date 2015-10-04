package com.company;

/**
 * Created by Sander on 4-10-2015.
 */
public class HasAmount extends AbstractATMState {

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
            instance = new HasAmount();
        }
        return instance;
    }

    /**
     * Private constructor
     */
    private HasAmount(){}


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
}
