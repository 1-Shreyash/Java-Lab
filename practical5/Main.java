// package practical5;
// import practical5.StdException;

public class Main {
    public static void main(String[] args) {
    Student s1 = new Student("Smit", 90.0, "BE21CSy106", "Adfwe");

    try{
        if(!(s1.isCgpaValid(s1.Cgpa)))
            throw new StdException("The given Cgpa is not valid!!!");
    }
    catch(StdException e){
        System.out.println("Exception caught: "+ e);
    }
    try{
        if(!(s1.isEnrlValid(s1.EnNum)))
            throw new StdException("The given Enrollment number is not valid!!!");
    }
    catch(StdException e){
        System.out.println("Exception caught: "+ e);
    }
    try{
        if(!(s1.isPassWordValid(s1.Password)))
            throw new StdException("The given Password is not valid!!!");
    }
    catch(StdException e){
        System.out.println("Exception caught: "+ e);
    }
    }
}
