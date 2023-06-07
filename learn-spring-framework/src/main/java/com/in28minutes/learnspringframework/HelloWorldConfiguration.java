package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};
@Configuration
public class HelloWorldConfiguration {
   @Bean
    public String name() {
        return "Pratham";
    }

    @Bean
    public int age() {
       return 23;
    }

    @Bean
    public Person person() {
       return new Person("Jain", 22, new Address("Bareilly road", "Nainital"));
    }

    @Bean
    @Primary
    public Person person2MethodCall() {
        return new Person(name(), age(), address());  // name, age, address
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name, age, address2);
   }

    @Bean(name = "address2")
    public Address address() {
       return new Address("Himalaya farm", "Haldwani");
    }
}
