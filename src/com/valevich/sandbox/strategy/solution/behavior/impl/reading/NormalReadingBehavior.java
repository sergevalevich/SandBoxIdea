package com.valevich.sandbox.strategy.solution.behavior.impl.reading;

import com.valevich.sandbox.strategy.solution.behavior.ReadingBehavior;

public class NormalReadingBehavior implements ReadingBehavior{


    @Override
    public void read() {
        System.out.println("READING DOCS...");
    }
}
