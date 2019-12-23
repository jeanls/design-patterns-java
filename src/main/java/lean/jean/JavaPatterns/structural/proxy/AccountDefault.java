package lean.jean.JavaPatterns.structural.proxy;

import lean.jean.JavaPatterns.structural.proxy.interfaces.Account;

public class AccountDefault implements Account {

    private double value;

    @Override
    public void deposit(double value) {
        this.value += value;
    }

    @Override
    public void removal(double value) {
        this.value -= value;
    }

    @Override
    public double getAmount() {
        return value;
    }
}
