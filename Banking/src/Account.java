public class Account {
    public int number;
    private double balance;
    private double limit;
    private Client owner;
    private static int totalOfAccounts;

    // Constructor

    Account(Client owner) {
        this.owner = owner;
        System.out.println("Constructing an account for " + owner.name + "...");
        totalOfAccounts++;
    }

    Account(int number, Client owner) {
        this(owner);
        this.number = number;
        totalOfAccounts++;
    }

    public Account() {
        totalOfAccounts++;
    }


    // Getters and Setters

    public double getBalance() {
        return this.balance + this.limit;
    }

    public double getLimit() {
        return limit;
    }

    public Client getOwner() {
        return owner;
    }

    public static int getTotalOfAccounts() {
        return Account.totalOfAccounts;
    }

    // methods

    public boolean draw(double amount) {
        if (amount > this.balance + this.limit) {
            return false;
        } else {
            this.balance -= amount;
            return true;
        }

    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean transferTo(Account destination, double amount) {
        if (this.draw(amount)) {
            destination.deposit(amount);
            return true;
        } else {
            return false;
        }
    }

}
