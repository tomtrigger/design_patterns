package com.freedom.chapter_02.weatherobservable;

import com.freedom.chapter_02.weatherobservable.panel.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Observable observable;

    private float temp;

    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
