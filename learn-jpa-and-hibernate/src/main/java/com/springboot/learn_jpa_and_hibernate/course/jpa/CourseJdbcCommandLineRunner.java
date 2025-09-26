package com.springboot.learn_jpa_and_hibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learn_jpa_and_hibernate.course.Course;
import com.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;

/*
@Component
//CommandLineRunner 는 스프링이 시작할때 실행하고자 할게 있을떄
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn AWS1 Now!", "in28minutes"));
		repository.insert(new Course(2, "Learn AWS2 Now!", "in28minutes"));
		repository.insert(new Course(3, "Learn AWS3 Now!", "in28minutes"));
		
		repository.deleteById(1);
//		repository.deleteById(2);
//		repository.deleteById(3);
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
	}
	
	

}
*/