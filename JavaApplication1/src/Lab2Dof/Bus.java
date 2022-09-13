package Lab2Dof;

import java.util.ArrayList;
import java.util.Scanner;

class tester {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        PremiumTravelAgency pre[] = new PremiumTravelAgency[2];
        BasicTravelAgency bas[] = new BasicTravelAgency[3];

        Bus bus[] = new Bus[10];
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter Name of the Premium Travel Agency:");
            String n = scan.nextLine();
            System.out.print("Enter Budget of the Premium Travel Agency:");
            double b = scan.nextDouble();
            scan.nextLine();
            PremiumTravelAgency ob = new PremiumTravelAgency(n, b);
            ob.Company_Id = i;
            pre[i] = ob;
            System.out.println("Travel Agency Added with id " + i + " in Premium Travel Agency");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Name of the Basic Travel Agency:");
            String n = scan.nextLine();
            System.out.print("Enter Budget of the Basic Travel Agency::");
            double b = scan.nextDouble();
            scan.nextLine();
            BasicTravelAgency ob = new BasicTravelAgency(n, b);
            ob.Company_Id = i;
            bas[i] = ob;
            System.out.println("Travel Agency Added with id " + i + " int basic Travel Agency");
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Name of the Bus:");
            String n = scan.nextLine();
            System.out.println("Enter it's Route:");
            System.out.print("    From:");
            String fr = scan.nextLine();
            System.out.print("    To:");
            String to = scan.nextLine();
            Bus ob = new Bus(n, fr, to);
            ob.company_Id = i;
            bus[i] = ob;
            System.out.println("Bus added with id " + i);
        }
        while (true) {
            System.out.println("Enter 1 for add bus to basic Travel Agency");
            System.out.println("Enter 2 for add bus to Premium Travel Agency");
            System.out.println("Enter 3 for remove bus from basic Travel Agency");
            System.out.println("Enter 4 for remove bus from Premium Travel Agency");
            System.out.println("Enter 5 for show basic Travel Agency info");
            System.out.println("Enter 6 for show Premium Travel Agency info");
            System.out.println("Enter 7 for show bus info");
            System.out.println("Enter 8 for enrollAgency");
            System.out.println("Enter 9 for show add add Budget in basic Travel Agency ");
            System.out.println("Enter 10 for show add add Budget in Premium Travel Agency ");
            System.out.println("Enter 11 for show add withdraw Budget from basic Travel Agency ");
            System.out.println("Enter 12 for show add withdraw Budget from Premium Travel Agency ");
            System.out.println("Enter -1 for exist");
            System.out.print("Enter: ");
            int in = scan.nextInt();
            if (in == 1) {
                System.out.print("Enter basic Travel Agency id:");
                int aId = scan.nextInt();
                System.out.print("Enter bus id:");
                int bId = scan.nextInt();
                bas[aId].addAffiliates(bus[bId]);
            } else if (in == 2) {
                System.out.print("Enter Premium Travel Agency id:");
                int aId = scan.nextInt();
                System.out.print("Enter bus id:");
                int bId = scan.nextInt();
                pre[aId].addAffiliates(bus[bId]);
            } else if (in == 3) {
                System.out.print("Enter basic Travel Agency id:");
                int aId = scan.nextInt();
                System.out.print("Enter bus id:");

                int bId = scan.nextInt();
                bas[aId].removeAffiliate(bus[bId].company_Name);
            } else if (in == 4) {
                System.out.print("Enter Premium Travel Agency id:");
                int aId = scan.nextInt();
                System.out.print("Enter bus id:");
                int bId = scan.nextInt();
                pre[aId].removeAffiliate(bus[bId].company_Name);
            } else if (in == 5) {
                System.out.print("Enter basic Travel Agency id:");
                int id = scan.nextInt();
                System.out.println(bas[id]);
            } else if (in == 6) {
                System.out.print("Enter Premium Travel Agency id:");
                int id = scan.nextInt();
                System.out.println(pre[id]);
            } else if (in == 7) {
                System.out.print("Enter bus id:");
                int id = scan.nextInt();
                System.out.println(bus[id]);
            } else if (in == 8) {
                System.out.print("Enter bus id:");
                int bId = scan.nextInt();
                System.out.print("Enter basic Travel Agency id:");
                int tId = scan.nextInt();
                bus[bId].enrollAgency(bas[tId], bus[bId]);
            } else if (in == 9) {
                System.out.print("Enter basic Travel Agency id:");
                int id = scan.nextInt();
                System.out.print("Enter Amount:");
                double am = scan.nextDouble();
                bas[id].addBudget(am);
            } else if (in == 10) {
                System.out.print("Enter Premium Travel Agency id:");
                int id = scan.nextInt();
                System.out.print("Enter Amount:");
                double am = scan.nextDouble();
                pre[id].addBudget(am);
            } else if (in == 11) {
                System.out.print("Enter basic Travel Agency id:");
                int id = scan.nextInt();
                System.out.print("Enter Amount:");
                double am = scan.nextDouble();
                bas[id].withdraw(am);
            } else if (in == 12) {
                System.out.print("Enter Premium Travel Agency id:");
                int id = scan.nextInt();
                System.out.print("Enter Amount:");
                double am = scan.nextDouble();
                pre[id].withdraw(am);
            } else {
                return;
            }
        }
    }
}

