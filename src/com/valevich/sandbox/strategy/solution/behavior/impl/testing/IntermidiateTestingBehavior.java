package com.valevich.sandbox.strategy.solution.behavior.impl.testing;

import com.valevich.sandbox.strategy.solution.behavior.TestingBehavior;

public class IntermidiateTestingBehavior implements TestingBehavior {

    @Override
    public void writeTests() {
        System.out.println("WRITING SOME TESTS...");
    }
}
