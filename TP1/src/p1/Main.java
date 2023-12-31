

package p1;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount(10, "Rayen", 1000);
        b.deposit(12);
        System.out.println(b.getAccountHolderName());
        System.out.println(b.getBalance());
        System.out.println(b.getAccountNumber());
        b.withdraw(1);
    }
}
