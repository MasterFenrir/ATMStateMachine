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
     * Private constructor
     */
    private Idle() {
    }

    /**
     * Singleton getter
     *
     * @return The ATM state
     */
    public static ATMState getInstance() {
        if (instance == null) {
            instance = new Idle();
        }
        return instance;
    }

    /**
     * Insert a card
     *
     */
    @Override
    public void insertCard(ATM atm) {
        System.out.println("Card inserted");
        atm.setState(HasCard.getInstance());
    }


    @Override
    public void ejectCard(ATM atm) {
        printError();
    }

    /**
     * Disable the current ATM
     *
     */
    @Override
    public void disable(ATM atm) {
        System.out.println("Disabling the ATM");
        atm.setState(OutOfService.getInstance());
    }
}
