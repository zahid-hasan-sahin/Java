package task;

import java.util.Arrays;
import java.util.Comparator;

public class fractionKnapsack {

    private static double getMaxValue(double[] wt, double[] val, double capacity) {
        ItemValue[] iVal = new ItemValue[wt.length];

        for (int i = 0; i < wt.length; i++) {
            iVal[i] = new ItemValue(wt[i], val[i], i);
        }

        Arrays.sort(iVal, new Comparator<ItemValue>() {
            @Override
            public int compare(ItemValue o1, ItemValue o2) {
                return o2.cost.compareTo(o1.cost);
            }
        });

        double totalValue = 0d;

        for (ItemValue i : iVal) {

            double curWt = (double) i.wt;
            double curVal = (double) i.val;

            if (capacity - curWt >= 0) {
                capacity = capacity - curWt;
                totalValue += curVal;
                System.out.println(wt[i.ind] + " " + val[i.ind] + " " + curVal);
            } else {

                double fraction = ((double) capacity / (double) curWt);
                totalValue += (curVal * fraction);
                capacity = (double) (capacity - (curWt * fraction));

                System.out.println(wt[i.ind] + " " + val[i.ind] + " " + (curVal * fraction));
                break;
            }
        }

        return totalValue;
    }

    static class ItemValue {

        Double cost;
        double wt, val;
        int ind;

        public ItemValue(double wt, double val, int ind) {
            this.wt = wt;
            this.val = val;
            this.ind = ind;
            cost = new Double((double) val / (double) wt);
        }
    }

    public static void main(String[] args) {
        double[] wt = {5, 8, 2, 7, 8};
        double[] val = {8, 9, 5, 18, 12};
        double capacity = 12;

        double maxValue = getMaxValue(wt, val, capacity);

        System.out.println("Maximum value we can obtain = " + maxValue);
    }
}
