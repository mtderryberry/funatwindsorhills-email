package main;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ParseCheckOut implements Parse{
	
	public void parseEmail(Email currentEmail) {
		String body = currentEmail.body;
		//Get everything after check in
		String[] substring = body.split("Check Out");
		String[] thirdString = substring[1].split(":");
		//Remove all returns
		for(int i = 0; i<thirdString.length; i++) {
			thirdString[i] = thirdString[i].replaceAll("[\n\r]", " ");
		}
		//Get strings separated by spaces
		String[] dateString = thirdString[1].split(" ");
		
		int flag = 0;
		Utils utility = new Utils();
		if(utility.isDayOfWeek(dateString[1])) {
			flag = 1;
		}
		
		DateGenerator gen = new DateGenerator();
		System.out.println("Date String: "+ thirdString[1]);
		
		GregorianCalendar currentDate = gen.generateDate(dateString, flag);
		
		System.out.println(""+currentDate.get(Calendar.MONTH)+" "+
				currentDate.get(Calendar.DATE)+" "+currentDate.get(Calendar.YEAR));
	}

}
