package com.DiogoSant0s.DesignPattern;

public class StringBar extends Bar{
    @Override
    public boolean isHappyHour() {
        return getIsHappyHour();
    }
    @Override
    public void startHappyHour() {
        setIsHappyHour(true);
        notifyObservers();
    }
    @Override
    public void endHappyHour() {
        setIsHappyHour(false);
        notifyObservers();
    }
}
