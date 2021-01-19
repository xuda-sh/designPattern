package com.example.designPattern.decorator;

import com.example.designPattern.decorator.impl.*;
import com.example.designPattern.decorator.service.ICar;

public class DecoratorTest {
    public static void main(String[] args) {
        ICar benzCar=new BenZCar();
        ICar bmwCar=new BmwCar();
        ICar teslaCar=new TeslaCar();

        CardDecorator  autoBenzCard=new AutoCarDecorator(benzCar);
        CardDecorator  flyAutoBmCard=new FlyCarDecorator(new AutoCarDecorator(bmwCar));

        benzCar.run();
        bmwCar.run();
        teslaCar.run();
        autoBenzCard.run();
        flyAutoBmCard.run();
    }
}
