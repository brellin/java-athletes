package com.lambdaschool.solution;

/**
 * RugbyCreationInjection
 */
public class RugbyAthleteCreationInjector implements AthleteCreationInjector {
    @Override
    public Processor getProcess() {
        return new MyApplication(new RugbyAthleteCreationImpl(), new RugbyCourtCreationImpl());
    }
}
