package com.lambdaschool.solution;

/**
 * TrackCreationInjection
 */
public class TrackAthleteCreationInjector implements AthleteCreationInjector {
    @Override
    public Processor getProcess() {
        return new MyApplication(new TrackAthleteCreationImpl(), new TrackCourtCreationImpl());
    }
}
