package basic;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//constructor is special type of method which is having 
		//same of class Name, does not have return type and automatically called when you are creating object
		Human h1=new Human(4,"Female");
		
		
		System.out.println("this is H1");
		System.out.println(h1.getGender());
		System.out.println(h1.getHeight());
	
		Human h2=new Human();
		System.out.println("this is H2");
		System.out.println(h2.getGender());
		System.out.println(h2.getHeight());

	}

}
