package com.valevich.sandbox.strategy.problem;

public class JuniorProgrammer extends Programmer{

    /**
     * Junior thinks this way
     */
    @Override
    void think() {
        System.out.println("HMM... HOW THE TASK CAN BE DONE ?");
    }

    /**
     * Assume Junior doesn't use patterns.
     */
    @Override
    void useDesignPatterns() {
        //OMG empty method. Something gone wrong
    }

    /**
     * Assume Junior doesn't use patterns.
     */
    @Override
    void writeTests() {
        //OMG empty method. Something gone wrong
    }
}
