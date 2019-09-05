package com.lambdaschool.solution;

/**
 * HockeyCreationInjection
 */
public class HockeyAthleteCreationInjector implements AthleteCreationInjector {
    @Override
    public Processor getProcess() {
        return new MyApplication(new HockeyAthleteCreationImpl(), new HockeyCourtCreationImpl());
    }
}
