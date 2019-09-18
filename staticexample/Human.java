package staticexample;

public class Human {
	
	
	
	static String climate;  //  class variable/static
	
	private int age;   //object variabl/ instance variable
	private String name;
	
	
	
	

	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void rain() {
		System.out.println("Raining");
	}
	
}
