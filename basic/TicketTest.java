package basic;

public class TicketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket t1=new Ticket();
		t1.setTicketNumber("100");
		t1.setTicketDesc("DBA issue");
		System.out.println("TicketNumber: "+t1.getTicketNumber());
		System.out.println("TicketDesc: "+t1.getTicketDesc());
		
		Ticket t2=new Ticket();
		t2.setTicketNumber("100");
		t2.setTicketDesc("DBA issue");
		System.out.println("TicketNumber: "+t2.getTicketNumber());
		System.out.println("TicketDesc: "+t2.getTicketDesc());
	}

}
