package Email;



import java.net.MalformedURLException;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class Email {

	public static void sendEmail1() throws EmailException, MalformedURLException
	{

		  // Create the attachment
		  EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath(".LOGGERS.log");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription("Loggers");
		  attachment.setName("Loggers");
		  
		  EmailAttachment attachment1 = new EmailAttachment();
		  attachment1.setPath(".extent.log");
		  attachment1.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment1.setDescription("page");
		  attachment1.setName("page");
		  
		  MultiPartEmail email = new MultiPartEmail();
		  email.setHostName("smtp.gmail.com");
		  email.setSmtpPort(465);
		  email.setAuthenticator(new DefaultAuthenticator("vpolice4@gmail.com", "vikaspolice"));
		  email.setSSLOnConnect(true);
		  
		  email.addTo("vpolice4@gmail.com");
		  email.setFrom("vpolice4@gmail.com");
		  email.setSubject("email report");
		  email.setMsg("Reports");
		  
		  
		  email.attach(attachment);
		  email.attach(attachment1);

		  // send the email
		  email.send();
	}
}


