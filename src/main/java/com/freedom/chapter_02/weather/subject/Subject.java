package com.freedom.chapter_02.weather.subject;

import com.freedom.chapter_02.weather.observer.Observer;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
