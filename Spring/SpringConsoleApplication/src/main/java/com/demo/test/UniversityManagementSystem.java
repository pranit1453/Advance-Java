package com.demo.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.services.UMSServices;

public class UniversityManagementSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
			UMSServices uservices = (UMSServices) ctx.getBean("UMSServicesImpl");
			int choice = 0;
			do {
				System.out.println("1. Add new Course");
				System.out.println("2. Add Student details");
				System.out.println("3. Add graduation type");
				System.out.println("4. Show course");
				System.out.println("5. Show Student");
				System.out.println("6. Show Graduation Type with Student with Course");
				System.out.println("7. Modify Course details");
				System.out.println("8. Modify Student Details With graduation type");
				System.out.println("9. Delete Course with all students and type");
				System.out.println("10.Exit");
				System.out.print("Enter Choice : ");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					boolean status = uservices.addCourseDetails();
					if (status) {
						System.out.println("Course added Successfully check database");
					} else {
						System.out.println("Error!!! check dao");
					}
					break;
				}
			} while (choice != 10);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
