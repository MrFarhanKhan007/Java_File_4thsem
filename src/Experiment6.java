class Experiment6sample {
    private String nameOfDepositor;
    private String accountType;
    private double balanceAmount;

    public Experiment6sample(String name, String type, double balance) {
        nameOfDepositor = name;
        accountType = type;
        balanceAmount = balance;
    }

    public void deposit(double amount) {
        balanceAmount += amount;
    }

    public void withdraw(double amount) {
        if (balanceAmount - amount >= 500) {
            balanceAmount -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void display() {
        System.out.println("Name of Depositor: " + nameOfDepositor);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance Amount: " + balanceAmount);
    }
}

public class Experiment6 {
    public static void main(String[] args) {
        Experiment6sample e11 = new Experiment6sample("Farhan", "Savings", 50000);
        e11.deposit(1000);
        e11.withdraw(1000);
        e11.display();
    }
}
