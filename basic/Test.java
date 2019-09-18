package basic;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[3];
		int i=10;
		int j=2;
		System.out.println("Before array print");
		
		try {
			
			System.out.println(i/j);
			//throw new Exception();
			
		}catch(Exception ex) {
			System.out.println("handled by runtimeEx");
			
		}finally {
			System.out.println("I am finally Block");
		}
		
		System.out.println("After array print");
	}

}
