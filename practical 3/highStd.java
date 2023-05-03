public class highStd extends stdinfo{
    String DegName, ClgName, LetNo, ExamName;
    double ExamScore;
    highStd(stdinfo s1, String degName, String clgname, String letno, String examname, double examscore){
        super(s1);
        DegName = degName;
        ClgName = clgname;
        LetNo = letno;
        ExamName = examname;
        ExamScore = examscore;
    }
    void display(){
        super.display();
        System.out.println("Degree Name: "+DegName);
        System.out.println("College Name :"+ClgName);
        System.out.println("Admission letter Number :"+LetNo);
        System.out.println("Exam Name:" + ExamName);
        System.out.println("Exam score: "+ExamScore);
        System.out.println();
    }
}
