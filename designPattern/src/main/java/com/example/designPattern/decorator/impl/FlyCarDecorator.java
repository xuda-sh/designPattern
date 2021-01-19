package com.example.designPattern.decorator.impl;

import com.example.designPattern.decorator.service.ICar;

public class FlyCarDecorator extends CardDecorator{
    public FlyCarDecorator(ICar decoratorCar) {
        super(decoratorCar);
    }

    @Override
    public void run() {
        decoratorCar.run();
        flyRun();
    }

    private void flyRun(){
        System.out.println("FlyCar is running");
    }
}
