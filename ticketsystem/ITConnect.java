package ticketsystem;

public class ITConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket t1=new Ticket();
		
		t1.setTicketNumber("123-a");
		t1.setTicketDesc("xxx problem");
		t1.setComments("first comments");
		t1.printTicket();
		t1.updateComments("second comments");
		t1.printTicket();
		
		
	Ticket t2=new Ticket();
	t2.setTicketNumber("124-b");
	t2.setComments("xxx comments");
	t2.setCreatedBy("dshakil");
	System.out.println("####################");
	t2.printTicket();
	
		
		
		
		
	}

}
