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
