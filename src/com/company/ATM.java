package com.company;

/**
 * Created by Sander on 4-10-2015.
 */
public class ATM {

    private ATMState currentState;

    public ATM(){
        currentState = Idle.getInstance();
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
}
