package com.company;

/**
 * Created by Sander on 4-10-2015.
 */
public class HasCorrectPin extends AbstractATMState {

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
            instance = new HasCorrectPin();
        }
        return instance;
    }

    /**
     * Private constructor
     */
    private HasCorrectPin(){}

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
     * Request a given amount of money
     *
     * @param request The amount of money
     * @return The new ATMState, can be null if this action is not valid in the current state or if the money is not available
     */
    @Override
    public ATMState requestAmount(int request) {
        if(request < 50){
            System.out.println("Request granted");
            return HasAmount.getInstance();
        }
        System.out.println("Not enough money");
        return null;
    }
}
