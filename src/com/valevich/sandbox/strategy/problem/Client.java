package com.valevich.sandbox.strategy.problem;

public class Client {

    public static void main(String[] args) {

        useJunior();

        useSenior();

        useBlindSenior();

    }

    /**
     * 1) Junior can't write tests and use patterns but he has these methods.
     * 2) Assume someone told junior how to use patterns. But he is still junior.
     * There is no way to add patterns using behavior to junior.
     */
    private static void useJunior() {
        Programmer junior = new JuniorProgrammer();
        junior.readDocumentation();
        junior.think();
        junior.writeCode();
    }

    /**
     * Senior does everything
     */
    private static void useSenior() {
        Programmer senior = new SeniorProgrammer();
        senior.readDocumentation();
        senior.think();
        senior.useDesignPatterns();
        senior.writeTests();
        senior.writeCode();
    }

    /**
     * Blind Senior can't read but it has this method
     * What if he received his sight? He can't do that(((
     */
    private static void useBlindSenior() {
        Programmer blindSenior = new BlindSeniorProgrammer();
        blindSenior.think();
        blindSenior.useDesignPatterns();
        blindSenior.writeTests();
        blindSenior.writeCode();
    }

}
