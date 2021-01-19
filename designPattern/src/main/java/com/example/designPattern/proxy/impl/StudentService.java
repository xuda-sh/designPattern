package com.example.designPattern.proxy.impl;

import com.example.designPattern.proxy.service.IStudentService;

public class StudentService implements IStudentService {
    @Override
    public void insertStudent() {
        System.out.println("添加学生");
    }

    @Override
    public void deleteStudent() {
        System.out.println("删除学生");
    }
}
