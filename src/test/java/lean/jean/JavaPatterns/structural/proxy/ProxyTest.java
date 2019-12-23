package lean.jean.JavaPatterns.structural.proxy;

import lean.jean.JavaPatterns.structural.proxy.interfaces.Account;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProxyTest {

    @Test
    public void test(){
        Account account = new AccountDefault();
        Account accountProxy = new AccountProxy(account);
        accountProxy.deposit(10);
        assertEquals(10, accountProxy.getAmount(), 0.0);
    }

}