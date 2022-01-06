public class Program {
    public static void main(String[] args) {
        Account myAccount = new Account();
        Client myClient = new Client();
        myClient.name = "Lux";
        myClient.lastName = "B.";

        Account account = new Account(myClient);


        if (account.draw(200)) {
            System.out.println("Current balance is: " + account.getBalance());
            System.out.println("Withdrawing...");
            System.out.println(account.getBalance());
        } else {
            System.out.println("Where is my money?");
        }

        Client c1 = new Client();
        c1.name = "Olivia";

        Account a1 = new Account(c1);

        Client c2 = new Client();
        c2.name = "Fitz";
        Account a2 = new Account(199525, c2);

        int total = Account.getTotalOfAccounts();
        System.out.println("There are: " + total + " Accounts currently");

    }
}
