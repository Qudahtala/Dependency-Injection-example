package com.example.DependencyInjection00;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service("InjectedImpl")
public  class InjectedImpl  implements injectedBean{
    public void doSomthing() {
        System.out.println("Did it work?");
    }
}
