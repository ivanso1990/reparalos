package com.reparalos.mail;
 
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
public class EmailSenderService {
	
	private final Properties properties = new Properties();
	private Session session;
    private static final String SMTP_HOST_NAME = "smtp.1and1.es";
    private static final String SMTP_AUTH_USER = "app@reparalos.com";
    private static final String SMTP_AUTH_PWD  = "appreparalos";
    private static final String RECEPTOR = "ivan.so1990@gmail.com";
 
	private void init() {
 
		properties.put("mail.smtp.host", SMTP_HOST_NAME);
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.mail.sender",SMTP_AUTH_USER);
		properties.put("mail.smtp.user", SMTP_AUTH_USER);
		properties.put("mail.smtp.auth", "true");
 
		session = Session.getDefaultInstance(properties);
	}
 
	public void sendEmail() throws Exception{
 
		init();
		try{
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(SMTP_AUTH_USER));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(RECEPTOR));
			message.setSubject("Prueba");
			message.setText("Texto");
			Transport t = session.getTransport("smtp");
			t.connect((String)properties.get("mail.smtp.user"), SMTP_AUTH_PWD);
			t.sendMessage(message, message.getAllRecipients());
			t.close();
		}catch (MessagingException me){
			System.err.println();
			
			return;
		}
		
	}
 
}