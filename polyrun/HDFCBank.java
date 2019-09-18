package polyrun;

public class HDFCBank extends Bank {
	int i=20;
	public void getInterest() {
		System.out.println(super.i);
		System.out.println(i);
		System.out.println("interest rate is 10% for HDFS Bank ");
	}
}
