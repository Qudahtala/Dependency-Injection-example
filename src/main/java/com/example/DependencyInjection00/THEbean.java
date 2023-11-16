package com.example.DependencyInjection00;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class THEbean {
    private injectedBean injectedBean;
    @Autowired
    public  THEbean(@Qualifier("InjectedImpl") injectedBean afterInjection){
        this.injectedBean=afterInjection;
    }
    public void check(){
        injectedBean.doSomthing();
    }
}
