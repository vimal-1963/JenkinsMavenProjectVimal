package com.vimal.maven.project;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VimalMavenProjectJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(VimalMavenProjectJenkinsApplication.class, args);
		//Show Greeting
				Calendar c = Calendar.getInstance();
				int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
		 
				if(timeOfDay >= 0 && timeOfDay < 12){
					System.out.println("Good Morning Vimal Welcome to COMP367");       
				}else if(timeOfDay >= 12 && timeOfDay < 16){
					System.out.println("Good Afternoon Vimal Welcome to COMP367");
				}else if(timeOfDay >= 16 && timeOfDay < 21){
					System.out.println("Good Evening Vimal Welcome to COMP367");
				}else if(timeOfDay >= 21 && timeOfDay < 24){
					System.out.println("Good Night Vimal Welcome to COMP367");
				}
	}

}
