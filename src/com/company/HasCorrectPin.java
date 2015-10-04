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
     * Private constructor
     */
    private HasCorrectPin() {
    }

    /**
     * Singleton getter
     * @return The ATM state
     */
    public static ATMState getInstance() {
        if (instance == null) {
            instance = new HasCorrectPin();
        }
        return instance;
    }

    /**
     * Request a given amount of money
     *
     * @param request The amount of money
     */
    @Override
    public void requestAmount(ATM atm, int request) {
        if(request < 50){
            System.out.println("Request granted");
            atm.setState(HasAmount.getInstance());
        } else {
            System.out.println("Not enough money");
        }
    }
}
