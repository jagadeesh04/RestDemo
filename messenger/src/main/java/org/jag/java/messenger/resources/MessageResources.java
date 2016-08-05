package org.jag.java.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.jag.java.messenger.model.Message;
import org.jag.java.messenger.service.MessageService;

@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MessageResources {

	MessageService messageService = new MessageService();
	
	@GET 
	public List<Message> getMessages(@QueryParam("year") int year){
		if(year>0){
			return messageService.getAllMessagesForYear(year);
		}
		return messageService.getAllMessages();
	}
	

	@GET
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId") long messageId){
		return messageService.getMessage(messageId);			
	}
	
	@POST
	public Message addMessage(Message msg){
		return messageService.addMessage(msg);
	}
	
	
}
