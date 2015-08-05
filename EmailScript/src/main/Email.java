package main;

public class Email {
	
	public String sender;
	public String body;
	public String dateSent;
	public String subject;
	
	public Email(String sender, String dateSent, String body, String subject) {
		this.sender = sender;
		this.body = body;
		this.dateSent = dateSent;
		this.subject = subject;
	}

	public String getSender() {
		return sender;
	}

	public String getBody() {
		return body;
	}

	public String getDateSent() {
		return dateSent;
	}

	public String getSubject() {
		return subject;
	}

	@Override
	public String toString() {
		return "Email [sender=" + sender + ", body=" + body + ", dateSent=" + dateSent + ", subject=" + subject + "]";
	}

}
