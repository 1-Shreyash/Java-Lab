class A {
    public static void main(String[] args) {
        Time t1 = new Time(17, 5, 0);
        Time t2 = new Time(10, 10, 0);
        Time t3 = new Time(17, 5, 0);
        Time t = new Time();
        // t = t1.addT(t1, t2);
        // t.display();
        // t = t1.sub(t1, t2);
        // t.display();

        Attendance A1 = new Attendance(t2, t3, 19, 4, 2023);
        Attendance A2 = new Attendance(t2, t1, 3, 4, 2023);

        Attendance[] Arr = new Attendance[2];
        Arr[0] = A1;
        Arr[1] = A2;
        Employee E = new Employee("Smit", 20, "Student", Arr);
        E.DISPLAY();
        E.count(4, 2023);
        E.count(3, 4, 2023);
    }
}