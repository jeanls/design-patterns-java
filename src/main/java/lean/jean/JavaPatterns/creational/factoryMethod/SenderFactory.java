package lean.jean.JavaPatterns.creational.factoryMethod;

public class SenderFactory {
    public static final int SMS = 0;
    public static final int EMAIL = 1;

    public static Sender create(int type) {
        if (type == 0) {
            return new SmsSender();
        } else {
            return new EmailSender();
        }
    }
}
