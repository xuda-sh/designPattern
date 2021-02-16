package com.example.designPattern.chain;

import com.example.designPattern.chain.handler.VerifyHandler;
import org.apache.commons.compress.utils.Lists;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.*;

@Component
public class VerifyHandlerChain implements InitializingBean {
    @Resource
    private ApplicationContext applicationContext;

    public final List<VerifyHandler> verifyHandlerList=new ArrayList<>();
    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String,VerifyHandler> beansOfType=applicationContext.getBeansOfType(VerifyHandler.class);
        beansOfType.forEach((k,v)->verifyHandlerList.add(v));
    }

    public List<Object> verify(List<Object> allObjects){
        List<Object> result=null;
        for (VerifyHandler each:verifyHandlerList){
            result=each.verify(allObjects);
            if(CollectionUtils.isEmpty(result)){
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        VerifyHandlerChain verifyHandlerChain=new VerifyHandlerChain();
        List<Object> params= new ArrayList<>();
        params.add("java");
        List<Object> result=verifyHandlerChain.verify(params);
        System.out.println(result);
    }
}
