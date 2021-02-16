package com.example.designPattern.chain.handler;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SexyVerifyHandler implements VerifyHandler {
    @Override
    public List<Object> verify(List<Object> allObject) {
        System.out.println("敏感词校验");
        return allObject;
    }
}
