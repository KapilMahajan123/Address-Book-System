package com.AddressBook.com;

import java.util.Scanner;

/**
 * 
 * @author Kapil
 *
 */
public class AddressBookMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome To Address Book");  //print welcome massage
		AddressBook addressBook = new AddressBook();
		Scanner scanner = new Scanner(System.in);    //Create object
		//initalize
		int Number;
		
        /**
         * Enter number 1 to add this contacts details
         * Enter number 2 to displaying contact details
         */
		do {
			System.out.println(" 1. Add Contact \n 2. Display contact \n");
			System.out.println("~Enter the  Number~: ");

			Number = scanner.nextInt();    // reading values from user

			switch (Number) {

			case 1:
				addressBook.addContact();
				break;
			case 2:
				addressBook.showContacts();
				break;
			default:
				System.out.println(" !!!Invalid Input!!! ");
				break;

			}
		} while (Number != 3);   //calling
	}

}
