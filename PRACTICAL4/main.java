public class main {
    public static void main(String[] args) {
        System.out.println("<----------------------SBI---------------------->");
        SavingAccount s1 = new SavingAccount("Smit",9786, 1);
        s1.deposit(3473456);
        s1.withdraw(1);
        s1.display();

        SavingAccount s2 = new SavingAccount("Sarang",97486, 1);
        s2.deposit(456);
        s2.withdraw(10);
        s2.display();

        FixedDepositAccount f1 = new FixedDepositAccount("Sahil", 786, 2, 3);
        f1.deposit(100);
        f1.updateInterest();
        f1.display();

        FixedDepositAccount f2 = new FixedDepositAccount("Sah", 786, 2, 4);
        f2.deposit(1000);
        f2.updateInterest();
        f2.display();
    }
}
