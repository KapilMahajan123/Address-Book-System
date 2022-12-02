package com.AddressBook.com;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Kapil
 *
 */
public class AddressBook {
	
	//Creating instance object
	Scanner sc = new Scanner(System.in);
	ContactPerson contact = new ContactPerson();
	ArrayList<ContactPerson> contactsArrayList = new ArrayList<ContactPerson>();
	
	/*
	 * Adding contacts
	 */
	public void addContact() {
		ContactPerson contact = new ContactPerson();
		
		System.out.println("Enter your FirstName: ");
		contact.setFirstName(sc.next());
		System.out.println("Enter your LastName: ");
		contact.setLastName(sc.next());
		System.out.println("Enter your Email: ");
		contact.setEmail(sc.next());
		System.out.println("Enter your Address: ");
		contact.setAddress(sc.next());
		System.out.println("Enter your City: ");
		contact.setCity(sc.next());
		System.out.println("Enter your State: ");
		contact.setState(sc.next());
		System.out.println("Enter your Zipcode: ");
		contact.setZip(sc.nextInt());
		System.out.println("Enter your Mobile Number: ");
		contact.setMobile(sc.nextLong());
		
		contactsArrayList.add(contact);
	}
	/*
	 * Print out on all contacts using method contact class
	 */
	public void showContacts() {
		System.out.println(contact.toString());
		for (int i = 0; i < contactsArrayList.size(); i++) {
			ContactPerson contacts = contactsArrayList.get(i);
			System.out.println(contacts.toString());
		}
	}
	
	public void editContact() {
		/*
		 * Ability to edit existing contact person using their
		 */
		System.out.println("Enter the First Name to Edit : ");
		String FirstName = (sc.next());
		boolean IsAvaible = false;

		for (ContactPerson contact : contactsArrayList) {
			if (contact.getFirstName().equals(FirstName)) {
				IsAvaible = true;

				System.out.println("Enter your FirstName: ");
				contact.setFirstName(sc.next());
				System.out.println("Enter your LastName: ");
				contact.setLastName(sc.next());
				System.out.println("Enter your Email: ");
				contact.setEmail(sc.next());
				System.out.println("Enter your Address: ");
				contact.setAddress(sc.next());
				System.out.println("Enter your City: ");
				contact.setCity(sc.next());
				System.out.println("Enter your State: ");
				contact.setState(sc.next());
				System.out.println("Enter your Zipcode: ");
				contact.setZip(sc.nextInt());
				System.out.println("Enter your Mobile Number: ");
				contact.setMobile(sc.nextLong());
			}
		}
		/*
		 * If the condition false to have printed conatct doesnt exist
		 */
		if (IsAvaible == false) {
			System.out.println("Contact Doesn't exist.");
		}
	
	}

}
