package TESTS;

import org.json.JSONObject;

import ServiceTools.FriendTools;
import ServiceTools.UserTools;
import Services.Friends;


public class TestFriend {

	public static void main(String[] args) {
		//System.out.println(FriendTools.getId("1pu7lmv716oeu"));
		JSONObject  o=Friends.AddFriend("1605mtdvt5rnk-1fc6r8u8n9xj7", 37);
		System.out.println(o.toString());
		//System.out.println((Friends.listFriend(27).toString()));
		//System.out.println("login : "+UserTools.getLogin(12));
		//System.out.println(Friends.RemoveFriend("zi6ehg2o53dg-1n1t7r8tqiiu6",12 ));

		//System.out.println(FriendTools.checkFriend(25));
	}

}
