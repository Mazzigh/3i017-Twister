package TESTS;

import org.json.JSONException;

import ServiceTools.FriendTools;
import Services.Message;


public class TestMsg {
	public static void main(String [] args){
	String key="1605mtdvt5rnk-1fc6r8u8n9xj7";
	String key1="heheh";
	String text="mazigh";
	
	int id = FriendTools.getId(key1);
	//System.out.println(Message.addMessage(text, key));
	
	//System.out.println(Message.addMessage(text, "1605mtdvt5rnk-1fc6r8u8n9xj7"));
	 //System.out.println(Message.removeMessage(key, "5c7547fda5d3fd293d34f65e"));
	
		System.out.println(Message.ListMessage(key).toString());
	
	}
	
	
}
