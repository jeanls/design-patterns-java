package lean.jean.JavaPatterns.structural.proxy;

import lean.jean.JavaPatterns.structural.proxy.interfaces.Account;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AccountProxy implements Account {

    private Account account;

    @Override
    public void deposit(double value) {
        account.deposit(value);
    }

    @Override
    public void removal(double value) {
        account.removal(value);
    }

    @Override
    public double getAmount() {
        return account.getAmount();
    }
}
