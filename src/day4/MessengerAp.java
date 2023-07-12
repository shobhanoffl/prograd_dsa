/*
You are expected to create a messaging system that supports multiple messaging services such as SMS, Email, and WhatsApp. The common behaviour is sending messages, but the implementation of sending messages varies. Implement a Java program using interfaces to model this scenario.
Create an interface called MessagingService with the following method:
sendMessage(): This method should be implemented by classes representing different messaging services.
Create three classes, SMSMessagingService, EmailMessagingService, and WhatsAppMessagingService, which implement the MessagingService interface. Implement the sendMessage() method in each class based on the specific messaging service requirements.
Write a java code to demonstrate the usage of these classes, where you create instances of each messaging service class and invoke the sendMessage() method on each instance.
 */
package day4;

interface MessagingService{
    public String sendMessage(String msg);
}

class SMSMessagingService implements MessagingService{
    int bal=125;
    @Override
    public String sendMessage(String msg) {
        return ("SMS sent : "+msg+"\n Balance messages left : "+--bal);
    }
}

class EmailMessagingService implements MessagingService{
    String id = "user@gmail.com";
    @Override
    public String sendMessage(String msg) {
        return ("Email sent : "+msg+"\n From : "+id);
    }
}

class WhatsappMessagingService implements MessagingService{
    String no = "9788795569";

    @Override
    public String sendMessage(String msg) {
        return ("Whatsapp Message sent : "+msg+"\n From No: "+no);
    }
}
public class MessengerAp {
    public static void main(String[] args) {
        SMSMessagingService sms = new SMSMessagingService();
        System.out.println(sms.sendMessage("Hello"));

        EmailMessagingService email = new EmailMessagingService();
        System.out.println(email.sendMessage("Good Morning"));

        WhatsappMessagingService wapp = new WhatsappMessagingService();
        System.out.println(wapp.sendMessage("Hai"));
    }
}
