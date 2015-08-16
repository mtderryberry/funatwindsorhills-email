package main;

public class Parse {
	
	public void parseEmail(Email currentEmail) {
//		System.out.println(currentEmail.getSubject());
		String body = currentEmail.body;
		//Get everything after check in
		String[] substring = body.split("Check In");
		String[] nextstring = substring[1].split(":");
		//Get just the check in date
		String[] thirdString = nextstring[1].split("Check");
		//Remove all returns
		for(int i = 0; i<thirdString.length; i++) {
			thirdString[i] = thirdString[i].replaceAll("[\n\r]", " ");
		}
		//Get strings separated by spaces
		String[] dateString = thirdString[0].split(" ");
		
		int flag = 0;
		Utils utility = new Utils();
		System.out.println(dateString[1]);
		if(utility.isDayOfWeek(dateString[1])) {
			flag = 1;
		}
		
		DateGenerator gen = new DateGenerator();
		System.out.println("Date String: "+ thirdString[0]);
		int month;
		int day;
		int year;
		if(flag == 0) {
			month = gen.getMonth(dateString, 1);
			day = gen.getDay(dateString, 2);
			year = gen.getYear(dateString, 3);
		}
		else {
			month = gen.getMonth(dateString, 3);
			day = gen.getDay(dateString, 2);
			year = gen.getYear(dateString, 4);
		}
		Date currentDate = new Date(month, day, year);
		System.out.println(currentDate.toString());
	}

}
