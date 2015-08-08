package main;

public class TestMain {
	
	public static void main(String[] args) {
		WriteEmail write = new WriteEmail();
		System.out.println("start");
    	write.writeEmail("funatwindsorhillstest@gmail.com", "M11cha3l", 
    			"mderryberryt@gmail.com", "test", "test email");
    	System.out.println("done");
    }

}
