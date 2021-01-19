package com.example.designPattern.proxy;

import com.example.designPattern.proxy.impl.StudentInvocationHandler;
import com.example.designPattern.proxy.impl.StudentService;
import com.example.designPattern.proxy.service.IStudentService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        IStudentService studentService = new StudentService();
        InvocationHandler studentInvocationHandler = new StudentInvocationHandler(studentService);
        IStudentService studentServiceProxy= (IStudentService) Proxy.newProxyInstance(studentInvocationHandler.getClass().getClassLoader(), studentService.getClass().getInterfaces(),studentInvocationHandler);
        studentServiceProxy.insertStudent();
        studentServiceProxy.deleteStudent();


    }
}
