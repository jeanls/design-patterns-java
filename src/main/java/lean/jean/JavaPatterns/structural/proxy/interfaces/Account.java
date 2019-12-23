package lean.jean.JavaPatterns.structural.proxy.interfaces;

public interface Account {
    void deposit(double value);
    void removal(double value);

    double getAmount();
}
