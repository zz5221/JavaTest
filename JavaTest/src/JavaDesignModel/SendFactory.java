package JavaDesignModel;

public class SendFactory {
    public static Sender produceMailSender() {

        return new MailSend();
    }

    public static Sender produceSMSSend() {
        return new SMSSend();
    }
}
