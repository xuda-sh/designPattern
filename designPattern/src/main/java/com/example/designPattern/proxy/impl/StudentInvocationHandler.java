package com.example.designPattern.proxy.impl;

import com.example.designPattern.proxy.service.IStudentService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StudentInvocationHandler implements InvocationHandler {
    private IStudentService studentService;

    public StudentInvocationHandler(IStudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method pre");
        method.invoke(studentService,args);
        System.out.println("method end");
        return null;
    }
}
