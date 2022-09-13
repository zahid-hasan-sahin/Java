package DataStructuresAndAlgorithms.Sorting.Gready;

public class cycleDetect {

    class graph {

        int startPoint, endPoint, weigth;

        public void addGraph(int s, int e, int w) {
            startPoint = s;
            endPoint = e;
            weigth = w;
        }
    }

    public boolean checkIsContainCycle(graph[] g, int n) {
        if (g[n - 1].endPoint == 0) {
            return false;
        }
        int[] t = new int[n * 2];
        int j = 0;
        for (int i = 0; i < n * 2; i++) {
            t[i] = g[j].startPoint;
            t[i + 1] = g[j].endPoint;
            ++j;
        }
        int hare = 0, tortoise = 0;
        boolean b = false;
        while (hare < n * 2) {
            if (t[hare] == t[tortoise]) {
                b = true;
                break;
            }
        }
        return true;

    }

    public void createArrayList(graph arra[], graph ob1, graph ob2) {
        int n = arra.length;

    }

    public static void main(String args[]) {
        cycleDetect ob = new cycleDetect();
        int n = 4;
        cycleDetect.graph g[] = new cycleDetect.graph[n];
        for (int i = 0; i < n; i++) {
            g[i] = ob.new graph();
        }
        g[0].addGraph(3, 4, 2);
        g[1].addGraph(2, 1, 7);
        g[2].addGraph(8, 3, 9);
        g[3].addGraph(4, 5, 3);

    }

}
