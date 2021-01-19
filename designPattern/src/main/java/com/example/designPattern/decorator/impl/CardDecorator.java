package com.example.designPattern.decorator.impl;

import com.example.designPattern.decorator.service.ICar;

public class CardDecorator implements ICar {
    protected ICar decoratorCar;

    public CardDecorator(ICar decoratorCar) {
        this.decoratorCar = decoratorCar;
    }

    @Override
    public void run() {
        decoratorCar.run();

    }
}
