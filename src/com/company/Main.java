package com.company;

public class Main {

    public static void main(String[] args) {
        ATM atm = new ATM();

        System.out.println("Test where everything goes well");
        atm.insertCard();
        atm.insertPin(1234);
        atm.requestAmount(30);
        atm.ejectCard();
        atm.disableATM();
        atm.enableATM();

        System.out.println("\nTest incorrect inputs");
        atm.insertCard();
        atm.insertPin(1235);
        atm.insertPin(1234);
        atm.requestAmount(100);
        atm.ejectCard();

        System.out.println("\nTry unavailable actions at the start");
        atm.insertPin(1234);
        atm.ejectCard();
        atm.requestAmount(30);

        System.out.println("\nTry unavailable actions after insert");
        atm.insertCard();
        atm.insertCard();
        atm.requestAmount(40);
        atm.disableATM();
        atm.enableATM();
        atm.ejectCard();

        System.out.println("\nTry unavailable actions after correct pin");
        atm.insertCard();
        atm.insertPin(1234);
        atm.insertPin(1234);
        atm.insertCard();
        atm.disableATM();
        atm.enableATM();
        atm.ejectCard();

        System.out.println("\nTry unavailable actions after a request has been granted");
        atm.insertCard();
        atm.insertPin(1234);
        atm.requestAmount(30);
        atm.insertCard();
        atm.insertPin(1234);
        atm.requestAmount(30);
        atm.disableATM();
        atm.enableATM();
        atm.ejectCard();
    }
}
