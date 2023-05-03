public class Time {
    int hours, minutes, seconds;

    Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    Time addT(Time t1, Time t2) {
        Time t = new Time();
        int ts = 0, tm = 0, th = 0;
        ts += (t1.seconds + t2.seconds);
        if (ts >= 60) {
            ts -= 60;
            tm += 1;
        }
        tm += t1.minutes + t2.minutes;
        if (tm >= 60) {
            tm -= 60;
            th += 1;
        }
        th += t1.hours + t2.hours;
        t.seconds = ts;
        t.minutes = tm;
        t.hours = th;
        return t;
    }

    void correct(int s) {
        this.seconds = s % 60;
        this.minutes = (s / 60) % 60;
        this.hours = (s / 3600);
    }

    Time sub(Time t1, Time t2) {
        Time t = new Time();
        int t1s = t1.seconds + t1.minutes * 60 + t1.hours * 3600;
        int t2s = t2.seconds + t2.minutes * 60 + t2.hours * 3600;
        if (t1s - t2s >= 0) {
            int sbt;
            sbt = t1s - t2s;
            t.correct(sbt);
        } else
            System.out.println("Can't Substract");
        return t;
    }

    void display() {
        System.out.println(this.hours + ":" + this.minutes + ":" + this.seconds);
    }
}

class Attendance {
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

class Employee {
    int age;
    String name, designation;
    Attendance[] A;

    Employee(String n, int a, String d, Attendance[] A2) {
        name = n;
        age = a;
        designation = d;
        A = A2;
    }

    void DISPLAY() {
        System.out.println("\n#################### Employee: " + this.name + "  ####################\n");
        System.out.println("Age :" + this.age);
        System.out.println("Designation: " + this.designation + "\n");
        System.out.println("<============= Attendace: =============>\n");
        for (Attendance a : A) {
            a.Display();
        }
        System.out.println("<=====================================>\n");
    }

    void count(int month, int year) {
        Time t = new Time();
        Time ts = new Time();
        String[] mon = new String[12];
        mon[0] = "January";
        mon[1] = "February";
        mon[2] = "March";
        mon[3] = "April";
        mon[4] = "May";
        mon[5] = "June";
        mon[6] = "July";
        mon[7] = "August";
        mon[8] = "September";
        mon[9] = "October";
        mon[10] = "November";
        mon[11] = "December";

        for (Attendance a : A) {
            if (a.month == month && a.year == year) {
                ts = t.sub(a.Tout, a.Tin);
                t = t.addT(ts, t);
            }
        }
        System.out.println("The total Time worked in " + mon[month - 1] + " month, year " + year + ",\nis: " + t.hours
                + " hours and " + t.minutes + " minutes \n");
        System.out.println("######################################################\n");
    }

    void count(int day, int month, int year) {
        Time t = new Time();

        for (Attendance a : A) {
            if (a.day == day && a.month == month && a.year == year) {
                t = t.sub(a.Tout, a.Tin);
            }
        }
        System.out.println("The total Time worked in date:" + day + ",  month "+month+", year " + year + ",\nis: " + t.hours
                + " hours and " + t.minutes + " minutes \n");
        System.out.println("######################################################\n");
    }

}