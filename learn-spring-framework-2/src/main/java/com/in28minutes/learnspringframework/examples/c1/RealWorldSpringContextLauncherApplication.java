package com.in28minutes.learnspringframework.examples.c1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
//class YourBusinessClass{
//    @Autowired
//    Dependency1 dependency1;
//    @Autowired
//    Dependency2 dependency2;
//    @Autowired
//    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
//        System.out.println("Constructor Injection");
//        this.dependency1 = dependency1;
//        this.dependency2 = dependency2;
//    }
//
//    public String toString() {
//        return "Using " + dependency1 + " and " + dependency2;
//    }
//}
//
//@Component
//class Dependency1{
//
//}
//
//@Component
//class Dependency2{
//
//}

@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApplication.class);) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessCalculatorService.class).findMax());
        }
    }
}
