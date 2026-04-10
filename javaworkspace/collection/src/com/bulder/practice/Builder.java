package com.bulder.practice;
class User{
	private final int age ;
	private final String name;
	private final int id;
	
	public User(userBuilder userbuilder) {
		
		this.age = userbuilder.age;
		this.name = userbuilder.name;
		this.id = userbuilder.id;
	}

	public int getAge() {
		return age;
	}

	

	public String getName() {
		return name;
	}

	

	public int getId() {
		return id;
	}
	
	
	
	@Override
	public String toString() {
		return "User age=" + this.age + ", name=" + name + ", id=" + this.id ;
	}



	public static class userBuilder {
		
		private  int age ;
		private  String name;
		private  int id;
		
		public userBuilder() {
			
		}
		public userBuilder setAge(int age) {
			this.age = age;
			return this;
		}
		
		public userBuilder setName(String name) {
			this.name = name;
			return this;
		}
		
		public userBuilder setId(int id) {
			this.id = id;
			return this;
		}
		
		public User build() {
			User user =  new User (this);
			return user;
		}
		
	}

	
}

