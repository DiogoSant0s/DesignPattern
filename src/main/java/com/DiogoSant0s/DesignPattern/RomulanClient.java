package com.DiogoSant0s.DesignPattern;

public class RomulanClient extends AlienClient{
    @Override
    protected OrderingStrategy createOrderingStrategy() {return new ImpatientStrategy();}
}
