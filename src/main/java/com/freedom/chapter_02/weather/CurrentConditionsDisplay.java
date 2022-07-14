package com.freedom.chapter_02.weather;

import com.freedom.chapter_02.weather.observer.Observer;
import com.freedom.chapter_02.weather.panel.DisplayElement;
import com.freedom.chapter_02.weather.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temp;

    private float humidity;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp + "F degrees and " + humidity + "% humidity");
    }
}
