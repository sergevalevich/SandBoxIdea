package com.valevich.sandbox.strategy.problem;

public class SeniorProgrammer extends Programmer {

    /**
     * Senior thinks another way
     */
    @Override
    void think() {
        System.out.println("HMM...HOW THIS TASK CAN BE DONE BETTER ?");
    }

    /**
     * Assume Senior uses patterns
     */
    @Override
    void useDesignPatterns() {
        System.out.println("USING DESIGN PATTERNS...");
    }

    /**
     * Assume Senior writes tests
     */
    @Override
    void writeTests() {
        System.out.println("WRITING TESTS...");
    }
}
