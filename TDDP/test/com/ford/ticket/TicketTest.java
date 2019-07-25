package com.ford.ticket;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicketTest {

	@Test
	void testUpdateDesc() {
		Ticket t1=new Ticket(100,"ticket 1 Desc");
		t1.updateDesc("Updated Description 2");
		assertEquals("Updated Description 2",t1.getDesc());
	}

}
