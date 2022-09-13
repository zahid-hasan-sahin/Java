package newpackage3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberInfo {

    void addMember(String gmail) {
        File f = new File("member_Details//" + gmail);
        f.mkdir();
    }

    void deleteMember(String gmail) {
        File f = new File("member_Details//" + gmail);
        f.delete();
    }

    boolean isExistMember(String gmail) {

        File out = new File("member_Details//" + gmail);
        if (out.isDirectory()) {
            return true;
        } else {
            return false;
        }

    }

    void setName(String gmail, String name) throws IOException {
        FileWriter fw = new FileWriter("member_Details//" + gmail + "//name.txt");
        fw.write(name);
        fw.close();
    }

    String getName(String gmail) throws IOException {
        File fw = new File("member_Details//" + gmail + "//name.txt");
        Scanner scan = new Scanner(fw);
        return scan.nextLine();

    }

    void setPhone(String gmail, String phone) throws IOException {
        FileWriter fw = new FileWriter("member_Details//" + gmail + "//phone.txt");
        fw.write(phone);
        fw.close();
    }

    String getPhone(String gmail) throws IOException {
        File fw = new File("member_Details//" + gmail + "//phone.txt");
        Scanner scan = new Scanner(fw);
        return scan.nextLine();

    }

    void setAge(String gmail, String age) throws IOException {
        FileWriter fw = new FileWriter("member_Details//" + gmail + "//age.txt");
        fw.write(age);
        fw.close();
    }

    String getAge(String gmail) throws IOException {
        File fw = new File("member_Details//" + gmail + "//age.txt");
        Scanner scan = new Scanner(fw);
        return scan.nextLine();

    }

    void setGender(String gmail, String gender) throws IOException {
        FileWriter fw = new FileWriter("member_Details//" + gmail + "//gender.txt");
        fw.write(gender);
        fw.close();
    }

    String getGender(String gmail) throws IOException {
        File fw = new File("member_Details//" + gmail + "//gender.txt");
        Scanner scan = new Scanner(fw);
        return scan.nextLine();

    }

    void setTime(String gmail, String time) throws IOException {
        FileWriter fw = new FileWriter("member_Details//" + gmail + "//time.txt");
        fw.write(time);
        fw.close();
    }

    String getTime(String gmail) throws IOException {
        File fw = new File("member_Details//" + gmail + "//time.txt");
        Scanner scan = new Scanner(fw);
        return scan.nextLine();

    }

    void setAmount(String gmail, String amount) throws IOException {
        FileWriter fw = new FileWriter("member_Details//" + gmail + "//amount.txt");
        fw.write(amount);
        fw.close();
    }

    String getAmount(String gmail) throws IOException {
        File fw = new File("member_Details//" + gmail + "//amount.txt");
        Scanner scan = new Scanner(fw);
        return scan.nextLine();

    }

    void setPayment(String gmail, String amount, String date) throws IOException {

        FileWriter fw = new FileWriter("member_Details//" + gmail + "//payment.txt", true);
        fw.write(amount + " " + date + "\r\n");
        fw.close();
    }

    ArrayList<String> getPayment(String gmail) throws IOException {
        File fw = new File("member_Details//" + gmail + "//payment.txt");
        Scanner scan = new Scanner(fw);
        ArrayList<String> pay = new ArrayList<String>();
        while (scan.hasNext()) {
            pay.add(scan.next() + " " + scan.next());
        }

        return pay;

    }

    public static void main(String args[]) throws IOException {
        MemberInfo ob = new MemberInfo();

        ob.deleteMember("sahin");
    }
}
