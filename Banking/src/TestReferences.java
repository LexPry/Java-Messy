public class TestReferences {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.deposit(100);

        Account a2 = new Account();
        a2.deposit(200);

        if (a1 == a2) {
            System.out.println("Equal Accounts!");
        }

        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
    }
}
