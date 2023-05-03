public class Employee {
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