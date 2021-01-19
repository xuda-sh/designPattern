package com.example.designPattern.decorator.impl;

import com.example.designPattern.decorator.service.ICar;

public class BenZCar implements ICar {
    @Override
    public void run() {
        System.out.println("BenZ is running");
    }
}
