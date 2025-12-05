package com.demo.test;

import java.util.Scanner;

import com.demo.services.InheritanceServices;
import com.demo.services.InheritanceServicesImpl;

public class InheritanceTypeInHibernate {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			InheritanceServices iservices = new InheritanceServicesImpl();
			int choice = 0;
			do {
				System.out.println("1. Show Single Type inheritance");
				System.out.println("2. Show Join Type inheritance");
				System.out.println("3. Show Table Type inheritance");
				System.out.println("4. Show mapped by super class inheritance");
				System.out.println("5. Exit");
				System.out.print("Enter choice : ");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					boolean status = iservices.showSingleType();
					if (status) {
						System.out.println("Check Database....");
					} else {
						System.out.println("Error in dao check dao...");
					}
					break;
				case 2:
					status = iservices.showJoinType();
					if (status) {
						System.out.println("Check Database....");
					} else {
						System.out.println("Error in dao check dao...");
					}
					break;
				case 3:
					status = iservices.showTableType();
					if (status) {
						System.out.println("Check Database....");
					} else {
						System.out.println("Error in dao check dao...");
					}
					break;
				case 4:
					status = iservices.showMappedBySuperClassType();
					if (status) {
						System.out.println("Check Database....");
					} else {
						System.out.println("Error in dao check dao...");
					}
					break;
				case 5:
					status = iservices.getMySessionFactoryClose();
					if (status) {
						System.out.println("Connection Successfully closed...");
					} else {
						System.out.println("Connection is still live!!!");
					}
					return;
				default:
					System.out.println("Invalid Choice");
				}

			} while (choice != 5);
		}

	}

}
