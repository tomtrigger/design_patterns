package com.freedom.chapter_07.facade;

public class HomeTheaterTestDrive {

    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier("amplifier");
        Tuner tuner = new Tuner("tuner", amplifier);
        DvdPlayer dvdPlayer = new DvdPlayer("dvdPlayer", amplifier);
        Projector projector = new Projector("projector", dvdPlayer);
        TheaterLights lights = new TheaterLights("lights");
        Screen screen = new Screen("screen");
        PopcornPopper popper = new PopcornPopper("poper");

        HomeTheateFacade homeTheateFacade = new HomeTheateFacade(amplifier, tuner, dvdPlayer,
                projector, lights, screen, popper);

        homeTheateFacade.watchMovie();
        homeTheateFacade.endMovie();
    }

}
