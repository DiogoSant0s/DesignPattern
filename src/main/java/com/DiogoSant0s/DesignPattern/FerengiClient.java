package com.DiogoSant0s.DesignPattern;

public class FerengiClient extends AlienClient{
    @Override
    protected OrderingStrategy createOrderingStrategy() {return new SmartStrategy();}
}
