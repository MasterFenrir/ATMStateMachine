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
     * Private constructor
     */
    private HasAmount() {
    }

    /**
     * Singleton getter
     * @return The ATM state
     */
    public static ATMState getInstance() {
        if (instance == null) {
            instance = new HasAmount();
        }
        return instance;
    }

}
