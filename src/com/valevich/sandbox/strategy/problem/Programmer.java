package com.valevich.sandbox.strategy.problem;

abstract class Programmer {

    /**
     * Every programmer can write code
     * Assume this part will never change , so it's in the base class
     */
    void writeCode() {
        System.out.println("WRITING CODE...");
    }

    /**
     * Every programmer can read documentation
     * Assume this part will never change (but it will change)
     */
    void readDocumentation() {
        System.out.println("READING DOCUMENTATION...");
    }

    /**
     * Every programmer thinks differently
     */
    abstract void think();

    /**
     * Some programmers use design patterns
     */
    abstract void useDesignPatterns();

    /**
     * Some programmers write tests
     */
    abstract void writeTests();

}
