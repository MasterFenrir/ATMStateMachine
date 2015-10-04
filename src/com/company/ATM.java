package com.company;

/**
 * Created by Sander on 4-10-2015.
 */
public class ATM implements GetATMData {

    private ATMState currentState;
    private int cashInMachine;

    public ATM(){
        currentState = Idle.getInstance();
        cashInMachine = 1000;
    }

    public void insertCard(){
        currentState.insertCard(this);
    }

    public void ejectCard(){
        currentState.ejectCard(this);
    }

    public void insertPin(int pin){
        currentState.insertPin(this, pin);
    }

    public void requestAmount(int amount){
        currentState.requestAmount(this, amount);
    }

    public void disableATM(){
        currentState.disable(this);
    }

    public void enableATM(){
        currentState.enable(this);
    }

    public void setState(ATMState newState) {
            currentState = newState;
    }

    public boolean removeCash(int amount) {
        if (amount <= cashInMachine) {
            cashInMachine -= amount;
            return true;
        }
        return false;
    }

    /**
     * Get the current state the machine is in
     *
     * @return The current state of the machine
     */
    @Override
    public String getATMState() {
        return currentState.getClass().getSimpleName();
    }

    /**
     * Get the amount of money in the machine
     *
     * @return The amount of money in the machine
     */
    @Override
    public int getCashInMachine() {
        return cashInMachine;
    }
}
