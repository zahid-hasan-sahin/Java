package MidTask;

public class Five {

    static void ProcesExamResult(String[] name, int[] arr) {
        int mx = 0;
        int mn = 1000000000;
        int mnI = 0;
        int mxI = 0;
        for (int i = 0; i < arr.length; i++) {
            if (mx < arr[i]) {
                mx = arr[i];
                mxI = i;
            }
            if (mn > arr[i]) {
                mn = arr[i];
                mnI = i;
            }
        }
        System.out.println("Highest: " + name[mxI] + ",Lowest: " + name[mnI]);
    }

    public static void main(String[] args) {
        String[] name = {"Aditri", "Sammyo", "Nandan", "Riad", "Rayan"};
        int[] mid1 = {20, 10, 15, 9, 14};
        int[] mid2 = {15, 19, 14, 8, 20};
        int[] Final = {8, 12, 4, 20, 14};
        int[] lab = {14, 5, 12, 6, 20};
        int[] quiz = {12, 14, 10, 14, 1};
        ProcesExamResult(name, mid1);
        ProcesExamResult(name, mid2);
        ProcesExamResult(name, Final);
        ProcesExamResult(name, lab);
        ProcesExamResult(name, quiz);

    }
}
