public class SimpleAccount extends Account {

    @Override
    public boolean add(long amount) {
        if (amount >= 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean pay(long amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}