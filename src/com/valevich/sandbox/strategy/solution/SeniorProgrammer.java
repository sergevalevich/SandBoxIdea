package com.valevich.sandbox.strategy.solution;

import com.valevich.sandbox.strategy.solution.behavior.PatternsBehavior;
import com.valevich.sandbox.strategy.solution.behavior.ReadingBehavior;
import com.valevich.sandbox.strategy.solution.behavior.TestingBehavior;

public class SeniorProgrammer extends Programmer {

    public SeniorProgrammer(PatternsBehavior patternsBehavior,
                            ReadingBehavior readingBehavior,
                            TestingBehavior testingBehavior) {

        super(patternsBehavior, readingBehavior, testingBehavior);
    }

    /**
     * Senior thinks another way
     */
    @Override
    void think() {
        System.out.println("HMM...HOW THIS TASK CAN BE DONE BETTER ?");
    }
}
