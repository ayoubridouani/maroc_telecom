import java.util.Calendar;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;  
  
public class SendMail {  
	public SendMail(String toEmail) {
		
	  final String senderEmail="your_email@gmail.com" ;
	  final String password="your_password";
  
	  Properties props = new Properties();  
	  props.put("mail.smtp.auth", "true"); 
	  props.put("mail.smtp.starttls.enable", "true"); 
	  props.put("mail.smtp.host","smtp.gmail.com"); 
	  props.put("mail.smtp.user",senderEmail); 
	  props.put("mail.smtp.password",password); 
	  props.put("mail.smtp.port",587);
    
	  Session session = Session.getInstance(props,new javax.mail.Authenticator() {  
      protected PasswordAuthentication getPasswordAuthentication() {  
    	  return new PasswordAuthentication(senderEmail,password);  
      }  
    });  
  
	  //Compose the message  
	  try {  
		  MimeMessage message = new MimeMessage(session);  
		  message.setFrom(new InternetAddress(senderEmail));  
		  message.addRecipient(Message.RecipientType.TO,new InternetAddress(toEmail));  
		  message.setSubject("Payement Succes");  
		  message.setContent("<html><head><title>Success Payement</title><style>@font-face { font-family: 'Loved by the King'; font-style: normal; font-weight: 400; src: url('https://s3-us-west-2.amazonaws.com/lob-assets/LovedbytheKing.ttf') format('truetype'); }*, *:before, *:after { -webkit-box-sizing: border-box; -moz-box-sizing: border-box; box-sizing: border-box; }  body { width: 8.5in; height: 11in; margin: 0; padding: 0; font-family: sans-serif; }  .page { page-break-after: always; }  .page-content { position: relative; width: 7in; height: 10.625in; left: 0.75in; top: 0.1875in; }  #logo { position: absolute; right: 0; }  .wrapper { position: absolute; top: 2.75in; }  .signature { font-family: 'Loved by the King'; font-size: 45px; }</style></head><body><div class='page'><div class='page-content'> <div class='wrapper'><p>"+Calendar.getInstance().getTime()+"</p><p>Dear Client,</p><p>Thank you for your purcharse !</p><p>Your order is #10222354789</p><p>You will receive an order confirmation email with details of your order and a link to track its progress .</p><p>Your order will be processed as soon as payement has been received. Please make cheques payable to Maroc Telecom Inc.</p><p class='signature'>Maroc Telecom</p></div></div></div></body></html>","text/html");
    //send the message  
		  Transport.send(message);  
  
    // System.out.println("message sent successfully...");  
   
     } 
	  catch(MessagingException e) {
		  
	  }  
 }  
}  
