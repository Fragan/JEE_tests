package fr.fragan.helloclasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");
 
		Person personGA = (Person) context.getBean("personGA");
		
		System.out.println(personGA);
		
		PerformActionOnPerson paopGA = (PerformActionOnPerson) context.getBean("paopGA");
		
		paopGA.setPerson(personGA);
		paopGA.printPerson();
	}

}
