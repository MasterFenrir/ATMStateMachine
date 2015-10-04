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
        ATMState tmp = currentState.insertCard();
        setState(tmp);
    }

    public void ejectCard(){
        ATMState tmp = currentState.ejectCard();
        setState(tmp);
    }

    public void insertPin(int pin){
        ATMState tmp = currentState.insertPin(pin);
        setState(tmp);
    }

    public void requestAmount(int amount){
        ATMState tmp = currentState.requestAmount(amount);
        setState(tmp);
    }

    public void disableATM(){
        ATMState tmp = currentState.disable();
        setState(tmp);
    }

    public void enableATM(){
        ATMState tmp = currentState.enable();
        setState(tmp);
    }

    private void setState(ATMState newState){
        if(newState != null){
            currentState = newState;
        }
    }
}
