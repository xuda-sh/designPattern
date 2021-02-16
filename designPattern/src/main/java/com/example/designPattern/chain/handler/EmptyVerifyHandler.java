package com.example.designPattern.chain.handler;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmptyVerifyHandler implements VerifyHandler{
    @Override
    public List<Object> verify(List<Object> allObject) {
        System.out.println("非空校验");
        return allObject;
    }
}
