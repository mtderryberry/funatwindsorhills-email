package main;

public class DateGenerator {
	
	public int getMonth(String[] monthstring, int index) {
		
		int month = 0;
		String currentMonth = monthstring[index];
		switch(currentMonth) {
		case "Jan": case "January":
			month = 1;
			break;
		case "Feb": case "February":
			month = 2;
			break;
		case "Mar": case "March":
			month = 3;
			break;
		case "Apr": case "April":
			month = 4;
			break;
		case "May":
			month = 5;
			break;
		case "Jun": case "June":
			month = 6;
			break;
		case "Jul": case "July":
			month = 7;
			break;
		case "Aug": case "August":
			month = 8;
			break;
		case "Sep": case "September":
			month = 9;
			break;
		case "Oct": case "October":
			month = 10;
			break;
		case "Nov": case "November":
			month = 11;
			break;
		case "Dec": case "December":
			month = 12;
			break;
		default:
			break;
		}
		
		return month;
		
	}
	
	public int getDay(String[] dateString, int index) {
		String dayString = dateString[index];
		return Integer.parseInt(dayString);
	}
	
	public int getYear(String[] dateString, int index) {
		String yearString = dateString[index];
		if(yearString.isEmpty()) {
			yearString = dateString[index+1];
		}
		return Integer.parseInt(yearString);
	}
	
	public Date generateDate(String[] dateString, int flag) {
		int month;
		int day;
		int year;
		if(flag == 0) {
			month = getMonth(dateString, 1);
			day = getDay(dateString, 2);
			year = getYear(dateString, 3);
		}
		else {
			month = getMonth(dateString, 3);
			day = getDay(dateString, 2);
			year = getYear(dateString, 4);
		}
		Date currentDate = new Date(month, day, year);
		return currentDate;
	}

}
