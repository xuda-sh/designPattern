package com.example.designPattern.decorator.impl;

import com.example.designPattern.decorator.service.ICar;

public class BmwCar implements ICar {
    @Override
    public void run() {
        System.out.println("Bmw is running");
    }
}
