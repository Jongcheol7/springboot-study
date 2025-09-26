package com.springboot.learn_jpa_and_hibernate.course.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learn_jpa_and_hibernate.course.Course;
import com.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;

@Component
//CommandLineRunner 는 스프링이 시작할때 실행하고자 할게 있을떄
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn AWS1 Now!", "in28minutes"));
		repository.save(new Course(2, "Learn AWS2 Now!", "in28minutes"));
		repository.save(new Course(3, "Learn AWS3 Now!", "in28minutes"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("in28minutes"));
		System.out.println(repository.findByName("Learn AWS2 Now!"));
	}
	
	

}

