package main;

public class Utils {
	
	public boolean isChar(String current) {
		return current.matches("[a-zA-z]{1}");
	}
	
	public boolean isDayOfWeek(String current) {
		switch(current){
		case "Sunday": case "Monday": case "Tuesday": case "Wednesday":
		case "Thursday": case "Friday": case "Saturday":
			return true;
		default:
			return false;
		}
	}

}
