package MidTask;

public class List {

    int count;
    int MaxSize;
    int[] Data;

    List() {
        count = -1;
        Data = new int[MaxSize];
    }

    List(int MaxSize) {
        count = -1;
        this.MaxSize = MaxSize;
        Data = new int[MaxSize];
    }

    void push(int data) {
        if (count + 1 == MaxSize) {
            System.out.println("Array Is Full");
        } else {
            Data[++count] = data;
        }
    }

    int top() {
        return Data[count];
    }

    void Display() {
        for (int i = 0; i < MaxSize; i++) {
            System.out.print(Data[i] + " ");
        }
        System.out.println();
    }

}
