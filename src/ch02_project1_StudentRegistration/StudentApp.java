package ch02_project1_StudentRegistration;

import java.util.Scanner;

public class StudentApp {

		public static void main(String[] args) {
				System.out.println("Student Registration Form");
				System.out.println();
				
				Scanner sc = new Scanner (System.in);
				
				System.out.println("Enter first name: ");
				String firstName = sc.next();
				System.out.println("Enter last name: ");
				String lastName = sc.next();
				System.out.println("Enter year of birth: ");
				int birthYear = sc.nextInt();
				
				String name = firstName + " " + lastName;
				String password = firstName + "*" + birthYear;
				
				System.out.println();
				System.out.println("Welcome "+ name + "!");
				System.out.println("Your registration is complete.");
				System.out.println("Your temporary password is " + password);
				
				sc.close();
				System.out.println();
				System.out.println("Bye!");

			}

		}


