package com.bulder.practice;

public class Main {
	public static void main(String[] args) {
		
	
	User user = new User.userBuilder()
			.setAge(20)
			.setId(22)
			.setName("Tushar")
			.build();
			
	
	System.out.println("is "+user);

}

}