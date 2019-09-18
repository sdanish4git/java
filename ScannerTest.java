import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter number 1");
		int n1=sc.nextInt();
		System.out.println("Please enter number 2");
		int n2=sc.nextInt();
		
		int sum=n1+n2;
		
		System.out.println("Give numbers sum is "+sum);
		
		System.out.println("Please enter comments");
		sc.nextLine();
		String s=sc.nextLine();
		System.out.println(s);
		
		
		
	}

}
