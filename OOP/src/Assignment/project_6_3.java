package Assignment;

class Time {

    private int hour;
    private int minute;

    Time() {
        hour = 0;
        minute = 0;
    }

    Time(int hour, int minute) {
        if (isValid(hour, minute)) {
            this.hour = hour;
            this.minute = minute;
        }
    }

    Time(int hour, int minute, boolean isAM) {
        if (isAM) {
            if (hour >= 0 && hour <= 12) {
                setTime(hour, minute);
            }
        } else {
            if (hour >= 13 && hour <= 23) {
                setTime(hour, minute);
            }
        }
    }

    String getTime24() {
        String h = String.valueOf(hour);
        String m = String.valueOf(minute);
        if (h.length() <= 1) {
            h = "0" + h;
        }
        if (m.length() <= 1) {
            m = "0" + m;
        }
        return h + m;
    }

    String getTime12() {
        if (hour >= 0 && hour < 12) {
            String h = String.valueOf(hour % 12);
            String m = String.valueOf(minute);
            if (h.length() <= 1) {
                h = "0" + h;
            }
            if (m.length() <= 1) {
                m = "0" + m;
            }
            return h + ":" + m + " AM";
        } else {
            String h = String.valueOf(hour % 12);
            String m = String.valueOf(minute);
            if (h.length() <= 1) {
                h = "0" + h;
            }
            if (m.length() <= 1) {
                m = "0" + m;
            }
            return h + ":" + m + " PM";
        }
    }

    private boolean isValid(int hour, int minute) {
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59) {
            return true;
        }
        return false;
    }

    public void setTime(int hour, int minute) {
        if (isValid(hour, minute)) {
            this.hour = hour;
            this.minute = minute;
        }
    }

    public void setTime(int hour, int minute, boolean isAM) {
        if (isAM) {
            if (hour >= 0 && hour <= 12) {
                setTime(hour, minute);
            }
        } else {
            if (hour >= 13 && hour <= 23) {
                setTime(hour, minute);
            }
        }
    }
}

class Tester10 {

    public static void main(String[] args) {
        Time ob1 = new Time(12, 30);
        System.out.println(ob1.getTime12());
        System.out.println(ob1.getTime24());
        System.out.println();

        Time ob2 = new Time();
        ob2.setTime(20, 20);
        System.out.println(ob2.getTime12());
        System.out.println(ob2.getTime24());
        System.out.println();

        Time ob3 = new Time();
        ob3.setTime(07, 50, true);
        System.out.println(ob3.getTime12());
        System.out.println(ob3.getTime24());
        System.out.println();

    }
}
