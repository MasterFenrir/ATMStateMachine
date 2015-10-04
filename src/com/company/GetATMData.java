package com.company;

/**
 * Created by Sander on 4-10-2015.
 */
public interface GetATMData {

    /**
     * Get the current state the machine is in
     *
     * @return The current state of the machine
     */
    String getATMState();

    /**
     * Get the amount of money in the machine
     *
     * @return The amount of money in the machine
     */
    int getCashInMachine();

}
