package com.DiogoSant0s.DesignPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Bar {
    protected boolean isHappyHour;
    protected List<BarObserver> observers;
    abstract public boolean isHappyHour();
    abstract public void startHappyHour();
    abstract public void endHappyHour();
    public Bar() {
        this.isHappyHour = false;
        observers = new ArrayList<>();
    }
    public boolean getIsHappyHour() {return isHappyHour;}
    public void setIsHappyHour(boolean isHappyHour) {this.isHappyHour = isHappyHour;}
    public void addObserver(BarObserver observer) {observers.add(observer);}
    public void removeObserver(BarObserver observer) {observers.remove(observer);}
    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }
}
