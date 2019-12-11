package lean.jean.JavaPatterns.creational.factoryMethod;

public class SenderFactory {
    public static Sender create(int type){
        if(type == 0){
            return new SmsSender();
        }else {
            return new EmailSender();
        }
    }
}
