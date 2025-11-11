class BankAccount {
    public String accountHolder = "Ravi";       // public → accessible everywhere
    private double balance = 5000;              // private → only inside class
    protected String bankName = "SBI";          // protected → same package + subclass
    String branch = "Pune";                     // default → same package

    void showDetails() {
        // Private is accessible inside the same class
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Bank: " + bankName);
        System.out.println("Branch: " + branch);
    }
}

public class AccessDemo2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        System.out.println("Public: " + acc.accountHolder);   // allowed
        // System.out.println("Private: " + acc.balance);     // not allowed
        System.out.println("Protected: " + acc.bankName);     // allowed (same file)
        System.out.println("Default: " + acc.branch);         // allowed (same file)

        acc.showDetails(); // access private through method
    }
}
