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
        setState(currentState.insertCard());
    }

    public void ejectCard(){
        setState(currentState.ejectCard());
    }

    public void insertPin(int pin){
        setState(currentState.insertPin(pin));
    }

    public void requestAmount(int amount){
        setState(currentState.requestAmount(amount));
    }

    public void disableATM(){
        setState(currentState.disable());
    }

    public void enableATM(){
        setState(currentState.enable());
    }

    private void setState(ATMState newState){
        if(newState != null){
            currentState = newState;
        }
    }
}
