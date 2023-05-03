public class placement extends stdinfo{
    String IndName, Letno;
    int Pkg;
    placement(stdinfo s1,String indname, int pkg, String letno){
        super(s1);
        IndName = indname;
        Pkg = pkg;
        Letno = letno;
    }
    void display(){
        super.display();
        System.out.println("Industry Name: "+IndName);
        System.out.println("Package :"+Pkg);
        System.out.println("Joining letter Number :"+Letno);
        System.out.println();
    }
}
