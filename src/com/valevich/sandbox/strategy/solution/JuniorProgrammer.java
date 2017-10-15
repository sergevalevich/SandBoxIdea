package com.valevich.sandbox.strategy.solution;

import com.valevich.sandbox.strategy.solution.behavior.PatternsBehavior;
import com.valevich.sandbox.strategy.solution.behavior.ReadingBehavior;
import com.valevich.sandbox.strategy.solution.behavior.TestingBehavior;

public class JuniorProgrammer extends Programmer {

    JuniorProgrammer(PatternsBehavior patternsBehavior,
                     ReadingBehavior readingBehavior,
                     TestingBehavior testingBehavior) {

        super(patternsBehavior, readingBehavior, testingBehavior);
    }

    /**
     * Junior thinks this way
     */
    @Override
    void think() {
        System.out.println("HMM... HOW THE TASK CAN BE DONE ?");
    }
}
