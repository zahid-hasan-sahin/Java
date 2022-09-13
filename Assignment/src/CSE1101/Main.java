package CSE1101;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

class Bus {
    
    int regNo;
    String busName;
    int routeNo;
    String departureStop;
    String arrivalStop;
    
    public Bus(int regNo, String busName, int routeNo, String departureStop, String arrivalStop) {
        this.regNo = regNo;
        this.busName = busName;
        this.routeNo = routeNo;
        this.departureStop = departureStop;
        this.arrivalStop = arrivalStop;
    }
    
    public int getRegNo() {
        return regNo;
    }
    
    public String getBusName() {
        return busName;
    }
    
    public int getRouteNo() {
        return routeNo;
    }
    
    public String getDepartureStop() {
        return departureStop;
    }
    
    public String getArrivalStop() {
        return arrivalStop;
    }
    
    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }
    
    public void setBusName(String busName) {
        this.busName = busName;
    }
    
    public void setRouteNo(int routeNo) {
        this.routeNo = routeNo;
    }
    
    public void setDepartureStop(String departureStop) {
        this.departureStop = departureStop;
    }
    
    public void setArrivalStop(String arrivalStop) {
        this.arrivalStop = arrivalStop;
    }
    
}

class Main {
    
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("buses.dat");
        
        DataOutputStream wr = new DataOutputStream(f);
        ArrayList<Bus> buses = new ArrayList<>();
        Bus ob1 = new Bus(1, "Bus1", 3, "A", "B");
        buses.add(ob1);
        
        Bus ob2 = new Bus(2, "Bus2", 4, "B", "A");
        buses.add(ob2);
        for (int i = 0; i < buses.size(); i++) {
            Bus ob = buses.get(i);
            String out = ob.getRegNo() + " " + ob.getBusName() + " " + ob.getRouteNo() + " " + ob.getDepartureStop() + " " + ob.getArrivalStop();
            wr.writeBytes(out + "\n");
        }
        wr.flush();
        wr.close();
        
    }
}
