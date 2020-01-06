import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import com.axiomatics.gmail.ComposeEmail;
import com.google.api.services.gmail.Gmail;

public class Test {

	public static void main(String[] args) throws IOException, MessagingException {
		// TODO Auto-generated method stub
		
		String 	pathCredentialFile 	= "client_secret.json";
		String 	to					= "philippeferron@hotmail.com";
		String 	from				= "philippe.ferron@axiomatics.com";
		String 	subject				= "Test- Compose an email";
		String 	bodyText			= "Hello World";
		String 	userId				= "me";
		
		Gmail service = ComposeEmail.getGmailService(pathCredentialFile);
		MimeMessage email = ComposeEmail.createEmail(to, from, subject, bodyText);
		ComposeEmail.sendMessage(service, userId, email);
		System.out.println("Email being sent !!!");

	}

}
