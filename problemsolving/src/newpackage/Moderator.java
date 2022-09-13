package newpackage;

public class Moderator {

    static Bag makeOrder(String t) {
        switch (t) {
            case "type1":
                return new Type1();
            case "type2":
                return new Type2();
            case "type3":
                return new Type3();
        }
        return null;
    }
}
