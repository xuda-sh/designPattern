package com.example.designPattern.decorator.impl;

import com.example.designPattern.decorator.service.ICar;

public class AutoCarDecorator extends CardDecorator{
    public AutoCarDecorator(ICar decoratorCar) {
        super(decoratorCar);
    }

    @Override
    public void run() {
        super.run();
        autoRun();
    }

    private void autoRun(){
        System.out.println("AutoCar is running");
    }
}
