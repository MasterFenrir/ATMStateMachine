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
     * Singleton getter
     * @return The ATM state
     */
    public static ATMState getInstance(){
        if(instance == null){
            instance = new OutOfService();
        }
        return instance;
    }

    /**
     * Private constructor
     */
    private OutOfService(){}

    /**
     * Enable the current ATM
     *
     * @return The new state if enabling is possible now, otherwise null
     */
    @Override
    public ATMState enable() {
        System.out.println("Enabling the ATM");
        return Idle.getInstance();
    }
}
