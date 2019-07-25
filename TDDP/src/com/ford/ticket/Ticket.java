package com.ford.ticket;

public class Ticket {
	
	int ticketNumber;
	String desc;

	public Ticket(int i, String des) {
		ticketNumber=i;
		desc=des;
	}

	public void updateDesc(String newDesc) {
		desc=newDesc+"new line";
		
	}

	public Object getDesc() {
			
		return desc;
	}

}
