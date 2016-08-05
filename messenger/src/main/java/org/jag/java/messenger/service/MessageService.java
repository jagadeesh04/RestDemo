package org.jag.java.messenger.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.jag.java.messenger.database.DatabaseClass;
import org.jag.java.messenger.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService(){
		messages.put(1L, new Message(1,"Hello","jag"));
		messages.put(2L, new Message(2,"Hi","Koushik"));
	}
	
	
	public List<Message> getAllMessages(){
	
		return new ArrayList<Message>(messages.values());
	}
	
	public List<Message> getAllMessagesPaginated(int start, int stop){
		return null;
		
	}
	
	public List<Message> getAllMessagesForYear(int year){
		List<Message> messegesForYear = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		
		for(Message msg: messages.values()){
			cal.setTime(msg.getCreated());
			if(cal.get(Calendar.YEAR)==year){
				messegesForYear.add(msg);
			}
		}
		return messegesForYear;
	}
	
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message msg){
		msg.setId(messages.size()+1);
		messages.put(msg.getId(), msg);
		return msg;
	}
	
	public Message updateMessage(Message msg){
		if(msg.getId()<=0){
			return null;
		}
		messages.put(msg.getId(), msg);
		return msg;
	}
	
	public Message removeMessage(long id){
		return messages.remove(id);
	}
}
