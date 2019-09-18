package polyrun;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		Bank b=null;
		//b.getInterest();
		String atmCardBank="HDFC";
		if("HDFC".equals(atmCardBank)) {
			b=new HDFCBank();
		}else if("ICICI".equals(atmCardBank)) {
			b=new ICICIBank();
		}
		
		b.getInterest();
	}

}
