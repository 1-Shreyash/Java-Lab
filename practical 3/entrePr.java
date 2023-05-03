public class entrePr extends stdinfo {
    String CName, Sector;
    int NumEmp;
    double annTurn;
    entrePr(stdinfo s1, String cname, String sector, int numEmp, double annturn){
        super(s1);
        CName = cname;
        Sector = sector;
        NumEmp = numEmp;
        annTurn = annturn;
    }
    void display(){
        super.display();
        System.out.println("Company Name:"+CName);
        System.out.println("Sector :"+Sector);
        System.out.println("Number of Employees in Company:"+NumEmp);
        System.out.println("Annual Turnover of Company :"+annTurn);
        System.out.println();
    }
}
