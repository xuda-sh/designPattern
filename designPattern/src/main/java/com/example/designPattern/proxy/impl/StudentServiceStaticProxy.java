package com.example.designPattern.proxy.impl;

import com.example.designPattern.proxy.service.IStudentService;

public class StudentServiceStaticProxy implements IStudentService {

    private IStudentService studentService;

    public StudentServiceStaticProxy(IStudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void insertStudent() {
        System.out.println("insert pre");
        studentService.insertStudent();
        System.out.println("insert end");
    }

    @Override
    public void deleteStudent() {
        System.out.println("delete pre");
        studentService.deleteStudent();
        System.out.println("delete end");
    }
}
