package com.valevich.sandbox.strategy.solution;

import com.valevich.sandbox.strategy.solution.behavior.PatternsBehavior;
import com.valevich.sandbox.strategy.solution.behavior.ReadingBehavior;
import com.valevich.sandbox.strategy.solution.behavior.TestingBehavior;

abstract class Programmer {

    private PatternsBehavior patternsBehavior;
    private ReadingBehavior readingBehavior;
    private TestingBehavior testingBehavior;

    /**
        If Behavior can change we don't define it statically using inheritance,
        but set proper behavior in runtime
     */
    public Programmer(PatternsBehavior patternsBehavior,
                      ReadingBehavior readingBehavior,
                      TestingBehavior testingBehavior) {

        System.out.println("Creating Programmer");

        this.patternsBehavior = patternsBehavior;
        this.readingBehavior = readingBehavior;
        this.testingBehavior = testingBehavior;
    }

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
        readingBehavior.read();
    }

    /**
     * Every programmer thinks differently
     */
    abstract void think();

    /**
     * Some programmers use design patterns
     */
    void useDesignPatterns() {
        patternsBehavior.usePatterns();
    }

    /**
     * Some programmers write tests
     */
    void writeTests() {
        testingBehavior.writeTests();
    }

    //behavior modifiers


    public void setPatternsBehavior(PatternsBehavior patternsBehavior) {
        this.patternsBehavior = patternsBehavior;
    }

    public void setReadingBehavior(ReadingBehavior readingBehavior) {
        this.readingBehavior = readingBehavior;
    }

    public void setTestingBehavior(TestingBehavior testingBehavior) {
        this.testingBehavior = testingBehavior;
    }
}
