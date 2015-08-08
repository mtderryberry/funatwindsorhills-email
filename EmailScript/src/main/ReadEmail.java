package main;

import java.util.*;
import javax.mail.*;

public class ReadEmail {
	
	private static String username = "funatwindsorhillstest@gmail.com";
	private static String password = "M11cha3l";
	
//	public static void main(String[] args) {
//		Properties props = new Properties();
//        props.setProperty("mail.store.protocol", "imaps");
//        try {
//            Session session = Session.getInstance(props, null);
//            Store store = session.getStore();
//            store.connect("imap.gmail.com", username, password);
//            Folder inbox = store.getFolder("INBOX");
//            inbox.open(Folder.READ_ONLY);
//            Message msg = inbox.getMessage(inbox.getMessageCount());
//            Address[] in = msg.getFrom();
//            Multipart mp = (Multipart) msg.getContent();
//            BodyPart bp = mp.getBodyPart(0);
//            
//            String sender = in[0].toString();
//            String sentDate = msg.getSentDate().toString();
//            String subject = msg.getSubject();
//            String content = bp.getContent().toString();
//
//            Email email = new Email(sender, sentDate, subject, content);
//            System.out.println(email.toString());
//            
//        } catch (Exception mex) {
//            mex.printStackTrace();
//        }
//    }
//	
	public int getMessageCount(Folder inbox, Message msg) {
		int messageCount = -1;
		try {
			messageCount = inbox.getMessageCount();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return messageCount;
	}
}
