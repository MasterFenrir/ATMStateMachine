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
        if(tmp != null){
            currentState = tmp;
        }
    }

    public void ejectCard(){
        ATMState tmp = currentState.ejectCard();
        if(tmp != null){
            currentState = tmp;
        }
    }

    public void insertPin(int pin){
        ATMState tmp = currentState.insertPin(pin);
        if(tmp != null){
            currentState = tmp;
        }
    }

    public int requestAmount(int amount){
        ATMState tmp = currentState.requestAmount(amount);
        if(tmp != null){
            currentState = tmp;
            return amount;
        }
        return 0;
    }

    public void disableATM(){
        ATMState tmp = currentState.disable();
        if(tmp != null){
            currentState = tmp;
        }
    }

    public void enableATM(){
        ATMState tmp = currentState.enable();
        if(tmp != null){
            currentState = tmp;
        }
    }
}
