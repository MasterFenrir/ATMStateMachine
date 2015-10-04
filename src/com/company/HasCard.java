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
     * Private constructor
     */
    private HasCard() {
    }

    /**
     * Singleton getter
     * @return The ATM state
     */
    public static ATMState getInstance() {
        if (instance == null) {
            instance = new HasCard();
        }
        return instance;
    }

    /**
     * Insert the PIN
     *
     * @param pin The PIN
     */
    @Override
    public void insertPin(ATM atm, int pin) {
        if(pin == 1234){
            System.out.println("Correct pin");
            atm.setState(HasCorrectPin.getInstance());
        } else {
            System.out.println("Incorrect pin");
        }
    }
}
