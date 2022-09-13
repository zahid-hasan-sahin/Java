package Assignment;

abstract class player {

    private String name;
    private String address;
    private String number;
    private String status;

    player(String name, String address, String number, String status) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.status = status;
    }

    abstract double calculate();

    @Override
    public String toString() {
        return "Player";
    }
}

class batsman extends player {

    private int run;
    private int matches;

    public batsman(String name, String address, String number, String status, int run, int matches) {
        super(name, address, number, status);
        this.run = run;
        this.matches = matches;
    }

    @Override
    double calculate() {
        return run / (double) matches;
    }

    public String toString() {
        return "batsman";
    }
}

class bowler extends player {

    private int wickets;
    private int matches;

    public bowler(String name, String address, String number, String status, int wickets, int matches) {
        super(name, address, number, status);
        this.wickets = wickets;
        this.matches = matches;
    }

    double calculate() {
        return wickets / (double) matches;
    }

    public String toString() {
        return "bowler";
    }
}

class test {

    public static void main(String[] args) {
        batsman bat = new batsman("A", "add1", "017....", "batsman", 10, 5);
        bowler bow = new bowler("B", "add2", "018....", "bowler", 50, 5);
        System.out.println(bat.toString());
        System.out.println(bat.calculate());

        System.out.println(bow.toString());
        System.out.println(bow.calculate());
    }
}
