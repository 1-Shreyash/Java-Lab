public class SavingAccount extends BankAccount implements Debitable{
    SavingAccount(String name, int adharN, int type){
        super(name, adharN,1);
    }
    @Override
    public int withdraw(double amt){
        if(amt<=balance){
            balance -= amt;
            System.out.println("<----Amount withdrawed :"+amt+"---->");
            return 1;
        }
        else
            return 0;
    }
}