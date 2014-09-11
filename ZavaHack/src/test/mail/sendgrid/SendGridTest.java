package test.mail.sendgrid;


import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.smtp.SMTPTransport;

public class SendGridTest
{
	public static void main(String args[]) throws Exception
	{
		Properties props = System.getProperties();
		props.put("mail.smtp.host", "outlook.office365.com");
		props.put("mail.smtp.user", "gaurav.singh@kurtosys.com"); // User name
		props.put("mail.smtp.password", "dfalkfmapjpjfpadsvn"); // password
		props.put("mail.smtp.port", "465");
		props.put("mail.smtp.starttls.enable", "true"); 
		//props.put("mail.smtps.auth", "false");
		Session session = Session.getInstance(props, null);
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress("gaurav.singh@kurtosys.com"));
		msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("gaurav.singh@kurtosys.com", false));
		msg.setSubject("Test " + System.currentTimeMillis());
		msg.setText("Test");
		msg.setHeader("X-Mailer", "Gaurav's program");
		msg.setSentDate(new Date());
		Transport.send(msg);
		//SMTPTransport t = (SMTPTransport) session.getTransport("smtp");
		//t.connect();
		//t.sendMessage(msg, msg.getAllRecipients());
		//System.out.println("Response: " + t.getLastServerResponse());
		//t.close();
	}
}

