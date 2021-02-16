package com.example.designPattern.chain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/chain")
public class ChainTestController {
    @Resource
    private VerifyHandlerChain verifyHandlerChain;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public void test() {
        List<Object> params = new ArrayList<>();
        params.add("java");
        List<Object> result = verifyHandlerChain.verify(params);
        System.out.println(result);
    }
}