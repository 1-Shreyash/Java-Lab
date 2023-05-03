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