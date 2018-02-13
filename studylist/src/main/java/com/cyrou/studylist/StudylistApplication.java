package com.cyrou.studylist;

import com.cyrou.studylist.beans.UserDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StudylistApplication {

	public static void main(String[] args) {


		ApplicationContext ctx = SpringApplication.run(StudylistApplication.class, args);

		UserDataSource userDataSource = ctx.getBean(UserDataSource.class);

		System.out.println(userDataSource.getUsername());

	}
}
