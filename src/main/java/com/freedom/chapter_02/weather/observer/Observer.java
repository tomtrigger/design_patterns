package com.freedom.chapter_02.weather.observer;

public interface Observer {
    
    void update(float temp, float humidity, float pressure);
    
}
