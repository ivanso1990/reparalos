package com.reparalos.mail;

public class SendAnEmail_ {

	public static void main(String[] args) {
		EmailSenderService email = new EmailSenderService();
		try {
			email.sendEmail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
