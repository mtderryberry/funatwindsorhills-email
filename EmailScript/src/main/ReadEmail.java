package main;

import java.util.*;
import javax.mail.*;

public class ReadEmail {
	
	private static final String username = "funatwindsorhillstest@gmail.com";
	private static final String password = "M11cha3l";
	
	public void readEmail() {
		Properties props = new Properties();
        props.setProperty("mail.store.protocol", "imaps");
        try {
            Session session = Session.getInstance(props, null);
            Store store = session.getStore();
            store.connect("imap.gmail.com", username, password);
            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);
            for(int i = 1; i < inbox.getMessageCount()+1; i++) {
	            Message msg = inbox.getMessage(i);
	            Address[] in = msg.getFrom();
	            Multipart mp = (Multipart) msg.getContent();
	            BodyPart bp = mp.getBodyPart(0);
	            
	            String sender = in[0].toString();
	            String sentDate = msg.getSentDate().toString();
	            String subject = msg.getSubject();
	            String content = bp.getContent().toString();
	
	            Email email = new Email(sender, sentDate, subject, content);
	            Parse parser = new Parse();
	            parser.parseEmail(email);
	            //System.out.println(email.toString());
            }
            
        } catch (Exception mex) {
            mex.printStackTrace();
        }
    }
}
