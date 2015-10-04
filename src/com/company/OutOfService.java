package com.company;

/**
 * Created by Sander on 4-10-2015.
 */
public class OutOfService extends AbstractATMState {

    /**
     * The singleton object
     */
    private static ATMState instance;

    /**
     * Private constructor
     */
    private OutOfService() {
    }

    /**
     * Singleton getter
     * @return The ATM state
     */
    public static ATMState getInstance() {
        if (instance == null) {
            instance = new OutOfService();
        }
        return instance;
    }

    /**
     * Enable the current ATM
     *
     * @return The new state if enabling is possible now, otherwise null
     */
    @Override
    public void enable(ATM atm) {
        System.out.println("Enabling the ATM");
        atm.setState(Idle.getInstance());
    }
}
