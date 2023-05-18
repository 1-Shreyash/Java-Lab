public class FixedDepositAccount extends BankAccount{
    double lockedInPeriod;
    FixedDepositAccount(String name, int adharN, int type, double lockedInPeriod){
        super(name, adharN, type);
        this.lockedInPeriod = lockedInPeriod;
        if(lockedInPeriod>=1 && lockedInPeriod<2)
            ROI = 6;
        else if(lockedInPeriod>=2 && lockedInPeriod<5){
            ROI = 6.5;
        }
        else if(lockedInPeriod>=5){
            ROI = 7;
        }
    }
    void updateInterest(){
        super.balance += balance * ROI/100.0 * (lockedInPeriod);
    }
    void closeAccount(double years){
        if(years< lockedInPeriod){
            balance -= balance * 0.05;
            System.out.println("5% amount charged\n"+"Amount returned : "+balance);
        }
        else{
            System.out.println("Amount returned : "+balance);
        }
        balance=0;
            
    }
}