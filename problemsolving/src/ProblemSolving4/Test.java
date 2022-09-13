package ProblemSolving4;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Test {

    String building, day, intake, room_no, schedule, section, subject_code, teacher_code;

    Test(String Building, String Day, String Intake, String Room_No,
            String Schedule, String Section, String Subject_Code,
            String Teacher_Code) {

        building = Building;
        day = Day;
        intake = Intake;
        room_no = Room_No;
        schedule = Schedule;
        section = Section;
        subject_code = Subject_Code;
        teacher_code = Teacher_Code;

    }

    public static boolean isBetween(LocalTime candidate, LocalTime start, LocalTime end) {
        return !candidate.isBefore(start) && !candidate.isAfter(end);
    }

    public static void main(String args[]) {

        ArrayList<Test> list = new ArrayList<Test>();

        list.add(new Test("", "Saturday", "", "", "08:30 AM to 09:30 AM", "", "", ""));
        list.add(new Test("", "Saturday", "", "", "09:35 AM to 10:35 AM", "", "", ""));
        list.add(new Test("", "Saturday", "", "", "09:35 AM to 10:35 AM", "", "", ""));
        list.add(new Test("", "Saturday", "", "", "11:45 AM to 12:45 PM", "", "", ""));
        list.add(new Test("", "Saturday", "", "", "01:15 PM to 02:15 PM", "", "", ""));
        list.add(new Test("", "Saturday", "", "", "02:20 PM to 03:20 PM", "", "", ""));
        list.add(new Test("", "Saturday", "", "", "03:25 PM to 04:25 PM", "", "", ""));
        list.add(new Test("", "Saturday", "", "", "04:30 PM to 05:30 PM", "", "", ""));

        list.add(new Test("", "Sunday", "", "", "12:00 AM to 09:30 AM", "", "", ""));
        list.add(new Test("", "Sunday", "", "", "09:35 AM to 10:35 AM", "", "", ""));
        list.add(new Test("", "Sunday", "", "", "10:40 AM to 11:40 AM", "", "", ""));
        list.add(new Test("", "Sunday", "", "", "11:45 AM to 12:45 PM", "", "", ""));
        list.add(new Test("B-3", "Sunday", "37", "601", "12:00 PM to 2:30 PM", "3", "CSE 313", "NAF"));
        list.add(new Test("B-2", "Sunday", "37", "218", "02:20 PM to 03:20 PM", "3", "CSE 327", "SCK"));
        list.add(new Test("B-1", "Sunday", "37", "302", "03:25 PM to 04:25 PM", "3", "CSE 327", "SCK"));

        ArrayList<Test> newList = new ArrayList<Test>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).building != "" && list.get(i).subject_code != "") {
                newList.add(list.get(i));
            }
        }
        LocalTime time = LocalTime.now();  
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();   
        String s = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());
        for (int i = 0; i < newList.size(); i++) {
            String[] temp = newList.get(i).schedule.split(" ");
        
            if (newList.get(i).day.equalsIgnoreCase(s) && isBetween(time, LocalTime.of(temp[1].equalsIgnoreCase("PM") ? Integer.valueOf(temp[0].split(":")[0]) + 11 : Integer.valueOf(temp[0].split(":")[0]) % 12, Integer.valueOf(temp[0].split(":")[1])), LocalTime.of(temp[4].equalsIgnoreCase("PM") ? Integer.valueOf(temp[3].split(":")[0]) + 11 : Integer.valueOf(temp[3].split(":")[0])%12, Integer.valueOf(temp[3].split(":")[1])))) {
                System.out.println("Current Class: " + newList.get(i).subject_code);
                if (newList.get(i + 1).day.equalsIgnoreCase(s)) {
                    System.out.println("Next Class: " + newList.get(i + 1).subject_code);
                } else {
                    System.out.println("This is Last Class");
                }
            }
            break;
        }

    }
}
