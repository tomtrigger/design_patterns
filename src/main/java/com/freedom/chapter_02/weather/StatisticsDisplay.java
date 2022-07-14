package com.freedom.chapter_02.weather;

import com.freedom.chapter_02.weather.observer.Observer;
import com.freedom.chapter_02.weather.panel.DisplayElement;
import com.freedom.chapter_02.weather.subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;

    private float minTemp = 200;

    private float tempSum = 0.0f;

    private int numReadings;

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
