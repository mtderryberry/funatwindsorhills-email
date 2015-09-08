package main;

import java.io.IOException;
import java.util.GregorianCalendar;

public class TestMain {
	
	public static void main(String[] args) throws IOException {
//		WriteEmail write = new WriteEmail();
//		System.out.println("start");
//    	write.writeEmail("funatwindsorhillstest@gmail.com", "M11cha3l", 
//    			"mderryberryt@gmail.com", "test", "test email");
//    	System.out.println("done");
//		ReadEmail read = new ReadEmail();
//		read.readEmail();
		Availability available = new Availability();
		GregorianCalendar checkIn = new GregorianCalendar();
		checkIn.set(2015, 9, 03);
		boolean yo = available.checkAvailability(checkIn);
    }

}
