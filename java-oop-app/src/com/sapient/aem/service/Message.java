package com.sapient.aem.service;

public class Message {
	//IV
	private String localMessage;
	//SV
	private static String globalMessage;
	
	{
		localMessage="Local Message";
	}
	
	static {
		globalMessage="Global Messgae";
	}
	
	//default constructor
		public Message() {
			
		}
		
		
		//1-arg constructor
		public Message(String localMessage) {
			super();
			this.localMessage = localMessage;
		}
		



	@Override
		public String toString() {
			return "Message [localMessage=" + localMessage + "]";
		}


	public String getLocalMessage() {
		return localMessage;
	}

	public void setLocalMessage(String localMessage) {
		this.localMessage = localMessage;
	}

	public static String getGlobalMessage() {
		return globalMessage;
	}

	public static void setGlobalMessage(String globalMessage) {
		Message.globalMessage = globalMessage;
	}
	

}
