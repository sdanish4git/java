package com.ford.arrayexample;

import com.ford.ticket.Ticket;

public class ArrayEx {

	public static void main(String[] args) {
		/*int[] myArray= {2,5,6};  // declration, construction , initialization
		
	
		for(int i=0;i<myArray.length;i++) {
			System.out.println(myArray[i]);  //i=3
		}
		*/
		
		Ticket[] ticketArray=new Ticket[10];
		ticketArray[0]=new Ticket(100,"Ticket des1");
		ticketArray[0].updateDesc("Ticket DEsc updated");
		ticketArray[1]=new Ticket(101,"Ticket des2");
		ticketArray[1].updateDesc("Ticket 101 updated");
		ticketArray[0].printTicket();
		ticketArray[1].printTicket();
		
		
	}

}
