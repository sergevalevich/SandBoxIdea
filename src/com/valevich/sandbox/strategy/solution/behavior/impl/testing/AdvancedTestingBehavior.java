package com.valevich.sandbox.strategy.solution.behavior.impl.testing;

import com.valevich.sandbox.strategy.solution.behavior.TestingBehavior;

public class AdvancedTestingBehavior implements TestingBehavior {

    @Override
    public void writeTests() {
        System.out.println("WRITING ADVANCED TESTS...");
    }
}
