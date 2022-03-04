package com.sapient.aem.ui;

import com.sapient.aem.service.Message;

public class MessageTester {

	public static void main(String[] args) {
		Message message1= new Message(); // default constructor
		System.out.println(message1.getLocalMessage()); //Local Message
		System.out.println(Message.getGlobalMessage()); // Global Message
     
		Message message2= new Message("Customized message");
		System.out.println(message2.getLocalMessage());
		
		message1.setLocalMessage("Greetings of the day");
		System.out.println(message1.getLocalMessage());
		message2.setLocalMessage("Hi Hello Good Morning");
		System.out.println(message2.getLocalMessage());
		
		System.out.println(message1+","+message1.hashCode()); 
		System.out.println(message2+","+message2.hashCode());
		System.out.println("-----------------------------");
		String string=new String("Hi");
		/*
		 * In the String class, toString() method is already overridden. so when we place
		 * String object in println(), JVM will internally call toString() method which returns
		 * String representation of the object displaying current state.
		 */
		System.out.println(string);


	}

}
