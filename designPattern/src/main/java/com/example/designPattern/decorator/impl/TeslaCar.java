package com.example.designPattern.decorator.impl;

import com.example.designPattern.decorator.service.ICar;

public class TeslaCar implements ICar {
    @Override
    public void run() {
        System.out.println("TeslaCar is running");
    }
}
