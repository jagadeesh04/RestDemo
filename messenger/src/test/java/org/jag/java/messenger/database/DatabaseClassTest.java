package org.jag.java.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.jag.java.messenger.model.Message;
import org.jag.java.messenger.model.Profile;
import org.junit.Before;
import org.junit.Test;

public class DatabaseClassTest {

	Map<Long, Message> messages;
	Map<String, Profile> profiles;
	
	@Before
	public void before(){
		messages = new HashMap<>();
		profiles = new HashMap<>();
	}
	
	@Test
	public void getMessages_returns_messages(){
		
		messages.put(1L,new Message(1,"Hello","jag"));
		
	}
	
}
