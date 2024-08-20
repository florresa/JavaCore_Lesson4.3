import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    void simpleAccountAddTest() {
        Account simple = new SimpleAccount();
        simple.add(10000);
        Assertions.assertEquals(simple.balance, 10000);
    }


    @Test
    void simpleAccountPayTest() {
        Account simple = new SimpleAccount();
        simple.add(10000);
        simple.pay(5000);
        Assertions.assertEquals(simple.balance, 5000);
    }

    @Test
    void simpleAccountAddAmountBelowZeroTest() {
        Account simple = new SimpleAccount();
        simple.add(8000);
        simple.add(-2000);
        Assertions.assertEquals(simple.balance, 8000);
    }

    @Test
    void simpleAccountAddAmountIsZeroTest() {
        Account simple = new SimpleAccount();
        simple.add(7000);
        simple.add(0);
        Assertions.assertEquals(simple.balance, 7000);
    }

    @Test
    void simpleAccountPayIfAmountMoreThanBalanceTest() {
        Account simple = new SimpleAccount();
        simple.add(2000);
        simple.pay(5000);
        Assertions.assertEquals(simple.balance, 2000);
    }
}
