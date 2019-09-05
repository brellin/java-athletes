package com.lambdaschool.solution;

/**
 * BaseballCreationInjection
 */
public class BaseballAthleteCreationInjector implements AthleteCreationInjector {
    @Override
    public Processor getProcess() {
        return new MyApplication(new BaseballAthleteCreationImpl(), new BaseballCourtCreationImpl());
    }
}
