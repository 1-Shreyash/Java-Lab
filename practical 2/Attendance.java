public class Attendance {
    Time Tin = new Time();
    Time Tout = new Time();
    int day, month, year;

    Attendance(Time tin, Time tout, int d, int m, int y) {
        Tin = tin;
        Tout = tout;
        day = d;
        month = m;
        year = y;
    }

    void Display() {
        System.out.println("       ***** Date:" + this.day + "/" + this.month + "/" + this.year + " *****");
        System.out.printf("       Time in => ");
        this.Tin.display();
        System.out.printf("       Time out => ");
        this.Tout.display();
        System.out.println("       Date:" + this.day + "/" + this.month + "/" + this.year);
        System.out.println("       *************************\n");
    }
}