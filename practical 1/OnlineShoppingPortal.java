public class OnlineShoppingPortal {
    double checkout(double amount){
        double disam;
        if(amount>1000){
            disam = 0.7 * amount;
        }
        else{
            disam = 0.8 * amount;
        }
        System.out.println("Original amount:"+amount);
        System.out.println("Discounted amount:"+disam);
        return disam;
    }
    double checkout(double amount, String promocode){
        double disam = amount;
        if(promocode.equals("GET10")){
            if(amount<500)
                disam = amount-10;
            else
                disam = amount * 0.9;
        }
        System.out.println("Original amount:"+amount);
        System.out.println("Discounted amount:"+disam);
        return disam;
    }
}