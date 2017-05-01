package com.shailesh.jfairy;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;

public class CreateFakeData {

	public static void main(String[] args) {
		Fairy fairy = Fairy.create();
		Person person = fairy.person();
		
		System.out.println("person.getFullName() : "+person.getFullName());
		System.out.println("person.getEmail() : "+person.getEmail());
		System.out.println("person.getTelephoneNumber() : "+person.getTelephoneNumber());

	}

}
