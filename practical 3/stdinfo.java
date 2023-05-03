class stdinfo{
    String Name, Gender, DeptName;
    double Cgpa;
    stdinfo(String name, String gender, String deptName, double cgpa ){
        Name = name;
        Gender = gender;
        DeptName = deptName;
        Cgpa = cgpa;
    }
    stdinfo(stdinfo s1){
        Name = s1.Name;
        Gender = s1.Gender;
        DeptName = s1.DeptName;
        Cgpa = s1.Cgpa;
    }
    void display(){
        System.out.println("<--------------------------STUDENT INFO-------------------------->");
        System.out.println("Name :"+Name);
        System.out.println("Gender :"+Gender);
        System.out.println("Department Name :"+DeptName);
        System.out.println("Cgpa : "+Cgpa);
    }
}