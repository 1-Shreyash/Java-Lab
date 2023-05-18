class BankAccount{
    static int counter1=0,counter2=0;
    int AccNum, AdharNum;
    String Name;
    double ROI, balance;
    int Type; //1 for saving acc, 2 for fd account
    int year;
    BankAccount(String name, int adharN, int type){
        Name = name;
        AdharNum = adharN;
        Type = type;
        openAccount(type);
    }
    private void openAccount(int i){
        if(i == 1){
            AccNum = 55000 + counter1;
            counter1++;
        }
        else if(i==2){
            AccNum = 11000 + counter2;
            counter2++;
        }
    }
    void deposit(double am){
        System.out.println("<----Amount deposited :"+ am+"---->");
        balance += am;
    }
    double closeAccount(){
        double b1 = balance;
        balance = 0;
        System.out.println("Amount returned :"+b1);
        return b1;
    }
    void display(){
        System.out.println("Account Number:"+AccNum);
        System.out.println("Name :"+Name);
        System.out.println("Balance: "+balance +"\n\n");
    }
}