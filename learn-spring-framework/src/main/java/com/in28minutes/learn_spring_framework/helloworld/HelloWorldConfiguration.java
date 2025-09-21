package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Ranga";
	}

	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	@Primary
	public Person person() {
		var person = new Person("Ravi", 20, new Address("Main Street", "Utrecht"));
		return person;
	}
	
	@Bean
	@Qualifier("person2MethodCall")
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	@Qualifier("person3Parameters")
	public Person person3Parameters(String name, int age, Address address2) { //name, age, address2
		return new Person(name, age, address2);
	}
	
	@Bean(name = "address2")
	public Address address() {
		var address = new Address("Baker Street", "London");
		return address;
	}
}
