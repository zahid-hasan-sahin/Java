package Task;

public class Three {

    static public int hocBuilder(int height) {
        if (height < 8) {
            return 0;
        }
        return hocBuilder(height - 5) + 1;
    }

    public static void main(String args[]) {
        int res = hocBuilder(20);
        System.out.println(res);
    }

}
