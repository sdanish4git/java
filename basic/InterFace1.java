package basic;

public interface InterFace1 {
	//public static final 
	String ticketNumber="100";
	
	
	//public abstract
	public abstract void go();
	
	void method1();
	
	default void print() {
		System.out.println(" I am default method");
	}
	
	default void print1() {
		System.out.println(" I am default method");
	}
	
	public static void main(String arg[]) {
		System.out.println("I am in interface main");
	}
	
	

}