class Bus {

    int company_Id;
    String company_Name;
    String[] bus_Route = new String[2];

    Bus(String name, String to, String from) {
        company_Name = name;
        bus_Route[0] = to;
        bus_Route[1] = from;
    }

    String route_To() {
        return bus_Route[0];
    }

    String route_From() {
        return bus_Route[1];
    }

    void enrollAgency(BasicTravelAgency b, Bus a) {
        b.addAffiliates(a);
    }

    @Override
    public String toString() {
        return "Bus Route From " + bus_Route[1] + " to " + bus_Route[0];
    }
}

abstract class Travel_Agency {

    int Company_Id;
    String Company_Name;
    double budget;
    private String company_Status;

    void set_Company_id(int id) {
        Company_Id = id;
    }

    int get_Company_Id() {
        return Company_Id;
    }

    void set_Company_Name(String name) {
        Company_Name = name;
    }

    String get_Company_Name() {
        return Company_Name;
    }

    void set_Budget(double bud) {
        budget = bud;
    }

    double get_Budget() {
        return budget;
    }

    void set_Company_Status(String status) {
        company_Status = status;
    }

    String get_Company_Status() {
        return company_Status;
    }
}

class BasicTravelAgency extends Travel_Agency {

    ArrayList<Bus> buses = new ArrayList<Bus>();

    BasicTravelAgency(String agenName, double agenBudget) {
        this.set_Company_Status("basic");
        this.Company_Name = agenName;
        this.budget = agenBudget;
    }

    void addAffiliates(Bus obj) {

        if (buses.size() >= 5) {
            System.out.println("Limit overflow.can have at most 5 bus companies");
        } else {
            buses.add(obj);
            System.out.println("Bus Added");
        }
    }

    void showAffiliates() {
        for (int i = 0; i < buses.size(); i++) {
            System.out.println(buses.get(i).company_Name);
        }
    }

    void removeAffiliate(String s) {
        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i).company_Name.equalsIgnoreCase(s)) {
                buses.remove((int) i);
                System.out.println("Bus Removed");
                return;
            }
        }
        System.out.println("Bus not found");
    }

    void withdraw(double amount) {
        double still = get_Budget();
        if (still / 4 >= amount) {
            set_Budget((still - amount));
            System.out.println("Witdraw successful");
        } else {
            System.out.println("Range overflow.can widdraw at most:" + still / 4);
        }
    }

    void addBudget(double amount) {
        set_Budget(get_Budget() + amount);
        System.out.println("Budget Added");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < buses.size(); i++) {
            Bus ob = buses.get(i);
            sb.append(ob.company_Name + " " + ob.route_To() + " " + ob.route_From() + "\n");
        }
        return String.format(String.valueOf(sb));
    }
}

class PremiumTravelAgency extends Travel_Agency {

    ArrayList<Bus> buses = new ArrayList<Bus>();

    PremiumTravelAgency(String agenName, double agenBudget) {
        this.set_Company_Status("premium");
        this.Company_Name = agenName;
        this.budget = agenBudget;
    }

    void addAffiliates(Bus obj) {
        if (buses.size() >= 7) {
            System.out.println("Limit overflow. You can have at most 7 bus companies");
        } else {
            buses.add(obj);
            System.out.println("Bus Added");
        }
    }

    void showAffiliates() {
        for (int i = 0; i < buses.size(); i++) {
            System.out.println(buses.get(i).company_Name);
        }
    }

    void removeAffiliate(String s) {
        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i).company_Name.equalsIgnoreCase(s)) {
                buses.remove((int) i);
                System.out.println("Bus Removed");
                return;
            }
        }
        System.out.println("Bus not found");
    }

    void withdraw(double amount) {
        double still = get_Budget();
        if (still / 2 >= amount) {
            set_Budget((still - amount));
            System.out.println("Witdraw successful");
        } else {
            System.out.println("Range overflow. You can widdraw at most:" + still / 2);
        }
    }

    void addBudget(double amount) {
        set_Budget(get_Budget() + amount);
        System.out.println("Budget Added");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < buses.size(); i++) {
            Bus ob = buses.get(i);
            sb.append(ob.company_Name + " " + ob.route_To() + " " + ob.route_From() + "\n");
        }
        return String.format(String.valueOf(sb));
    }

}
