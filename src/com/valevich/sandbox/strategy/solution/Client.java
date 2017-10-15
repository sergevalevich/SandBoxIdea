package com.valevich.sandbox.strategy.solution;

import com.valevich.sandbox.strategy.solution.behavior.impl.patterns.AdvancedPatternsBehavior;
import com.valevich.sandbox.strategy.solution.behavior.impl.patterns.NoPatternsBehavior;
import com.valevich.sandbox.strategy.solution.behavior.impl.reading.NoReadingBehavior;
import com.valevich.sandbox.strategy.solution.behavior.impl.reading.NormalReadingBehavior;
import com.valevich.sandbox.strategy.solution.behavior.impl.testing.AdvancedTestingBehavior;
import com.valevich.sandbox.strategy.solution.behavior.impl.testing.IntermidiateTestingBehavior;
import com.valevich.sandbox.strategy.solution.behavior.impl.testing.NoTestingBehavior;

public class Client {

    public static void main(String[] args) {

        useJunior();

        useSenior();

        useBlindSenior();

    }

    /**
     * Now junior can learn patterns
     * Now we can reuse same behavior without code duplication
     */
    private static void useJunior() {
        Programmer junior = new JuniorProgrammer(
                new NoPatternsBehavior(),
                new NormalReadingBehavior(),
                new NoTestingBehavior());

        junior.readDocumentation();
        junior.think();
        junior.writeCode();

        //upgrade junior in runtime
        junior.setTestingBehavior(new IntermidiateTestingBehavior());
        junior.writeTests();

        //junior spent a lot of time in front of PC and lost his sight
        junior.setReadingBehavior(new NoReadingBehavior());
        junior.readDocumentation();//fail
    }

    /**
     * Senior does everything
     */
    private static void useSenior() {
        Programmer senior = new SeniorProgrammer(
                new AdvancedPatternsBehavior(),
                new NormalReadingBehavior(),
                new AdvancedTestingBehavior());

        senior.readDocumentation();
        senior.think();
        senior.useDesignPatterns();
        senior.writeTests();
        senior.writeCode();

    }

    /**
     * Blind Senior can't read
     */
    private static void useBlindSenior() {
        Programmer blindSenior = new SeniorProgrammer(
                new AdvancedPatternsBehavior(),
                new NoReadingBehavior(),
                new AdvancedTestingBehavior());

        blindSenior.think();
        blindSenior.useDesignPatterns();
        blindSenior.writeTests();
        blindSenior.writeCode();
    }

}
