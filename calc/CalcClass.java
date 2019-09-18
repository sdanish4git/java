package calc;

public class CalcClass {
	
	//signature of method :   method name +parameter type+number of parameter+order
	//return type is not consider in overloading
	
	public void add(int n1,int n2) {
		int sum=n1+n2;
		System.out.println("Sum of two number "+sum);
	}
	
	public void add(int n1,int n2,int n3) {
		int sum=n1+n2+n3;
		System.out.println("Sum of three number "+sum);
	}
	public void add(float n1,int n2) {
		float sum=n1+n2;
		System.out.println("Sum of three number "+sum);
	}
}
