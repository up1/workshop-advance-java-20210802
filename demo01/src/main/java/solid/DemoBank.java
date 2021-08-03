package solid;

/**
 * 1. Transfer money in Thailand only
 * 2. Transfer money (International)
 *   - Inheritance
 *   - Interface
 */

public class DemoBank {
    public static void main(String[] args) {
        // Tell, Don't Ask
        // Local
        TransferMoneyProcess bankAccount = new LocalBankAccount();
        bankAccount.transferMoney(1000);

        // Inter
        TransferMoneyProcess interBankAccount = new InterBankAccount();
        interBankAccount.transferMoney(2000);
    }
}

enum AccountType {
    Local,
    Inter
}

interface TransferMoneyProcess {
    void transferMoney(int amount);
}

class LocalBankAccount implements  TransferMoneyProcess{
    public void transferMoney(int amount) {
        System.out.println("Transfer money in Thailand only");
        // TODO
    }
}

class InterBankAccount implements TransferMoneyProcess {
    public void transferMoney(int amount) {
        System.out.println("Transfer money (International)");
        // TODO
    }
}

class InterV2BankAccount implements TransferMoneyProcess {
    public void transferMoney(int amount) {
        System.out.println("Transfer money (International V2)");
        // TODO
    }
}

class XXXBankAccount implements TransferMoneyProcess {
    public void transferMoney(int amount) {
        System.out.println("Transfer money (XXX)");
        // TODO
    }
}
