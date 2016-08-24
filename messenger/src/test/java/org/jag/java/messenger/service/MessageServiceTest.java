package org.jag.java.messenger.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class MessageServiceTest {

	
	@Test
	public void getAllMessages_NotNull(){
		MessageService messageService = new MessageService();
		assertNotNull(messageService.getAllMessages());
	}
	
	@Test
	public void getAllMessages_returnsList(){
		MessageService messageService = new MessageService();
		
	}

	
}
