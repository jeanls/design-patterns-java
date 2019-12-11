package lean.jean.JavaPatterns.creational.abstractFactory;

import lean.jean.JavaPatterns.creational.abstractFactory.interfaces.Receptor;

public class MasterCardReceptor implements Receptor {

    @Override
    public boolean receive(String message) {
        return true;
    }
}
