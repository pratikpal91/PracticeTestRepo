package com.game.businesshouse.executor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.game.businesshouse.pojo.Hotel;
import com.game.businesshouse.pojo.Jail;
import com.game.businesshouse.pojo.Treasure;
import com.game.businesshouse.pojo.User;

public class StartBusinessGame {
	public static String[] pnt;
	public static Map<Integer, String> map;
	public static Jail jail; 
	
	public static Treasure treasure;
	
	public static Hotel hotel;
	
	public static void main(String[] args) {
		
	jail = new Jail();
	
	treasure = new Treasure();
	
	hotel = new Hotel();
	
	int players = 3;
	
	List<User> users = new ArrayList<User>();
	map = new HashMap<>();
	
	String positionType = "E,E,J,H,E,T,J,T,E,E,H,J,T,H,E,E,J,H,E,T,J,T,E,E,H,J,T,H,J,E,E,J,H,E,T,J,T,E,E,H,J,T,E,H,E";
	pnt = positionType.split(",");
	String diceoutput = "4,4,4,6,7,8,5,11,10,12,2,3,5,6,7,8,5,11,10,12,2,3,5,6,7,8,5,11,10,12";
	String[] diceMoves = diceoutput.split(",");
	
	for(int i=1; i <=players;i++)
	{
		User u= new User("Player-"+i);
		users.add(u);
	}
	
	
	
	for(int i = 0 ; i< 10 ;i++)
	{
		for(int j = i ; j<(i+3);j++)
		{
		  int temp = 0;	
		  User user = users.get(temp);
			String entity = findpositionforUser(user, Integer.parseInt(diceMoves[j]));
			
			evaluateEntityForUser(entity, user);
			
			temp++;
			
		}
		
		
		
	}
	
	List<String> list = new ArrayList<>(map.values());
	
	for(User user : users)
	{
		
		int times = Collections.frequency(list, user.getUid());
		user.setAmount(user.getAmount() + (hotel.getWorth()*times));
	}
	
	users.sort((User u1 , User u2) -> u2.getAmount()-u1.getAmount());
	
	for(User user : users)
	{
		System.out.println(user.getUid() + " has total worth "+ user.getAmount());
	}
	
	
}

	
	
public static String findpositionforUser(User user, int dice){
	
	user.setBoardposition(user.getBoardposition()+dice);
	if(user.getBoardposition() < pnt.length)
	{
	return pnt[user.getBoardposition()-1];
	}else{
		
		int position = user.getBoardposition()%pnt.length;
		
		return pnt[position -1];
		
		
	}
	
}

public static void evaluateEntityForUser(String entity, User user){
	
	switch (entity) {
	case "J":
		user.setAmount(user.getAmount() - jail.getJailFine());
		break;
	case "T":
		user.setAmount(user.getAmount() + treasure.getValue());
		break;
	case "H":
		if(map.isEmpty() || !map.containsKey(user.getBoardposition()))
		{
			map.put(user.getBoardposition(), user.getUid());
			user.setAmount(user.getAmount()-hotel.getWorth());
		}else
		{
		      	user.setAmount(user.getAmount() - hotel.getRent());
		}
		break;
	default:
		break;
	}
	
}
	

}
