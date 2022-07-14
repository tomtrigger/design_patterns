package com.freedom.chapter_02.weather;

import com.freedom.chapter_02.weather.observer.Observer;
import com.freedom.chapter_02.weather.subject.Subject;

import java.util.ArrayList;
import java.util.Objects;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;

    private float temp;

    private float humidity;

    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (Objects.nonNull(observer)) {
            synchronized (this) {
                observers.add(observer);
            }
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        synchronized (this) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(temp, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
